package com.renalexster.example.swarm.repository;

import java.util.stream.Stream;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import com.renalexster.example.swarm.model.Client;

@Repository
public interface ClientRepository extends EntityRepository<Client, Long>{
	public Stream<Client> findAllOrderByIdDesc();
}

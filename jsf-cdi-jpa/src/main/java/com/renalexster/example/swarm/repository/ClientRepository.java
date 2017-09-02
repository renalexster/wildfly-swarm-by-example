package com.renalexster.example.swarm.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.renalexster.example.swarm.model.Client;

@ApplicationScoped
@Transactional
public class ClientRepository {

	@PersistenceContext
	private EntityManager em;
	
	public List<Client> listClient(){
		return em.createQuery("select c from Client c").getResultList();
	}
	
	public void persist(Client c) {
		em.persist(c);
	}
}

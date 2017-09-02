package com.renalexster.example.swarm.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.jboss.logging.Logger;

import com.renalexster.example.swarm.model.Client;
import com.renalexster.example.swarm.repository.ClientRepository;

@ApplicationScoped
public class ClientService {
	@Inject
    private ClientRepository repo;
	
	Logger logger = Logger.getLogger(this.getClass());
	
	@Transactional
	public void persist(Client c) {
		logger.info("Persisting client ["+c+"]");
		repo.save(c);
		if (c.getNome().equals("Teste")) throw new RuntimeException("Nome nao permitido");
		logger.info("saved ["+c+"]");
	}
	
}

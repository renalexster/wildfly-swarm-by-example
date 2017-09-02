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
	public void persist(Client c) throws Exception {
		logger.info("Persisting client ["+c+"]");
		if (c.getNome().equals("Teste")) throw new Exception("Nome nao permitido");
		repo.save(c);
		logger.info("saved ["+c+"]");
	}
	
}

package com.renalexster.example.swarm.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.jboss.logging.Logger;

import com.renalexster.example.swarm.model.Client;
import com.renalexster.example.swarm.repository.ClientRepository;

@ManagedBean
public class HomeView {
	private String msg = "Halo";
	
	Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private ClientRepository repo;
	
	@PostConstruct
	@Transactional
	private void init() {
		logger.info("Iniciando bean...");
		
		Client c = new Client();
		c.setNome("Renato");
		
		repo.persist(c);
		
	}
	
	public List<Client> getListClient(){
		return repo.listClient();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}

package com.renalexster.example.swarm.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.renalexster.example.swarm.model.Client;
import com.renalexster.example.swarm.repository.ClientRepository;
import com.renalexster.example.swarm.service.ClientService;

@ManagedBean
public class HomeView {
	private String msg = "Halo";
	
	Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private ClientRepository repo;
	
	@Inject private ClientService serv;
	
	private Client novo;
	
	@PostConstruct
	private void init() {
		logger.info("Iniciando bean...");
		novo = new Client();
	}
	
	public String inserir() {
		try {
			serv.persist(novo);
			logger.info("Cadastrado ["+novo+"]");
		} catch (Exception e) {
			logger.warn("Erro ["+e.getMessage()+"]");
		}
		return "index.jsf";
	}
	
	public List<Client> getListClient(){
		return repo.findAll();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Client getNovo() {
		return novo;
	}

	public void setNovo(Client novo) {
		this.novo = novo;
	}
	
	
}

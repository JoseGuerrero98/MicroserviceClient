package com.example.client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.client.model.Client;
import com.example.client.repo.ClientRepo;
import com.example.client.service.ClientService;

import reactor.core.publisher.Flux;
@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepo repo;
	
	@Override
	public Flux<Client> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
}

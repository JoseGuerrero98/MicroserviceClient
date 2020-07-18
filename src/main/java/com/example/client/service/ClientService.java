package com.example.client.service;

import com.example.client.model.Client;

import reactor.core.publisher.Flux;

public interface ClientService {
	
	public Flux<Client> findAll();

}

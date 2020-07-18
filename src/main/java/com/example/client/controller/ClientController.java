package com.example.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.model.Client;
import com.example.client.service.ClientService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private ClientService clientservice;
	
	@GetMapping("/all")
	public Flux<Client> findAll(){
		return clientservice.findAll();
	}
	
}

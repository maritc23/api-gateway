package com.nttdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.nttdata.model.Customer;

import reactor.core.publisher.Flux;

@Service
public class CustomerClientServiceImpl implements CustomerClientService{

	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@Override
	public Flux<Customer> findAllCustomer() {
		
		return  webClientBuilder.build().get().uri("http://localhost:8081/customers").retrieve().bodyToFlux(Customer.class);

	}
	
}

package com.nttdata.service;

import com.nttdata.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
public interface CustomerClientService
{
 
    Flux<Customer> findAllCustomer();
 
}
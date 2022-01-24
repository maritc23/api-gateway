package com.nttdata.controller;

import com.nttdata.model.Customer;
import com.nttdata.service.CustomerClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ApiController {
	private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
    @Autowired
    private CustomerClientService customerServiceImpl;

    @GetMapping(value = "/customers", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<Customer> findAll() {
    	logger.info("find customers");
        return customerServiceImpl.findAllCustomer();
    }

    

}

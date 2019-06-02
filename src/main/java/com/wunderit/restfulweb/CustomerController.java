package com.wunderit.restfulweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    private String name;

    @RequestMapping("/customers/{name}")
    public String showCustomer(@PathVariable String name) {
        extracted(name);
        return repository.findByLastName(name).toString();
    }

    private void extracted(String name) {
        this.name = name;
    }
}
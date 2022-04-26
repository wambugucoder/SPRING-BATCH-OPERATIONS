package com.example.batchprocessing.config;

import com.example.batchprocessing.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        log.warn("Processing Customer: "+customer.getFirstname());
        return customer;
    }
}

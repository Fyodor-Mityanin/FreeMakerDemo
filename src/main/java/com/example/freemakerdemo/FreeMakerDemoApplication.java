package com.example.freemakerdemo;

import com.example.freemakerdemo.data.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FreeMakerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreeMakerDemoApplication.class, args);
    }

    @Bean
    public Customer customer(@Qualifier("address1") @Autowired String address) {
        return new Customer("Clara Foster", address);
    }

    @Bean
    public Customer temporary(@Autowired Customer customer) {
        System.out.println(customer);
        return customer;
    }
}

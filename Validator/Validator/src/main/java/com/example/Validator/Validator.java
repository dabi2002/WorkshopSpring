package com.example.Validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Validator {
    public static void main(String[] args) {
        SpringApplication.run(Validator.class, args);
    }

    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

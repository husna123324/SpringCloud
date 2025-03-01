package com.example.ServiceB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceBApplication {
	@GetMapping("/products/{id}")
    public String getProduct(@PathVariable String id) {
        return "Product data for product " + id;
    }
	public static void main(String[] args) {
		SpringApplication.run(ServiceBApplication.class, args);
	}

}

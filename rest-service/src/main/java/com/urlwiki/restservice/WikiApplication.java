package com.urlwiki.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.urlwiki.controller", "com.urlwiki.repositories", "com.urlwiki.restservices", "com.urlwiki.services", "com.urlwiki.domain"})
@EntityScan("com.urlwiki.domain")
public class WikiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WikiApplication.class, args);
		
	}

}

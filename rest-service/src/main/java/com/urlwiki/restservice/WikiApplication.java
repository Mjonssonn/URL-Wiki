package com.urlwiki.restservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;


@SpringBootApplication
@EnableSwagger2
@EntityScan("com.urlwiki.entities")
@EnableJpaRepositories("com.urlwiki.repositories")
@ComponentScan({"com.urlwiki.controller", "com.urlwiki.services"})
public class WikiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WikiApplication.class, args);
		
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		// Returns a prepared Docket instance
		return new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/api.*"))
				.apis(RequestHandlerSelectors.basePackage("com.urlwiki")).build().apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo("URL Wiki", "A small version wiki with urls for Java developers", "1.0", "Free to use",
				new springfox.documentation.service.Contact("Alina & Mattias", "https://www.jensengymnasium.se/goteborg",
						"grupp1@testmail.com"),
				"API License", "https://www.jensengymnasium.se/goteborg", Collections.emptyList());
	}
	
	
}

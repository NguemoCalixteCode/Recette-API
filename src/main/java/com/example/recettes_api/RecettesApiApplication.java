package com.example.recettes_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.recettes_api.repositories")
public class RecettesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecettesApiApplication.class, args);
	}
}

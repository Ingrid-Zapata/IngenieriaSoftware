package com.example.finanza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@EnableJdbcRepositories(basePackages = "com.example.finanza.repositories")
@SpringBootApplication
public class FinanzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanzaApplication.class, args);
	}

}

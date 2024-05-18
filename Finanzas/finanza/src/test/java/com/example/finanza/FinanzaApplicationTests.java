package com.example.finanza;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@EnableJdbcRepositories(basePackages = "com.example.finanza.repositories")
@SpringBootTest
class FinanzaApplicationTests {

	@Test
	void contextLoads() {
	}

}

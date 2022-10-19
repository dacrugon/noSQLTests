package com.todotic.apiaccount;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.todotic.apiaccount.repositories")
@EnableJpaRepositories("com.todotic.apiaccount.repositories")
public class ApiAccountApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiAccountApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}

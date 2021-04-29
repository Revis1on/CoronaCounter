package com.example.CoronaCounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaCounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaCounterApplication.class, args);
	}

}

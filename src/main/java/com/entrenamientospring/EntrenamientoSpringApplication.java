package com.entrenamientospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.entrenamientospring.controller.ClienteController;

@SpringBootApplication
public class EntrenamientoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntrenamientoSpringApplication.class, args);
	}
	
/*	@Bean
	public ClienteController clientController() {
		return ClienteController();
	}
	
*/
}

package com.ecom.EcommerceSpring;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceSpringApplication {


	public static void main(String[] args) {

		// Load environment variables from .env file and set them as system properties
		Dotenv dotenv = Dotenv.configure().load(); // Load environment variables from .env file
		dotenv.entries().forEach(  entry -> System.setProperty(entry.getKey(), entry.getValue())); // Set each entry as a system property

		SpringApplication.run(EcommerceSpringApplication.class, args);
	}

}

package io.github.pablitohaddad.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("A aplicação está no ar!");
		System.out.println("Acesse a porta localhost:8080"); // mvc model view controller
	}

}

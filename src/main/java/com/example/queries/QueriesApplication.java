package com.example.queries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


@SpringBootApplication
public class QueriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueriesApplication.class, args);
	}

}

@Controller
class GreetingsController {

	@QueryMapping
	String hello() {

		return "Hello, world";
	}
}

package com.minhchien.serverTodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
//@EnableWebSecurity
public class ServerTodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerTodoApplication.class, args);
	}

}

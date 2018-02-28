package com.iqmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class MainApplication {

	

	@RequestMapping
	String hello() {
		return "Spring5 Boot2 Jetty !!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}

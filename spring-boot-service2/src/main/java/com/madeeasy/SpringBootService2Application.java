package com.madeeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/service2")
@RestController
public class SpringBootService2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootService2Application.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

}

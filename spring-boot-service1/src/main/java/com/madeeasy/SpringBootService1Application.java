package com.madeeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RequestMapping("/v1/service1")
@RequestMapping("/v2/service1")
@RestController
public class SpringBootService1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootService1Application.class, args);
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

}

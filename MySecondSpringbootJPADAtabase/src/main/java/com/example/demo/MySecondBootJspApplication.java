package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.example.*")
@EntityScan(basePackages = "com.example.model")
public class MySecondBootJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySecondBootJspApplication.class, args);
	}
}

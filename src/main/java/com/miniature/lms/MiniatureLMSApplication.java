package com.miniature.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@ComponentScan(basePackages = {"com.miniature.lms"})
@EnableAutoConfiguration
@OpenAPIDefinition(info = @Info(title = "Miniature LMS APIs", version = "1.0", description = "Miniature LMS API Information"))
public class MiniatureLMSApplication {
	public static void main(String args[]) {
		SpringApplication.run(MiniatureLMSApplication.class,args);
	}
}

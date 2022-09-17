package com.miniature.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.miniature.lms"})
@EnableAutoConfiguration
public class MiniatureLMSApplication {
	public static void main(String args[]) {
		SpringApplication.run(MiniatureLMSApplication.class,args);
	}
}

package com.teamjava.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringAppApplication extends SpringBootServletInitializer
{

	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(SpringAppApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}
}

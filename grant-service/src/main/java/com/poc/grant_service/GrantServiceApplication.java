package com.poc.grant_service;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class GrantServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrantServiceApplication.class, args);
	}


	@Bean
	public Sampler getSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}


}

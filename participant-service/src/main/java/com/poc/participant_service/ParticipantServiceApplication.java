package com.poc.participant_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ParticipantServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ParticipantServiceApplication.class, args);
	}


		@Bean
		@LoadBalanced
		public WebClient.Builder webClientBuilder() {
			return WebClient.builder();
		}

		/*@Bean
		@LoadBalanced
		public WebClient webClient() {
			return WebClient.builder()
					.baseUrl("http://GRANT-SERVICE/Grants-Service/")
					.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
					.build();
		}*/


}

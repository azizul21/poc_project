package com.operation.cache.crud_cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CrudCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudCacheApplication.class, args);
	}

}

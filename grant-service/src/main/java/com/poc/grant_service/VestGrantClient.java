package com.poc.grant_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "vest-grant-service", url = "http://localhost:9003")
public interface VestGrantClient {
    @GetMapping("/vestGrants")
    String getVestGrantInfo();
}

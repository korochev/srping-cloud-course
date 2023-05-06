package com.example.clientupdate.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "client-service")
public interface UpdateServiceFeignClient {

        @GetMapping("/api/client")
        String getTestMessage();
}

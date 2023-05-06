package com.example.clientupdate.controller;



import com.example.clientupdate.service.UpdateServiceFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/update")
public class RequestTestMessageController {
    private final UpdateServiceFeignClient feignClient;

    public RequestTestMessageController(UpdateServiceFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @GetMapping
    String testMessage() {
        return feignClient.getTestMessage();
    }
}

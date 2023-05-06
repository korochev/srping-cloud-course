package com.example.clientserviceclone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/client")
public class RequestBookController {

    @GetMapping("/test")
    String testMessage() {
        return "new string from service #2";
    }
}

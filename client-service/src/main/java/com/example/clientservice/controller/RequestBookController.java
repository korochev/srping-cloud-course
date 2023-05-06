package com.example.clientservice.controller;


import com.example.clientservice.model.Book;
import com.example.clientservice.service.ServiceBFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class RequestBookController {
    private final ServiceBFeignClient feignClient;


    public RequestBookController(@Qualifier("com.example.clientservice.service.ServiceBFeignClient") ServiceBFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @GetMapping("/books")
    List<Book> getAllBooksFromClient(){

        return feignClient.getAllBooks();
    }

    @GetMapping("/test")
    String testMessage() {
        return "new string from service #1";
    }
}

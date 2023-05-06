package com.example.clientservice.service;


import com.example.clientservice.fallback.BSFallback;
import com.example.clientservice.fallback.BookServiceConnectorFallbackFactory;
import com.example.clientservice.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@FeignClient(name = "book-service", fallbackFactory = BookServiceConnectorFallbackFactory.class)
public interface ServiceBFeignClient {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}



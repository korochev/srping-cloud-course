package com.example.clientservice.fallback;

import com.example.clientservice.model.Book;
import com.example.clientservice.service.ServiceBFeignClient;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class BSFallback implements ServiceBFeignClient {
    @Override
    public List<Book> getAllBooks() {
        System.out.println("увак, ты заебал нахуй");
        return Collections.emptyList();
    }
}

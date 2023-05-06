package com.example.clientservice.fallback;

import com.example.clientservice.model.Book;
import com.example.clientservice.service.ServiceBFeignClient;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;

@Slf4j
record FallbackWithFactory(String reason) implements ServiceBFeignClient {
    @Override
    public List<Book> getAllBooks() {
        log.info("Failed send request on book service, reason {}", reason);
        return Collections.emptyList();
    }
}

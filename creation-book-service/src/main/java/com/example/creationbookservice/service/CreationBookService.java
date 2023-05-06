package com.example.creationbookservice.service;

import com.example.creationbookservice.model.Book;
import com.example.creationbookservice.util.BookGenerator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.LinkedList;


@Service
@AllArgsConstructor
@Slf4j
@EnableScheduling
public class CreationBookService {
    private final BookGenerator bookGenerator;
    private final LinkedList<Book> bookCreationEvents;


    @Scheduled(fixedRate = 10000)
    public void generateBooks() {
        System.out.println("I was here");
        Book book = bookGenerator.createNewBook();
        bookCreationEvents.add(book);
    }
}

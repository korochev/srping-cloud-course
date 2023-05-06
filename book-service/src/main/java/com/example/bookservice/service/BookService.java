package com.example.bookservice.service;

import com.example.bookservice.dao.BookMongoRepository;
import com.example.bookservice.model.Book;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookMongoRepository bookRepository;

    public BookService(BookMongoRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBookList() {
        Book book = new Book();
        return bookRepository.findAll(Example.of(book));
    }
}

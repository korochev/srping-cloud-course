package com.example.bookservice.dao;

import com.example.bookservice.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookMongoRepository extends MongoRepository<Book, String> {
}
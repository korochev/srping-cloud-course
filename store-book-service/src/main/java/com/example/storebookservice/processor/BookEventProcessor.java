package com.example.storebookservice.processor;

import com.example.storebookservice.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class BookEventProcessor implements Consumer<Message<Book>> {
    @Override
    public void accept(Message<Book> bookMessage) {
      log.info("Received book: {}", bookMessage.getPayload());
    }
}

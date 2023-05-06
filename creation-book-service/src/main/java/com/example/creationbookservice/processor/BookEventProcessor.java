package com.example.creationbookservice.processor;

import com.example.creationbookservice.model.Book;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Objects;
import java.util.function.Supplier;

@Component
@Slf4j
@AllArgsConstructor
public class BookEventProcessor implements Supplier<Message<Book>> {
    private final LinkedList<Book> bookCreationEventSource;

    @Override
    public Message<Book> get(){
        if (bookCreationEventSource.peek() != null) {
            log.info("Sending new book: {}", bookCreationEventSource.peek());
            return MessageBuilder.withPayload(Objects.requireNonNull(bookCreationEventSource.poll())).build();
        }
        return null;
    }
}

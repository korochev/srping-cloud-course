package com.example.clientservice.fallback;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;



@Component
public class BookServiceConnectorFallbackFactory implements FallbackFactory<FallbackWithFactory> {
    @Override
    public FallbackWithFactory create(Throwable cause) {
        return new FallbackWithFactory(cause.getMessage());
    }
}



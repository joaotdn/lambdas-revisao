package com.example.cliapplication.consumers;

@FunctionalInterface
public interface CustomConsumer<T> {
    void accept(T t);
}

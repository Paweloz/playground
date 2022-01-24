package com.podstawy;

class Book extends SuperBook {
    private final String author;

    public Book(String name, String author) {
        super(name);
        this.author = author;
    }
}

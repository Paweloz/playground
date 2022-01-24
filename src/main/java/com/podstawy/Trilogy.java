package com.podstawy;

public class Trilogy extends Book {
    private final int prodYear;

    public Trilogy(int prodYear, String title, String author){
        super(title, author);
        this.prodYear = prodYear;
    }
}

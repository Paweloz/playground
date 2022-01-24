package com.podstawy.multithreading;

import java.util.concurrent.Callable;

public class Zbieracz implements Callable<Zbieracz> {

    @Override
    public Zbieracz call() {
        System.out.println("Wątek uruchomiony ");
        return this;
    }
}

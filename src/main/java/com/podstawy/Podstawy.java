package com.podstawy;

import com.podstawy.multithreading.Zbieracz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.stream.IntStream;

//Podstawy
public class Podstawy {

    public static void main(String[] args) {
//        String string = "aahhssjjjiiuusszppoossuunnyyw";
//        List<String> stringList = Arrays.asList(string.split("(?!^)"));
//        int counter = 0;
//
//        for(int i=0;  i< string.length() ; i++ ) {
//            String sign = string.substring(i, i+1);
//            for (int n=0; n < stringList.size() ; n++ ) {
//                String current = stringList.get(n);
//                if (current.equals(sign)) {
//                    counter += 1;
//                }
//            }
//            if(counter == 1) {
//                System.out.println("First non doubled sign is : " + sign);
//                return;
//            }
//            counter = 0;
//        }
        Zbieracz zbieracz = new Zbieracz();
        Zbieracz zbieracz1;
        System.out.println("Obiekt przed operacją na wątku : " + zbieracz.toString());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Zbieracz> future = executorService.submit(zbieracz);
        try {z)
        System.out.println("Obiekt po operacji na wątku " + future.get());
    }
 }
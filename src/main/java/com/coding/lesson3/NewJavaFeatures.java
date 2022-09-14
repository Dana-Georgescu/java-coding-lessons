package com.coding.lesson3;

import java.util.Arrays;
import java.util.List;

public class NewJavaFeatures {




    public static void main(String[] args) {
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.println("hello world");
           }
       };
       runnable.run();

       Runnable coolRunnable = () -> System.out.println("hello cool world");
       coolRunnable.run();

       List<String> list = Arrays.asList("kafka", "tolstoi", "mann", "woolf", "tudor", "cosmin","traian");

//       list.stream()
//               .filter(name -> name.startsWith("t"))
    }


}

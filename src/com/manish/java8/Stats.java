package com.manish.java8;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stats {

    IntStream streamOfInts = IntStream.range(1,100);

    private void range(){
       // IntStream ints = IntStream.range(1,20);
        IntStream ints = IntStream.rangeClosed(1,20);
        ints.forEach(System.out::println);
    }

    private void testMaxAndMin() {
        IntStream ints = IntStream.range(10,20);
        OptionalInt max = ints.max();
        System.out.println("Max is: "+max);
    //Used stream can not be used twice
        ints = IntStream.range(10,20);
        OptionalInt min = ints.min();
        System.out.println("Min is: "+min);

         ints = IntStream.range(10,20);
        OptionalDouble avg = ints.average();
        System.out.println("Avg is: "+avg);



    }

    public static void main(String[] args) {
        new Stats().range();
        new Stats().testMaxAndMin();
    }
}

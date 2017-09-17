package com.manish.java8;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(2,6,4,3,2,5,9,10,3);

        System.out.println(list.stream()
                .distinct()
                .count());


    }
}

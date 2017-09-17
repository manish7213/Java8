package com.manish.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {


        List<String> list = Arrays.asList(
                "Manish", "Kumar", "ciao", "Manish", "ciao","abc","abc","abc","abc");


        Map<String, Integer> counts = list.parallelStream()
                                           .collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));

        List<Map.Entry<String, Integer>> list1 = counts.entrySet()
                                                       .stream()
                                                        .parallel()
                                                         .collect(Collectors.toList());

       // list1.sort((t1,t2) -> t1.getValue().compareTo(t2.getValue()));

        //OR

        list1.sort(Comparator.comparing(Map.Entry::getValue ));



        System.out.println(list1);


        //System.out.println(counts);


    }

}

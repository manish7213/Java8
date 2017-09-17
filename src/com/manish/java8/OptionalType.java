package com.manish.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalType {

    private void attendeesOptional() {

        List<Integer> attendees = Arrays.asList(8,7,6,5,4,9,1);

        Optional<Integer> attendessSum = attendees.stream()
                .reduce(Integer::sum);


        System.out.println(attendessSum.get());
    }

    //What if Integer::sum deoes not return anything
    private void noAttendeesOptional() {
        List<Integer> emptyList = Arrays.asList();

        Optional<Integer> emptyListSum = emptyList.stream()
                .reduce(Integer::sum);
        //System.out.println(emptyListSum.get()); //This will throw NoSuchElementException, To Overcome that we use isPresent method

        if(emptyListSum.isPresent())
            System.out.println(emptyListSum.get()); ///Now The value will be skipped instead of throwing Exception

    }


    public static void main(String[] args) {
        OptionalType optionalType = new OptionalType();

        optionalType.attendeesOptional();
        optionalType.noAttendeesOptional();
    }
}

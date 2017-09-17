package com.manish.java8;

import java.util.function.BiPredicate;

public class BiPredicatesFunctionslInterface {

    BiPredicate<Employee,Manager> isManagerPredicate = (e,m) -> e.getRating() < m.getRating();

    private boolean testismanagerPredicate(Employee e, Manager m){

        return isManagerPredicate.test(e,m);
    }

    public static void main(String[] args) {


        BiPredicatesFunctionslInterface biPredicatesFunctionslInterfac = new BiPredicatesFunctionslInterface();

        System.out.println(biPredicatesFunctionslInterfac.testismanagerPredicate(new Employee("A12",15),
                new Manager("A34",13)));

        /**
         *
         * For more Info on BiPredicate
         *
         * @see BiPredicate
         */





    }
}

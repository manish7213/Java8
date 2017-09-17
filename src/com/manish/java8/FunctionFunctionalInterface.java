package com.manish.java8;

import java.util.function.Function;

public class FunctionFunctionalInterface {

    Function<String,Integer> functionDemo = s -> s.length();
    Function<Employee, Integer> isTechlead = e -> e.getRating() > 5?1:0;
    Function<Employee, Integer> findRating = e -> e.getRating();


    private int FunctionDemo(String name){

        return functionDemo.apply(name);
    }

    private int isTechLeadTest(Employee e){
        return isTechlead.apply(e);

    }

    private int getRatingTest(Employee e) {
        return findRating.apply(e);
    }


    public static void main(String[] args) {

        FunctionFunctionalInterface functionFunctionalInterface = new FunctionFunctionalInterface();

        System.out.println(functionFunctionalInterface.FunctionDemo("Manish"));
        System.out.println(functionFunctionalInterface.FunctionDemo("Rakesh"));
        System.out.println(functionFunctionalInterface.FunctionDemo(""));


        /**
         * For More Info please
         * @see Function
         * @since 1.8
         *
         */


    }
}

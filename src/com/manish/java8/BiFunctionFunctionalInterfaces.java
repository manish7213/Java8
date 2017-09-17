package com.manish.java8;

import java.util.function.BiFunction;

public class BiFunctionFunctionalInterfaces {

    BiFunction<Employee,Manager,Integer> biFunction = (e, m) -> e.getBonus()+m.getBonus();

    public int getBonusSum(Employee e,Manager m){

        return biFunction.apply(e,m);
    }

    public static void main(String[] args) {

        BiFunctionFunctionalInterfaces biFunctionFunctionalInterfaces = new BiFunctionFunctionalInterfaces();

        Employee e1 = new Employee("Manish",5000,"B123",20);

        Manager m1 = new Manager("Shiva","M123",23,8000);

        System.out.println(biFunctionFunctionalInterfaces.getBonusSum(e1,m1));

        /**
         * For More Info
         * @see BiFunction
         */





    }
}

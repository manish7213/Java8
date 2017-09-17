package com.manish.java8;

import java.util.Arrays;
import java.util.List;

public class DistinctLimitSkip {

    private List<Employee> createEmployeeList(){
        Employee e1 = new Employee("Manish",2000,"A11",11);
        Employee e2 = new Employee("Shiva",8000,"A18",18);
        Employee e3 = new Employee("Rama",7000,"A17",17);
        Employee e4 = new Employee("Vishnu",9000,"A19",19);
        Employee e5 = new Employee("Krishna",10000,"A20",19);
        Employee e6 = new Employee("Parshurama",9000,"A14",15);
        return Arrays.asList(e1,e2,e3,e4,e5,e6);
    }


    List<Employee> empList = createEmployeeList();

    private void testDistinct(){

        empList.stream()
                .mapToInt(Employee::getRating)
                .distinct()
                .forEach(System.out::println);

        empList.stream()
                .map(Employee::getId)
                .distinct()
                .forEach(System.out::println);

    }


    private void testLimit(){

        System.out.println("TESTING LIMIT ");
        empList.stream()
                .map(Employee::getName)
                .limit(3)
                .forEach(System.out::println);

    }

    private void testSkip() {

        empList.stream()
                .map(Employee::getName)
                .skip(2)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        new DistinctLimitSkip().testDistinct();
        new DistinctLimitSkip().testLimit();
        new DistinctLimitSkip().testSkip();
    }
}

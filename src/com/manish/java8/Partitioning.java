package com.manish.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {

    private List<Employee> createEmployeeList() {
        Employee e1 = new Employee("Manish", 2000, "A11", 11);
        Employee e2 = new Employee("Shiva", 8000, "A18", 18);
        Employee e3 = new Employee("Rama", 7000, "A18", 17);
        Employee e4 = new Employee("Vishnu", 9000, "A19", 19);
        Employee e5 = new Employee("Krishna", 10000, "A19", 19);
        Employee e6 = new Employee("Parshurama", 9000, "A19", 15);
        Employee e7 = new Employee("Manish",12000,"A23",45);
        Employee e8 = new Employee("Manish",12000,"A23",45);

        return Arrays.asList(e1, e2, e3, e4, e5, e6,e7,e8);
    }


    List<Employee> empList = createEmployeeList();

    private void partitionByBonus(){

        Map<Boolean,List<Employee>> map = empList.stream()
                .collect(Collectors.partitioningBy(e -> e.getBonus() > 9000));

        System.out.println(map);
    }


    private void partitionByRatingandGroupByName(){

        Map<Boolean,Map<String,List<Employee>>> map = empList.stream()
                .collect(Collectors.partitioningBy(e -> e.getRating() > 17,Collectors.groupingBy(Employee::getName)));

        System.out.println(map);
    }

    private void parttiionByMultiLevel() {
        Map<Boolean,Map<Boolean,List<Employee>>> map = empList.stream()
                .collect(Collectors.partitioningBy(e -> e.getBonus() > 9000,Collectors.partitioningBy(e -> e.getRating() > 15)));

        //System.out.println(map);

        map.forEach((k,v) -> System.out.println(k+" "+v));
    }

    public static void main(String[] args) {

        //new Partitioning().partitionByBonus();
        //new Partitioning().partitionByRatingandGroupByName();

        new Partitioning().parttiionByMultiLevel();
    }

}

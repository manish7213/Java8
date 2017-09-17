package com.manish.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Grouping {

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

    private void groupingById() {

        Map<String, List<Employee>> map = empList.stream()
                .collect(groupingBy(e -> e.getId()));

        map.forEach((k,v) -> System.out.println(k+" "+v));

    }

    private void groupingByName() {

        Map<String,List<Employee>> map = empList.stream()
                .collect(groupingBy(e -> e.getName()));

        System.out.println(map);
    }

    private void groupinByBonus() {
        Map<Integer,List<Employee>> map = empList.stream()
                .collect(groupingBy(e -> e.getBonus()));

        System.out.println(map);
    }

    private void groupingByRating() {
        Map<Integer,List<Employee>> map = empList.stream()
                .collect(groupingBy(e -> e.getRating()));

        System.out.println(map);
    }

    //MultiLevel grouping

    private void groupingByNameId() {

       Map<String,Map<String,List<Employee>>> map = empList.stream()
                .collect(Collectors.groupingBy(Employee::getName,Collectors.groupingBy(Employee::getId)));

        System.out.println(map);

    }

    private void groupByRatingBonus(){

        Map<Integer,Map<Integer,List<Employee>>> map = empList.stream()
                .collect(Collectors.groupingBy(Employee::getRating,groupingBy(Employee::getBonus)));
        System.out.println(map);
    }

    public static void main(String[] args) {

        /*System.out.println("GOUPING BY ID");
        new Grouping().groupingById();
        System.out.println("GOUPING BY NAME");
        new Grouping().groupingByName();
        System.out.println("GOUPING BY BONUS");
        new Grouping().groupinByBonus();
        System.out.println("GOUPING BY RATING");
        new Grouping().groupingByRating();*/

      //  new Grouping().groupingByNameId();
        new Grouping().groupByRatingBonus();
    }
}

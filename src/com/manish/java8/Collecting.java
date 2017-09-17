package com.manish.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collecting {
    private List<Employee> createEmployeeList(){
        Employee e1 = new Employee("Manish",2000,"A11",11);
        Employee e2 = new Employee("Shiva",8000,"A18",18);
        Employee e3 = new Employee("Rama",7000,"A17",17);
        Employee e4 = new Employee("Vishnu",9000,"A19",19);
       return Arrays.asList(e1,e2,e3,e4);
    }


    List<Employee> empList = createEmployeeList();
    private void collectIntoList(){

     List<Employee> listCollection = empList.stream()
             .collect(Collectors.toList());

        listCollection.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

    }

    private void collectIntoSet(){

        Set<Employee> setCollection = empList.stream()
                .collect(Collectors.toSet());

        setCollection.stream()
                .map(Employee::getId)
                .forEach(System.out::println);

    }

    private void collectIntoMap(){

        Map<String,Employee> mapCollection = empList.stream()
                .collect(Collectors.toMap(Employee::getName, e -> e));

        mapCollection.forEach((k,v) -> System.out.println(k+" "+v.getId()));

    }

    public static void main(String[] args) {
        new Collecting().collectIntoList();
        new Collecting().collectIntoSet();
        new Collecting().collectIntoMap();
    }
}

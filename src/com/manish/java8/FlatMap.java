package com.manish.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

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

    private List<Employee> getEmployess(){

      return empList.stream()
                .collect(Collectors.toList());
    }


    List<Employee> empList = createEmployeeList();


    String[] fruits = new String[]{"oranges","apples"};
    String[] veg = new String[]{"beans","peas"};

    private void flatMapEmployees(){

        Stream<Employee> empStream = empList.stream()
                .flatMap((e) -> getEmployess().stream());

        empStream.forEach(System.out::println);
    }

    private void flattenFruitsAndveg(){

        Stream<List<String>> fruitsandveg = Stream.of(Arrays.asList(fruits),Arrays.asList(veg));

        fruitsandveg.flatMap(s -> s.stream())
                .forEach(System.out::println);

    }

    public static void main(String[] args) {

        //new FlatMap().flatMapEmployees();
        new FlatMap().flattenFruitsAndveg();
    }
}

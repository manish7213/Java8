package com.manish.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindersOrShortCircuitOperation {


    private List<Employee> createEmployeeList() {
        Employee e1 = new Employee("Manish", 2000, "A11", 11);
        Employee e2 = new Employee("Shiva", 8000, "A18", 18);
        Employee e3 = new Employee("Rama", 7000, "A17", 17);
        Employee e4 = new Employee("Vishnu", 9000, "A19", 19);
        Employee e5 = new Employee("Krishna", 10000, "A20", 19);
        Employee e6 = new Employee("Parshurama", 9000, "A14", 15);
        return Arrays.asList(e1, e2, e3, e4, e5, e6);
    }


    List<Employee> empList = createEmployeeList();


    private void testFindFirst() {
        Optional<Employee> firstEmployee = empList.stream()
                .filter(e -> e.getBonus() > 7000)
                .findFirst();
        System.out.println(firstEmployee.get().getName());
    }

    private void testFindAny() {
        Optional<Employee> findAnyEmp = empList.stream()
                .filter(e -> e.getName().length() >= 6)
                .findAny();

        System.out.println("Testing findAny" + findAnyEmp.get().getName());

    }

    private void testAnyMatch() {
        boolean anyMatch = empList.stream()
                .anyMatch(e -> e.getName().equalsIgnoreCase("Manish"));

        System.out.println("Testing any match " + anyMatch);

    }

    private void testAllMatch() {

        boolean allMatch = empList.stream()
                .allMatch(e -> e.getName().length() < 15);
        System.out.println("Testing all Match " + allMatch);
    }
    private void testNoneMatch(){

        boolean noneMatch = empList.stream()
                .noneMatch(e -> e.getBonus() > 3300000);

        System.out.println("Testing None Match "+noneMatch);
    }

    public static void main(String[] args) {

        FindersOrShortCircuitOperation findersOrShortCircuitOperation = new FindersOrShortCircuitOperation();

        findersOrShortCircuitOperation.testFindFirst();
        findersOrShortCircuitOperation.testFindAny();
        findersOrShortCircuitOperation.testAnyMatch();
        findersOrShortCircuitOperation.testAllMatch();
        findersOrShortCircuitOperation.testNoneMatch();
    }
}

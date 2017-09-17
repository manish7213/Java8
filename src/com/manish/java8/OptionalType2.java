package com.manish.java8;

import java.util.Optional;

public class OptionalType2 {

    private void creatingOptinals() {
        Employee employee = new Employee();

        Optional<Employee> employeeOptional = Optional.of(employee);

        System.out.println(employeeOptional.get().getName());




      employeeOptional.map(Employee::getName).ifPresent(System.out::println);

        employee = null;

       Optional<Employee> employeeOptional2 = Optional.ofNullable(employee);

       System.out.println("Employee can not be NULL: " + employeeOptional2);
   }

    private void ifElseOptinal() {
       Employee employee  = null;
        //Employee employee = new Employee("manish",30000,"B56",78);

        Employee defualtEmployee = new Employee();

        defualtEmployee.setName("default name");

        Optional<Employee> employeeOptional = Optional.ofNullable(employee);

        String name = employeeOptional.orElse(defualtEmployee).getName();

        System.out.println("Get Name: "+name);

    }

    private void ifElseThrowOptionals() throws Exception {
        Employee employee = null;

        Optional<Employee> employeeOptional = Optional.ofNullable(employee);

        employeeOptional.orElseThrow(Exception::new);
    }

    private void filterMapOptionals() {

        Employee employee = new Employee();
        employee.setName("Vasudeva");

        Optional<Employee> employeeOptional = Optional.of(employee);

        employeeOptional.filter(e -> e.getName().length()>=6)
                .map(Employee::getName)
                .ifPresent(System.out::println);

    }

    public static void main(String[] args) {

       new OptionalType2().creatingOptinals();
        new OptionalType2().ifElseOptinal();
        try {
            new OptionalType2().ifElseThrowOptionals();
        } catch (Exception e) {
            System.out.println("Expected "+e);
        }

        new OptionalType2().filterMapOptionals();
    }
}

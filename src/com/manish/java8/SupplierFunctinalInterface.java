package com.manish.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctinalInterface {

    Supplier<String[]> fruitSupplier = () -> new String[]{"Mango","Apple","Oranges"};

    Supplier<List<Employee>> employeeSupplier = () -> Arrays.asList(new Employee("e1",1),new Employee("e2",5));

    private void testFruitSupplier(){

        String[] fruits = fruitSupplier.get();

        Arrays.stream(fruits)
                .forEach(System.out::println);
    }

    private void testEmployeeSupllier(){

        List<Employee> list = employeeSupplier.get();

        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        SupplierFunctinalInterface supplierFunctinalInterface = new SupplierFunctinalInterface();

        System.out.println("Testingf Fruit Supplier");
        supplierFunctinalInterface.testFruitSupplier();
        System.out.println("Testing Employee Supplier");
        supplierFunctinalInterface.testEmployeeSupllier();

        /**
         * For More Info
         * @see Supplier
         */
    }
}

package com.manish.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CustomCollectors {
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


    private void collectIntoCustomCollector() {
        Supplier<StringBuilder> supplier = StringBuilder::new;

        BiConsumer<StringBuilder,Employee> accummulator =
                (sb,employee) -> sb.append(employee.getName()).append("~");

        BiConsumer<StringBuilder,StringBuilder> combiner =
                (s1,s2) -> s1.append(s2.toString());

        StringBuilder result = empList.stream()
                .collect(supplier,accummulator,combiner);

        System.out.println(result);
    }

    private void stats(){

        IntSummaryStatistics s = empList.stream()
                .collect(Collectors.summarizingInt(Employee::getBonus));

        System.out.println(s);
    }

    public static void main(String[] args) {

        new CustomCollectors().collectIntoCustomCollector();
        new CustomCollectors().stats();


    }
}

package com.manish.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

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


    private void reducingBinaryOperation(){
        Optional<String> employeeNameList = empList.stream()
                .map(Employee::getName)
                .reduce((name1,name2) -> name1+"~"+name2);
        System.out.println(employeeNameList);
    }

    private void totalBonus(){

        Optional<Integer> totalBonusSum = empList.stream()
                .map(Employee::getBonus)
                .reduce((a,b) -> a+b);

        System.out.println("Total Bonus Amount is: "+totalBonusSum);
    }

    private void initiializeReductionOpeartion(){
        List<Integer> list = Arrays.asList(2,3,4,5,6,7);
        int sum = list.stream()
                .reduce(10,(a,b) -> a+b);
        System.out.println("Sum is: "+sum);
    }

    public static void main(String[] args) {

        Reducing reducing = new Reducing();
        reducing.reducingBinaryOperation();
        reducing.totalBonus();
        reducing.initiializeReductionOpeartion();

    }
}

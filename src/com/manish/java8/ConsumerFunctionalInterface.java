package com.manish.java8;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {


    //Consumer for Employee print info
    Consumer<Employee>  consumerInfo = e -> System.out.println("Printing Employee "+e);

    //Consuumer for persisting Employee name

    Consumer<Employee>  persistEmp = e -> persist(e);

    Consumer<Employee> notifyEmp = e -> notifyEmpoyee(e);

    private void persist(Employee e){

        System.out.println("Persisting Employee "+e);
    }

    private void notifyEmpoyee(Employee e){

        System.out.println("Notifying Employees "+e);
    }


    public void testConsumerInfo(Employee e){

        consumerInfo.accept(e);
    }

    public void testPersistEmp(Employee e){

        persistEmp.accept(e);
    }


    public void testAndThen(Employee e){

        Consumer<Employee> printAndPersistEmp = persistEmp.andThen(consumerInfo);

        printAndPersistEmp.accept(e);

        Consumer<Employee> chainedConsumer = notifyEmp.andThen(persistEmp).andThen(consumerInfo);

        chainedConsumer.accept(e);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("12",1);
        Employee e2 = new Employee("E21",2);
        Employee e3 = new Employee("E77",8);

        ConsumerFunctionalInterface consumerFunctionalInterface = new ConsumerFunctionalInterface();


        /*System.out.println("Testing Consumer employee Info");
        consumerFunctionalInterface.testConsumerInfo(e1);
        consumerFunctionalInterface.testConsumerInfo(e2);
        consumerFunctionalInterface.testConsumerInfo(e3);

        System.out.println("Testing Consumer Employee Persisit ");
        consumerFunctionalInterface.testPersistEmp(e1);
        consumerFunctionalInterface.testPersistEmp(e2);
        consumerFunctionalInterface.testPersistEmp(e3);*/

        System.out.println("Testing andThen Functionality");

        consumerFunctionalInterface.testAndThen(e1);

        /**
         * For more Info Please Refer;
         * @see Consumer
         */



    }

}

package com.manish.java8;

import java.util.function.BiConsumer;

public class BiConsumersFunctionalInterfces {

    BiConsumer<Employee,Integer> empBonus = (e, bonus) -> System.out.println("Employee "+e.getId()+" is getting Rs. "+bonus+" as bonus");

    BiConsumer<Employee,Integer> hikeConsumer = (e,hike) -> System.out.println("Employee "+e.getName()+" is getting hike as "+hike+" as salary hike");

    BiConsumer<Employee,Integer> testAndThen = empBonus.andThen(hikeConsumer);
    private void testEmpBonus(Employee e, int bonus){

            empBonus.accept(e,bonus);

    }

    private void hikeConsumerTest(Employee e,int hike) {
        hikeConsumer.accept(e,hike);
    }
    private  void chainingBiconsumer(Employee e, int hike,int bonus) {
        testAndThen.accept(e,hike);
    }
    public static void main(String[] args) {

      BiConsumersFunctionalInterfces biConsumersFunctionalInterfces =  new BiConsumersFunctionalInterfces();
      Employee emp1 = new Employee("Manish",120000,"A19",16);
     // biConsumersFunctionalInterfces.testEmpBonus(emp1,120000);
      biConsumersFunctionalInterfces.chainingBiconsumer(emp1,15000,13000);

        /**
         * For More Info
         * @see BiConsumer
         */


    }
}

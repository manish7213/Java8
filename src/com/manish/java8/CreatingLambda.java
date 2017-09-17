package com.manish.java8;

public class CreatingLambda {

    interface Greeting{

        public String sayHello(String a);

    }

    public void testGreeting(String a , Greeting g) {

        String result = g.sayHello(a);

        System.out.println("Result "+result);

    }

    public static void main(String[] args) {

        new CreatingLambda().testGreeting("Manish",(String s) -> "Hello "+s);
        new CreatingLambda().testGreeting("Shiva",s -> !s.isEmpty()?"Hello "+s:"Did u miss something");
    }
}

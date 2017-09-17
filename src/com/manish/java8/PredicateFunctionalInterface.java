package com.manish.java8;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    Predicate<Employee> bonusLambda = (emp) -> emp.getRating()>10?true:false;
    Predicate<Employee> executiveLambda = (emp) -> emp.getId().startsWith("E99")?true:false;
    Predicate<String>  emptyString = s -> s.isEmpty();

    Predicate<Employee> chainedPredicate1 = e -> chainedPredicateMethod1(e);

    Predicate<Employee> chainedPredicate2 =  bonusLambda.and(executiveLambda);

    private  boolean chainedPredicateMethod1(Employee e){

        return testBonusLambda(e) && testExecutiveLambda(e);
    }



    private boolean testBonusLambda(Employee e){

        return bonusLambda.test(e);
    }


    private boolean testExecutiveLambda(Employee e){

        return executiveLambda.test(e);
    }

    private boolean testChainedPrdct(Employee e){

        return chainedPredicate1.test(e);
    }


    private boolean testChainedPredicate2(Employee e){

        return chainedPredicate2.test(e);
    }


    private boolean testString(String s){

        return emptyString.test(s);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("E21",6);
        Employee e2 = new Employee("E99",13);
        Employee e3 = new Employee("E28",12);

        String s = "Manish";
        String s1="";

        PredicateFunctionalInterface predicateFunctionalInterface = new PredicateFunctionalInterface();


        System.out.println("Testing bonus lambda");
        System.out.println(predicateFunctionalInterface.testBonusLambda(e1));
        System.out.println(predicateFunctionalInterface.testBonusLambda(e2));
        System.out.println(predicateFunctionalInterface.testBonusLambda(e3));     //true


        System.out.println("Testing executive lambda");
        System.out.println(predicateFunctionalInterface.testExecutiveLambda(e1));
        System.out.println(predicateFunctionalInterface.testExecutiveLambda(e2)); //true
        System.out.println(predicateFunctionalInterface.testExecutiveLambda(e3));

        System.out.println("Testing Strin lambda ");
        System.out.println(predicateFunctionalInterface.testString(s));
        System.out.println(predicateFunctionalInterface.testString(s1));    //true

        System.out.println("Testing chained Predicate1");
        System.out.println(predicateFunctionalInterface.testChainedPrdct(e1));
        System.out.println(predicateFunctionalInterface.testChainedPrdct(e2)); //true
        System.out.println(predicateFunctionalInterface.testChainedPrdct(e3));

        System.out.println("Testing Chained Predicate 2");
        System.out.println(predicateFunctionalInterface.testChainedPredicate2(e1));
        System.out.println(predicateFunctionalInterface.testChainedPredicate2(e2));
        System.out.println(predicateFunctionalInterface.testChainedPredicate2(e3));


        /**
         *
         * More Methods can be seen here
         * @see Predicate
         *
         * Methods Are:
         * 1). test
         * 2). .and
         * 3). .or
         * 4).  .isEqual
         * 5).   negate
         *
         * All these methods can be chained to produce a boolean valued result
         */





    }
}

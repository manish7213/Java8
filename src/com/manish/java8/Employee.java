package com.manish.java8;

public class Employee {
    private String name;
    private int bonus;
    private String id;
    private int rating;

    public void setName(String name) {
        this.name = name;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }



    public String getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Employee(String id, int rating) {
        this.id = id;
        this.rating = rating;
    }

    public Employee(){
    }

    public Employee(String name, int bonus, String id, int rating) {
        this.name = name;
        this.bonus = bonus;
        this.id = id;
        this.rating = rating;
    }

    public Manager getManager(){

        if(this.getRating() > 8)
            return new Manager();

        return null;


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                ", id='" + id + '\'' +
                ", rating=" + rating +
                '}';
    }
}

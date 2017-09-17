package com.manish.java8;

public class Manager {

    private String name;
    private String id;
    private int rating;
    private int bonus;
    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String id) {
        this.id = id;
    }

    public Manager() {
    }

    public Manager(String id, int rating) {
        this.id = id;
        this.rating = rating;

    }

    public Manager(String name, String id, int rating, int bonus) {
        this.name = name;
        this.id = id;
        this.rating = rating;
        this.bonus = bonus;
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

    @Override
    public String toString() {
        return "Manager{" +
                "id='" + id + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manager manager = (Manager) o;

        if (rating != manager.rating) return false;
        return id != null ? id.equals(manager.id) : manager.id == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + rating;
        return result;
    }
}

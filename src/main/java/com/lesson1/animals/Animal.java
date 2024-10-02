package com.lesson1.animals;

public class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.maxRunDistance=maxRunDistance;
        this.maxSwimDistance=maxSwimDistance;
        this.name=name;
        counter++;

    }
    public static int counter =0;
    public void run(int distance) {
        if (distance<=maxRunDistance) {
            System.out.println(name+" has run "+distance);
        } else {
            System.out.println(name+" cannot run so much");
        }
    }
    public void swim(int distance) {
        if (distance<=maxSwimDistance) {
            System.out.println(name+" has swam "+distance);
        } else {
            System.out.println(name+" cannot swim so much");
        }
    }
}

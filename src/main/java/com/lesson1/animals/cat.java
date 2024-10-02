package com.lesson1.animals;

public class cat  extends  Animal {
    public cat(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats cannot swim");
    }
}

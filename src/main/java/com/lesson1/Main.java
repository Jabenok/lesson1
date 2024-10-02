package com.lesson1;

import com.lesson1.animals.Animal;
import com.lesson1.animals.Dog;
import com.lesson1.animals.cat;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new cat("Murzik", 200, 100),
                new Dog("bobik", 500, 100)
        };
        for (Animal i : animals) {
            i.swim(200);
            i.run(150);
        }
        System.out.println("Total number of animals is "+Animal.counter);


    }
}
package com.hillel.company;

public class Boxer {

    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    public boolean fight(Boxer anotherBoxer) {
        return anotherBoxer.age < this.age && anotherBoxer.strength > this.strength
                && anotherBoxer.weight > this.weight ? true : false;
     }
    }


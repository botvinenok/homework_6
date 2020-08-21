package com.hillel.company;

public class Human {
    public int age;
    public int weight;
    public int height;
    public String firstName;
    public String lastName;

    public int getAges() {
        return age;
    }

    public void setAges(int age){
        if(age < 18)
            this.age = 18;
        else
            this.age = age;
    }

    public Human(){
        System.out.println("Default constructor");
    }
    public Human(int age, int weight, int height, String firstName, String lastName){
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.firstName = firstName;
        this.lastName = lastName;

    }
}

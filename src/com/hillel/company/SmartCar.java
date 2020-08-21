package com.hillel.company;

public class SmartCar extends Car {

    public SmartCar() {
        super("Smart Mercedes", "Hatchback", 1, "Mechanic");
    }

    public void turnSmartRadio(boolean status){
        System.out.println(status ? "Radio is on!!" : "Radio is off. You are now so pathetic");
    }

}

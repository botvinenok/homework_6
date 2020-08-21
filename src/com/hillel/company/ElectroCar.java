package com.hillel.company;


public class ElectroCar extends Car  {

    public ElectroCar() {
        super("Tesla Model S", "Sedan", 2, "Auto");
    }

    public void turnAutopilot(boolean status){
        System.out.println(status ? "Autopilot is on!!" : "Autopilot is off. You are on your own now");
    }

}


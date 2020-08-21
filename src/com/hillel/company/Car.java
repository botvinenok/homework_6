package com.hillel.company;

public class Car extends Vehicle{
    private int engine;
    private String transmission;

    public Car(String name, String size, int engine, String transmission) {
        super(name, size);
        this.engine = engine;
        this.transmission = transmission;
        System.out.println("Your capacity engine: " + this.engine + "l and transmission is " + this.transmission);
    }

    @Override
    public void steer(int direction) {
        if (direction >= 0 && direction < 90){
            System.out.println("Starting turn right");
        }else if(direction > 90 && direction <= 180 ){
            System.out.println("Starting turn left");
        }else if(direction == 90){
            System.out.println("Keeping moving forward");
        }else{
            stop();
            System.out.println("Starting reversal");
        }
        super.steer(direction);
    }

    @Override
    public void move(int velocity, int direction) {
        if (velocity > 50){
            System.out.println("Ahead camera on 50, pls slowdown!");
        }
        super.move(velocity, direction);
    }

    @Override
    public void stop() {
        System.out.println("Car stoped");
        super.stop();
    }

    public void somethingBroken(){
        System.out.println("Turn on emergency signal");
        stop();
    }
}

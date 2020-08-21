package com.hillel.company;

import com.hillel.company.TV.RemoteController;
import com.hillel.company.TV.TV;

public class Main {

    public static void main(String[] args) {

        //region Boxer fight
        Boxer championAli = new Boxer(20,100,200);
        System.out.println("Is our champion Ali win? " +
                championAli.fight(new Boxer(17, 101, 300)));
        System.out.println("Is our champion Ali win? " +
                championAli.fight(new Boxer(55, 45, 99)));
        System.out.println();
        //endregion

        //region Dog information
        Dog pet = new Dog();
        pet.setAgeDogs(-10);
        pet.setNameDog(" ");
        System.out.println("Your dog name - " + pet.getNameDog());
        System.out.println("Your dog age - " + pet.getAgeDogs());
        //endregion

        //region Inheritance
        ProjectManager pm = new Programmer();
        IT spec = new CTO();

        HR hr = new Cleaner();
        Clerk ck = new OfficeManager();

        Worker wk1 = new Clerk();
        Worker wk2 = new IT();
        //endregion

        //region Cat information
        System.out.println();
        Cat cat = new Cat("Pee", 10,5);
        System.out.println("Cat info before change - " + cat.getName() + " | " + cat.getAge() + " | " + cat.weight);
        cat.setAge(11);
        cat.setName("Gannibal");
        System.out.println("Cat info after - " + cat.getName() + " | " + cat.getAge() + " | " + cat.weight);
        //endregion

        //region Simulate Printer
        Printer print = new Printer(15, 20, 26, 10);
        print.fillToner("Black", 15);
        print.printPage(5, true);
        System.out.println(print.getPrintedPagesCount());
        System.out.println(print.getTonerLevel());
        print.printPage(5, false);
        //endregion

        //region Car
        System.out.println();
        ElectroCar tesla = new ElectroCar();
        tesla.steer(180);
        tesla.turnAutopilot(true);
        tesla.somethingBroken();
        System.out.println();
        SmartCar smart = new SmartCar();
        smart.move(100,20);
        smart.turnSmartRadio(true);
        smart.somethingBroken();
        //endregion

        //region TV
        System.out.println();
        RemoteController pult = new RemoteController(true);
        pult.powerOn();
        pult.upVolume();
        pult.setChanel(150);
        pult.currentChannel();
        TV telek = new TV();
        telek.powerOn();
        telek.upVolume();
        telek.mute();
        telek.mute();

        //endregion*/

    }
}

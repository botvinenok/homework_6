package com.hillel.company.TV;

public class TV extends TVDevice {
    private int currentChannel;
    private int volume;
    private int previousVolume;
    private boolean isMute;

    @Override
    public void powerOn() {
        if (isOn){
            isOn = false;
            System.out.println("You press on button twice, so Tv " + modelName + " is turn off");
        }else{
            isOn = true;
            System.out.println("TV is turn on!");
        }
    }

    @Override
    public void powerOff() {
        if (isOn = false){
            isOn = true;
            System.out.println("You press off button twice, so Tv " + modelName + " is  turn on");
        }else{
            isOn = false;
            System.out.println("TV is turn off!");
        }
    }

    @Override
    public void setChanel(int channel) {
        if (isOn){
            currentChannel = channel;
        }else{
            System.out.println("Please turn on tv at first!");
        }
    }

    @Override
    public void currentChannel() {
        System.out.println("Current channel: " + currentChannel);
    }

    @Override
    public void upVolume() {
        if (volume != 100 ){
            if (isOn){
                volume += 10;
                System.out.println("Current volume " + volume);
            }else{
                System.out.println("Please turn on tv at first!");
            }
        }else{
            System.out.println("You cannot up volume its already on maximum");
        }
    }

    @Override
    public void downVolume() {
        if (isOn){
            if (volume == 0 || volume < 0){
                System.out.println("You cannot down volume its already on minimum");
            }else{
                volume -= 10;
                System.out.println("Current volume " + volume);
            }
        }else{
            System.out.println("Please turn on tv at first!");
        }
    }

    public void mute() {
        if (isOn){
            if (isMute){
                isMute = false;
                volume = previousVolume;
                System.out.println("Turn volume on. Volume " + volume);
            }else{
                previousVolume = volume;
                volume = 0;
                isMute = true;
                System.out.println("Turn volume off. Volume " + volume);
            }
        }else{
            System.out.println("Please turn on tv at first!");
        }
    }


}

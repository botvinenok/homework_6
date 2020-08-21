package com.hillel.company.TV;

public class RemoteController implements Volume, Device{
    private boolean currentStateTV;
    private int currentChannel;
    private boolean isBattery;
    private int volume;
    private int previousVolume;
    private boolean isMute;

    public RemoteController(boolean isBattery){
        this.isBattery = isBattery;
    }

    @Override
    public void powerOn() {
        if (isBattery){
            currentStateTV = true;
            System.out.println("TV is turn on!");
        }else{
            System.out.println("Batteries dont exist, pls insert new batteries");
        }
    }

    @Override
    public void powerOff() {
        if (currentStateTV = false){
            System.out.println("TV is already turned off");
        }else{
            currentStateTV = false;
            System.out.println("TV is turn off!");
        }
    }

    @Override
    public void setChanel(int channel) {
        if (currentStateTV){
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
            if (currentStateTV){
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
        if (currentStateTV) {
            if (volume == 0 || volume < 0) {
                System.out.println("You cannot down volume its already on minimum");
            } else {
                volume -= 10;
                System.out.println("Current volume " + volume);
            }
        }else{
            System.out.println("Please turn on tv at first!");
        }
    }

    @Override
    public void mute() {
        if (currentStateTV){
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

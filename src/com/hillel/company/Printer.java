package com.hillel.company;

public class Printer {
    private final int MaxTonerLevelEachColor  = 25;
    private final int TonerSpendingForPage  = 5;
    private String manufacturer;
    private String model;
    private boolean isColor;
    private String type;
    private boolean isDuplex;
    private int tonerLevelAllColors;
    private int tonerLevelMagenta;
    private int tonerLevelYellow;
    private int tonerLevelBlue;
    private int tonerLevelBlack;
    private int printedPagesCount;

    public Printer(int tonerLevelBlue, int tonerLevelMagenta, int tonerLevelYellow, int tonerLevelBlack){
        this.tonerLevelBlue = tonerLevelBlue > MaxTonerLevelEachColor ? MaxTonerLevelEachColor : tonerLevelBlue;
        this.tonerLevelMagenta = tonerLevelMagenta > MaxTonerLevelEachColor ? MaxTonerLevelEachColor : tonerLevelMagenta;
        this.tonerLevelYellow = tonerLevelYellow > MaxTonerLevelEachColor ? MaxTonerLevelEachColor : tonerLevelYellow;
        this.tonerLevelBlack = tonerLevelBlack > MaxTonerLevelEachColor ? MaxTonerLevelEachColor : tonerLevelBlack;
        tonerLevelAllColors = (this.tonerLevelBlue + this.tonerLevelMagenta + this.tonerLevelYellow + this.tonerLevelBlack) > 100 ?
                100 : (this.tonerLevelBlue + this.tonerLevelMagenta + this.tonerLevelYellow + this.tonerLevelBlack);
    }


    private void setPrintedPagesCount(int printedPagesCount) {
        this.printedPagesCount += printedPagesCount;
    }


    public int getPrintedPagesCount() {
        return this.printedPagesCount;
    }

    public String getTonerLevel() {
        return (this.tonerLevelAllColors + "%");
    }

    public void fillToner(String tonerColor, int tonerCounty){
        if (tonerLevelAllColors == 100){
            System.out.println("You cannot fill toner. It already maximum");
        }else{
            int colorCount = getTonerLevelByColor(tonerColor);

            if (colorCount == 25){
                System.out.println("You cannot fill this color, its already maximum");
            }
            else if (colorCount == 0){}
            else{
                System.out.println((colorCount + tonerCounty)> 25 ?
                        ("You cannot fill " + tonerCounty + ", its too much.You can fill to max "  + (25 - colorCount))
                        : ("You filled successfully. Toner level: " + (tonerLevelAllColors += tonerCounty) + "%"));
            }
        }
    }

    public void printPage(int countPage, boolean isDuplex){
        if (tonerLevelAllColors == 0){
            System.out.println("Please fill the printer with toner, its empty");
        }else{
            int tonerLevelForPrint = countPage * TonerSpendingForPage;
            if(tonerLevelForPrint > tonerLevelAllColors){
                System.out.println("You cannot print " + countPage +
                        ". Toner was left for: " + (tonerLevelAllColors / TonerSpendingForPage) + " pages on one side and "
                        + (int)Math.ceil((double)tonerLevelAllColors / TonerSpendingForPage / 2) + " for both side");
            }else {
                setPrintedPagesCount(isDuplex ? (int)Math.ceil((double)countPage/2) : countPage);
                tonerLevelAllColors -= tonerLevelForPrint;
            }
        }
    }

    private int getTonerLevelByColor(String tonerColor){
        if (tonerColor.isEmpty()){
            System.out.println("Sorry, but you insert empty name Color. Try again!");
            return  0;
        }else{
            switch (tonerColor.toLowerCase().trim()){
                case("black"):
                    return this.tonerLevelBlack;
                case("magenta"):
                    return this.tonerLevelMagenta;
                case("yellow"):
                    return this.tonerLevelYellow;
                case("blue"):
                    return this.tonerLevelBlue;
                default:
                    System.out.println("Sorry, but this color doesnt exist");
                    return 0;
            }
        }

    }


}

package com.hillel.company;

public class Dog {
    private int ageDogs;
    private String nameDog;

    public int getAgeDogs() { return ageDogs; }

    public void setAgeDogs(int ageDogs) {
        if (ageDogs == 0 | ageDogs < 0){
            System.out.println("Your pet age cant be 0, so i think you want to write 1 year");
            this.ageDogs = 1;
        }else {
            this.ageDogs = ageDogs;
        }
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        if (nameDog.trim().isEmpty()){
            System.out.println("Your pet name cant be empty, so i named him Bobby");
            this.nameDog = "Bobby";
        }else{
            this.nameDog = nameDog;
        }

    }

}

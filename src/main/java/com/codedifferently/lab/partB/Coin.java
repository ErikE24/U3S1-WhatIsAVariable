package com.codedifferently.lab.partB;

public class Coin {
    private String name;
    private double value;



    public Coin(String name, double value){
        this.name = name;
        this.value = value;
    }

    public String printCoin() {
        return "name "+ name +" value "+ value;
}
}

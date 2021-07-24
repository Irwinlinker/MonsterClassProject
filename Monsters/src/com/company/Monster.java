//Robert Marsh
//Sept 9, 2020
//Program for the blueprints of my monsters


package com.company;

public class Monster {
    //attributes/variables
    private String name;
    private String type;
    private int bitten;
    private String cry;

    public Monster(String name, String type, int bitten, String cry)//constructor for monsters
    {
        //sets variables
        this.name = name;
        this.type = type;
        this.bitten = bitten;
        this.cry = cry;
    }
    //setters and getters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getBitten(){
        return bitten;
    }

    public void setBitten(int bitten){
        this.bitten = bitten;
    }

    public void cry()//method for each monster to cry
    {
        System.out.println("Before I bite, I must let out a cry, " + cry + "!!!");
    }

    @Override//string override
    public String toString() {
        return name + " is a " + type + " and has bitten " + bitten + " people!";
    }
}

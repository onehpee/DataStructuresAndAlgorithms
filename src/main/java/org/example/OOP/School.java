package org.example.OOP;

public class School extends District{
    private int districtNum;
    private String location;
    private String name;

    private String principal;

    private String mascot;


    public School(){}
    @Override
    public double Multiply(double a, int b){
        return 2 * a * b;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

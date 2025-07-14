package com.gmail.ahmedded.practise.getSetConstructor;

public class Bazik {
    private String color;
    private int number;
    private int wheel;

    public Bazik(String color, int number, int wheel) {
        this.color = color;
        this.number = number;
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String toString(){
        String result = "Color car :" + getColor() + " Wheel car :" + getWheel() + " Nember car :" + getNumber();
        System.out.println(result);
        return result;
        }
    }

package com.gmail.ahmedded.practise.constructor;

import java.sql.SQLOutput;


public class Baza {
    private String name;
    private int phone;

    public Baza(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String toString(){
        String result = "Name :" + name + " Phone :" + phone;
        System.out.println(result);
        return result;
    }
}

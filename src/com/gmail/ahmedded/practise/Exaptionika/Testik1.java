package com.gmail.ahmedded.practise.Exaptionika;

public class Testik1 {
    public static void main(String[] args){
        try {
            int calc = 10 / 0;
            throw new Ups("Dont do it");
        } catch (Exception e) {
            System.out.println("Шо" + e.getMessage());
        }
    }
}

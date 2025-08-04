package com.gmail.ahmedded.practise.equals;

public class main {
    public static void main(String[] args){
        String a = "Javiki";
        String b = "Javiki";

        System.out.println(a == b);

        if(a.hashCode() == b.hashCode()){
            System.out.println(a.hashCode() + " == " + b.hashCode());
        }

        System.out.println(a.equals(b));
    }
}

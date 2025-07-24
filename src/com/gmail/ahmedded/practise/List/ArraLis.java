package com.gmail.ahmedded.practise.List;

import java.util.List;
import java.util.ArrayList;

public class ArraLis {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Bmw");
        cars.add("Audi");
        cars.add("Nisan");
        cars.add("Opel");

        System.out.println(cars);

        cars.add(0, "Mercedes");

        System.out.println(cars);

        cars.set(3, "Alfa romeo");

        System.out.println(cars);

        System.out.println(cars.get(1));

        cars.remove("Opel");

        for(int i = 0; i < cars.size(); i++){
            System.out.println(i + " " + cars.get(i));
        }

    }
}

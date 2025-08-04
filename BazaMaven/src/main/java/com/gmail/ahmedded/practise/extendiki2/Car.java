package com.gmail.ahmedded.practise.extendiki2;

public class Car extends Transport{
    @Override
    public void Start(){
        super.Start();
        System.out.println("ChchchchcCar");
    }

    @Override
    public void Bibikat(){
        System.out.println("BipOnCar");
    }
}

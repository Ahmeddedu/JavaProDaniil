package com.gmail.ahmedded.practise.extendiki2;

public class Bike extends Transport{
    @Override
    public void Start(){
        super.Start();
        System.out.println("ChchchchcBike");
        System.out.println("Stop what ?");
    }

    @Override
    public void Bibikat(){
        System.out.println("BipOnBike");
    }
}

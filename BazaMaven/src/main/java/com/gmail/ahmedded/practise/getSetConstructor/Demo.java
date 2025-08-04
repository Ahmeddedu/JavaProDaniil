package com.gmail.ahmedded.practise.getSetConstructor;

public class Demo {
    public static void main(String[] args){
        Bazik car1 = new Bazik("White" , 8999 , 4);
        car1.toString();

        car1.setWheel(6);
        car1.toString();

        Bazik car2 = new Bazik("White" , 8999 , 4);

        Bazik car3 = car2;
        car2.toString();
        car3.toString();

        System.out.println(car2 == car3);

        Bazik car10 = new Bazik("White" , 8999 , 4);
        car10.toString();
        Bazik car20 = new Bazik("White" , 8999 , 4);
        car20.toString();

        System.out.println(car10 == car20);
        System.out.println(car10.hashCode());
        System.out.println(car20.hashCode());

        System.out.println(car10.getColor());
        car10.setColor("Grey");
        System.out.println(car10.getColor());





    }
}

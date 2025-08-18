package com.gmail.ahmedded.practise.getSetTest.FileSaver;

import lombok.SneakyThrows;

public class PolzSet {
    @SneakyThrows
    public static void main(String[] args){

        Methodiki met = new Methodiki();

        System.out.println("Hello its program to make your local data :)");
        Thread.sleep(2500);
        BazaDoc polz = met.collectData();

        System.out.println(polz);

        int rezForMakeFile = met.ask("If you want to make wilr .txt with your date type 1 or if you dont want type 2");
        if(rezForMakeFile == 1){
            Thread.sleep(2500);
            met.nameFile(polz);
            met.createFile(polz);

        } else if (rezForMakeFile == 2) {
            Thread.sleep(2500);
            System.out.println("Ok file not make it is your choise");
            System.exit(0);
        }else{
            Thread.sleep(2500);
            System.out.println("You chose not 1 and 2 so file dont make buy");
            System.exit(0);
        }
    }
}

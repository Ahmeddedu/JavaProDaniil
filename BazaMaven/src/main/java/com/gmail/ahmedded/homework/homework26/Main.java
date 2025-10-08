package com.gmail.ahmedded.homework.homework26;

public class Main {
    public static void main(String[] args) {
        User user = new User("Кикоть Кикотев");

        Address address = new Address("Одеса", "Аркадия люимая", "15");

        user.setAddress(address);

        user.showUserInfo();
    }
}


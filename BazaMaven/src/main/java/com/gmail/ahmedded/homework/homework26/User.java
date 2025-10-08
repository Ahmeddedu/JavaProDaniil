package com.gmail.ahmedded.homework.homework26;

public class User {
    private String name;
    private Address address;

    public User(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void showUserInfo() {
        System.out.println("Имя - " + name);
        System.out.println("Адрес - " + address);
    }
}


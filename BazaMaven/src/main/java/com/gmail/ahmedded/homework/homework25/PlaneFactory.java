package com.gmail.ahmedded.homework.homework25;

public class PlaneFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}


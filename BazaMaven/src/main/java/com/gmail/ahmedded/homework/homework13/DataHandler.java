package com.gmail.ahmedded.homework.homework13;

public class DataHandler {

    private final Locker lock = new Locker();

    public synchronized int modify(int num) {
        lock.lock();
        try {
            num = num * 3;
            return num;
        } finally {
            lock.unlock();
        }
    }
}

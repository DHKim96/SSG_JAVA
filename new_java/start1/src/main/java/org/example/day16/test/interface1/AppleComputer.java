package org.example.day16.test.interface1;

public class AppleComputer implements Computer{

    @Override
    public void start() {
        System.out.println("Apple computer start");
    }

    @Override
    public void shutdown() {
        System.out.println("Apple computer shutdown");
    }

    @Override
    public void restart() {
        System.out.println("Apple computer restart");
    }
}

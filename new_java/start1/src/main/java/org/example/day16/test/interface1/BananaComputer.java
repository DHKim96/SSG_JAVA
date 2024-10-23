package org.example.day16.test.interface1;

public class BananaComputer implements Computer{
    @Override
    public void start() {
        System.out.println("Banana start");
    }

    @Override
    public void shutdown() {
        System.out.println("Banana shutdown");
    }

    @Override
    public void restart() {
        System.out.println("Banana restart");
    }
}

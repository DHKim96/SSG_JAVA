package org.example.day10.생성자;

public class Car2 {
    //필드, 멤버변수
    String model;
    String color;
    int maxSpeed;


    public Car2(){
        System.out.println("객체 생성됨!");
    }

    public Car2(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car2(String model) {
        this.model = model;
    }

    //멤버메서드
    public void speedUp(){
        System.out.println("속도UP!");
    }
}
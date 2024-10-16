package org.example.day12.상속.문제.직원;

public class 매니저 extends 직원{
    int bonus;

    public 매니저(String name, int age, int salary, String ssn, int bonus) {
        super(name, age, salary, ssn);
        this.bonus = bonus;
    }

    public void test(){
        System.out.println("테스트");
    }
}

package org.example.day12.상속.문제.직원;

public class 직원 {
    String name;
    int age;
    int salary;
    String ssn;

    public 직원(String name, int age, int salary, String ssn) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "직원{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}

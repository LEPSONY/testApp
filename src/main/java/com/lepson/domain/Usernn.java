package com.lepson.domain;

public class Usernn {
    private String name;
    private String last;
    private String age;
    private String number;

    public Usernn() {
    }

    public Usernn(String name, String last, String age, String number) {
        this.name = name;
        this.last = last;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

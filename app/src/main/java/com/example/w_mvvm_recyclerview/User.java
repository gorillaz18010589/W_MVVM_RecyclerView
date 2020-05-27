package com.example.w_mvvm_recyclerview;

public class User {
    private String name;
    private String age;
    private String adder;

    public User(String name, String age, String adder) {
        this.name = name;
        this.age = age;
        this.adder = adder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdder() {
        return adder;
    }

    public void setAdder(String adder) {
        this.adder = adder;
    }
}

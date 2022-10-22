package com.project.deliverysystem.models;

public class User {
    private int age;
    private String name;

    public User(int arg_age, String arg_name){
        this.age = arg_age;
        this.name = arg_name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return  this.age;
    }
}

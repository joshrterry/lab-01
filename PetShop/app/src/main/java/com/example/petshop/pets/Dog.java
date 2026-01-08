package com.example.petshop.pets;

import com.example.petshop.Pettable;

import java.util.Date;

public class Dog extends Pet implements Pettable {

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }
    @Override
    public String speak() {
        return "bark";
    }

    @Override
    public Void pet() {
        return null;
    }
}

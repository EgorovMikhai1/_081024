package com.app._17_12_2024;

import lombok.Getter;
import lombok.ToString;

@Getter
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        System.out.println("ANIMAL");
        this.name = name;
        this.age = age;
    }

    public void makeVoice() {
        System.out.println("ANIMAL MAKE NOISE");
    }

    @Override
    public String toString() {
        return "Animal";
    }
}

class Person22 {
    public static void main(String[] args) {

    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
        System.out.println("CAT");
    }

    @Override
    public void makeVoice() {
        System.out.println("CAT MAKE NOISE");
    }
}

class Dog extends Animal {
    private Person22 person22;

    public Dog(String name, int age, Person22 person22) {
        super(name, age);
        this.person22 = person22;
    }
}

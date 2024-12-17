package com.app._17_12_2024;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        System.out.println("ANIMAL");
        this.name = name;
        this.age = age;
    }
}

class Person22 {
    public static void main(String[] args) {
        Cat cat = new Cat("name", 1);

    }

}

class Cat extends Animal {
    public Cat(String name, int age) {
        System.out.println("CAT");
        super(name, age);
    }
}

class Dog extends Animal {
    private Person22 person22;

    public Dog(String name, int age, Person22 person22) {
        super(name, age);
        this.person22 = person22;
    }
}
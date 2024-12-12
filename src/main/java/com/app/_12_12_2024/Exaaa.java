package com.app._12_12_2024;

public class Exaaa {

    Box box;

    public Exaaa(Box box) {
        this.box = box;
    }
}

class Box {
    int b;

    public Box(int b) {
        this.b = b;
    }
}


class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        for (int i = 0; i < a.length; i++) {

        }

        Box[] boxes = {new Box(1), new Box(2)};

        for (int i = 0; i < boxes.length; i++) {

        }

        Exaaa[] exaaas = {new Exaaa(new Box(1)), new Exaaa(new Box(2))};

        for (int i = 0; i < exaaas.length; i++) {

        }
    }
}
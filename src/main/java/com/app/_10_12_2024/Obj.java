package com.app._10_12_2024;

public class Obj {
    Obj up;
    Obj down;
    Obj right;
    Obj left;

    public static void main(String[] args) {
        Obj centerObj = new Obj();

        centerObj.up = new Obj();
    }
}
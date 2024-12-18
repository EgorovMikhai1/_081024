package com.app._05_12_2024;

import com.app._17_12_2024.Animal;
import com.app._17_12_2024.Generator;

import java.util.Random;

public class Str2 {

    public int[] doS(int l) {
        int[] array = ggg(l);
        for (int i = 0; i < l; i++) {
            array[i] = genR();
        }
        return array;
    }

    private int genR() {
        return new Random().nextInt(100);
    }

    private int[] ggg(int l) {
        return new int[l];
    }

    public static void main(String[] args) {
        String s1 = "WWW";
        String s2 = "WWW";
        String s3 = new String("WWW");


        Animal an = new Generator().getAnimal();
        System.out.println(an);
    }
}

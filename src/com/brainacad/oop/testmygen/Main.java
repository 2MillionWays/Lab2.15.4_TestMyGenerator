package com.brainacad.oop.testmygen;


public class Main {
    public static void main(String[] args) {
        MyNumGenerator test = new MyNumGenerator(5,64);
        System.out.println(test.generate());
    }
}

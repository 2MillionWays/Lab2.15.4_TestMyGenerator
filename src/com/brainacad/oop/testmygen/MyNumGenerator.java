package com.brainacad.oop.testmygen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }
    public List<Integer> generate(){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i<numOfElm;i++){
            Random rnd = new Random();
            int index = rnd.nextInt(maxNumb);
            result.add(index);
        }
        return result;
    }
}

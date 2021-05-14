package com.company;

import java.util.Random;

public class Skeleton extends Boss{

    private int countArrows;


    public int getCountArrows() {

        for(int i = 1; i < 11; i++){
        Random random = new Random();
        countArrows = random.nextInt(i);}

        return countArrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " " + getCountArrows();
    }
}

package com.company;

public class Skeleton extends Boss{

    private int countArrows= 10;

    public int getCountArrows() {

        //countArrows = 10;
        return countArrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " " + countArrows;
    }
}

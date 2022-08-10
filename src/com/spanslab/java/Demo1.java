package com.spanslab.java;

import com.spanslab.formula.Area;

public class Demo1 {


    public static void main(String[] args) {

        byte a=127;
        short b=20;

        int c=30;

        double d=10.2;

        d=c;

        c=b;
        c=a;

        d=a; //possible - byte to double
        d=b; //possible - short to double
        d=c; //possible - int to double

//        c=d; //not possible //double to int


    char letter='#'; //16 bits of memory
    boolean check=true;

        String name="bala"; //6*16 bits of memory
    }
}




package com.spanslab.java;

import com.spanslab.formula.Area;

public class Demo2 {

    public static void main(String[] args) {

        Area.pi=500;
        System.out.println(Area.pi);

        Area obj=new Area(); //we are loading the non-static variable and methods

        double output=obj.areaOfCircle(10);
        System.out.println(output);

        System.out.println(obj.a); //just calling the non-static variable

        output= Area.areaOfRectangle(10,10);
        System.out.println(output);

       String name= Area.getAuthorName();
       System.out.println(name);

       Area.quit();
    }
}




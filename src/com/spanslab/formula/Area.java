package com.spanslab.formula;

public class Area {
    public static double pi=3.14;
    public int a=10;

    public double areaOfCircle(double r)
    {
        double res= Area.pi*r*r;
        return res;
    }

    public static double areaOfRectangle(double length,double width)
    {
        return length*width;
    }

    public static double areaOfTriangle(double base,double height)
    {
        return (base*height)/2;
    }

    //areaOfTrapezium()

    public static String getAuthorName()
    {
        return "Balaji Dinkaran";
    }

    public static void quit()
    {

    }

}

package com.nix.module1;

public class SquareTringle {

        public double square(Point A,Point B,Point C)
        {
        double result=(((B.x-A.x)*(C.y-A.y)-(C.x-A.x)*(B.y-A.y)));

        return result/2;
    }
    public static class Point
    {
        int x;
        int y;
        public Point(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
}

package com.nix.module1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTringleTest {
    public SquareTringle squareInst;
    @Before
    public void before()
    {
        System.out.println("Before running...");
        squareInst= new  SquareTringle();
    }

    @Test
    public void square() {
        double result=squareInst.square ( new SquareTringle.Point(1,1),new SquareTringle.Point(2,4),new SquareTringle.Point(3,8));
        Assert.assertEquals(0.50,result,0.0);
    }
    @Test
    public void square2() {
        double result=squareInst.square( new SquareTringle.Point(3,4),new SquareTringle.Point(8,10),new SquareTringle.Point(-3,5));
        Assert.assertEquals(20.50,result,0.0);
    }
}
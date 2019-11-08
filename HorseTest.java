package com.nix.module1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {

    public Horse horseInst;
    @Before
    public void before()
    {
        System.out.println("Before running...");
        horseInst= new Horse();
    }
    @Test
    public void check() {
        boolean result=horseInst. check(new Horse.Point(1,2), new Horse.Point(3,3));
        Assert.assertTrue(result);
    }
    @Test
    public void check2() {
        boolean result=horseInst.check(new Horse.Point(1,2), new Horse.Point(6,8));
        Assert.assertFalse(result);
    }
}
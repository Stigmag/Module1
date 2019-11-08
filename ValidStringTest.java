package com.nix.module1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidStringTest {

    public ValidString validInst;

    @Before
    public void before() {
        System.out.println("Before running...");
        validInst = new ValidString();
    }

    @Test
    public void isValid() {
        String text = "((((){{})))" ;
        Assert.assertFalse(validInst.isValid(text));
    }
    @Test
    public void isValid2() {
        String text="((((){{})))}";
        Assert.assertFalse(validInst.isValid(text));
    }
}
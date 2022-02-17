package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineKittensParamTest {
    private final int kittensCount;
    private final int expected;

    public FelineKittensParamTest(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getNumberOfKittens() {
        return new Object[][]{
                {0, 0},
                {2, 2},
                {5, 5},
                {100, 100},
        };
    }

    @Test
    public void checkFelineHasKittens() {
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens(kittensCount));
    }

}
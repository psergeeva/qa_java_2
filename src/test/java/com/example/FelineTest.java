package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void checkEatingMeat() throws Exception {
        Feline feline = new Feline();

        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected,actual);

    }

    @Test
    public void checkFamily() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        assertEquals(expectedResult,feline.getFamily());

    }

    @Test
    public void testFelineGetOneKitten() {
        Feline feline = new Feline();
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }
}
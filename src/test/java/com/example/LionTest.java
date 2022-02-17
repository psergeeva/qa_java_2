package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void checkGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getKittens()).thenReturn(1);

        int expectedNumberOfKittens = 1;
        int actualNumberOfKittens = lion.getKittens();
        assertEquals(expectedNumberOfKittens, actualNumberOfKittens);
    }

    @Test
    public void checkGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);

    }

    @Test
    public void constructorThrowsExceptionOnNullTitle() throws Exception {
        Exception exception = null;
        try {
            Lion lion = new Lion(null, feline);
        } catch (Exception ex) {
            exception = ex;
        }

        assertNotNull(exception);
        assertEquals("Используйте допустимые значения пола животного - самец или самка",exception.getMessage());
    }
}

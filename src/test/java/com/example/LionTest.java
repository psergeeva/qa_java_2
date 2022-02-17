package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

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
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected,actual);

    }
}

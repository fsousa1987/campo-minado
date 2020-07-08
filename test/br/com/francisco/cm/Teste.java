package br.com.francisco.cm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Teste {

    @Test
    public void testarSeIgualADois() {
        int a = 1 + 1;
        assertEquals(2, a);
    }

    @Test
    public void testarSeIgualATres() {
        int x = 2 + 10 - 9;
        assertEquals(3, x);
    }
}

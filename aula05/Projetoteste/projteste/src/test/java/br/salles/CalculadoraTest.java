package br.salles;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    public void devRetornarASomaDosValores() {
        Calculadora c = new Calculadora();

        double resultado = c.somar(10, 20);

        assertEquals("",30, resultado,0);
    }

}

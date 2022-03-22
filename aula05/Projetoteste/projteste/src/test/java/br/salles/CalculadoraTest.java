package br.salles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
    private Calculadora c;
    
    @BeforeEach
    public void setup(){
        c = new Calculadora();
    }

    @Test
    public void devRetornarASomaDosValores() {
        double resultado = c.somar(10, 20);
        assertEquals(30, resultado);
    }

    @Test
    public void devRetornarADiferencaDosValores(){
        double resultado = c.subtrair(20,10);
        assertEquals(10, resultado);
    }

    @Test
    public void  devRetornarAMultiplicacaoDosValores(){
        double resultado = c.Multiplicaca(20,10);
        assertEquals(200, resultado);
    }


    @Test
    public void devRetornarAdivicaoDosValoresDiferenteDeZero(){
        double resultado = c.divicao(20,10);
        assertEquals(2, resultado);
    }
    @Test
    public void devRetornarNegativoQuandoODenominadoIgualAZero(){
        double resultado = c.divicao(20,0);
        assertEquals(-1, resultado);
    }


}

package projModelo.test.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import projModelo.model.Conta;
import projModelo.model.ContaCorrente;

/**
 * Unit test for simple App.
 */
public class ContaCorrenteTest 
{
    @Test
    public void deveRetornarOvalorMenosOSaque(){
        Conta cc = new ContaCorrente(2222, 500);
        cc.saque(50);
        assertEquals(450,cc.getSaldo());
    }

}

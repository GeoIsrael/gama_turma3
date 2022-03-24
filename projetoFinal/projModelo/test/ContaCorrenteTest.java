package projModelo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import projModelo.modelo.Conta;
import projModelo.modelo.ContaCorrente;

/**
 * Unit test for simple App.
 */
public class ContaCorrenteTest 
{
    @Test
    public void deveRetornarOvalorMenosOSaque(){
        Conta cc = new ContaCorrente(2222, 500);
        cc.deposita(50);
        assertEquals(550, cc);
    }

}

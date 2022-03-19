package etapa1;

import javax.swing.text.html.HTMLDocument.BlockElement;

public class ContaCorrente extends Conta {

    @Override
    public double saque(double valorDoSaque) {
        if(getSaldo()>valorDoSaque){
            saque(valorDoSaque);

        };
        return getSaldo();
    }
    
}

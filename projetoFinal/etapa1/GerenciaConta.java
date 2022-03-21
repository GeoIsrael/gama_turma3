package etapa1;

import java.util.ArrayList;

public class GerenciaConta {
    public static void main(String[] args) {
        ArrayList<Conta> gerenciamentoDeContas = new ArrayList<>();

        ContaCorrente cc1 = new ContaCorrente(0, 0);
        ContaCorrente cc2 = new ContaCorrente(0, 0);
        ContaEspecial ce1 = new ContaEspecial(0, 0);

        gerenciamentoDeContas.add(cc1);
        gerenciamentoDeContas.add(cc2);
        gerenciamentoDeContas.add(ce1);


        for (Conta c: gerenciamentoDeContas){
            System.out.println(c.getNumero());
        }


    
        
    }


    

    

    

}

package etapa1;

public class ContaEspecial extends Conta{
    double limite=200;


    @Override
    public double saque(double valorDoSaque) {
        double limiteDeTransação=getSaldo()+limite;
        if(limiteDeTransação>valorDoSaque){
            saque(valorDoSaque);

        };
        return getSaldo();
    }
}

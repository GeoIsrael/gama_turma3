package etapa1;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double saque(double valorDoSaque) {
        if(getSaldo()>=valorDoSaque){
            super.saque(valorDoSaque);
        }
        return getSaldo();
    }
    
}

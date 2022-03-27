package projModelo.model;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public double saque(double valorDoSaque) {
        if (getSaldo() >= valorDoSaque) {
            super.saque(valorDoSaque);
        }
        return getSaldo();
    }

}

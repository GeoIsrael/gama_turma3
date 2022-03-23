package projModelo.modelo;

public class ContaEspecial extends Conta {
    public ContaEspecial(int numero, double saldo) {
        super(numero, saldo);
    }

    double limite;

    @Override
    public double saque(double valorDoSaque) {
        double limiteDeTransação = getSaldo() + limite;
        if (limiteDeTransação > valorDoSaque) {
            super.saque(valorDoSaque);

        }
        ;
        return getSaldo();
    }
}

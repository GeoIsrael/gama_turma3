package projModelo.modelo;

public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void mostrarDados() {
        System.out.println(numero + " " + saldo);

    }

    public double deposita(double valorDoDeposito) {
        if (valorDoDeposito > 0)
            this.saldo += valorDoDeposito;
        return saldo;

    }

    public double saque(double valorDoSaque) {
        if (valorDoSaque > 0)
            this.saldo -= valorDoSaque;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + ": " + saldo;
    }

}

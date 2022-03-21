package etapa1;

abstract class Conta {
    private int numero;
    private double saldo;


    public Conta(int numero, double saldo){
        this.numero=numero;
        this.saldo= saldo;
    }


    public void mostrarDados(){
        System.out.println(numero + " " + saldo);

    }

    public double deposita(double valorDoDeposito){
        this.saldo+=valorDoDeposito;
        return saldo;

    }

    public double saque(double valorDoSaque){
        return this.saldo-=valorDoSaque;
    }


    public double getSaldo() {
        return saldo;
    }
    
    public int getNumero() {
        return numero;
    }

}

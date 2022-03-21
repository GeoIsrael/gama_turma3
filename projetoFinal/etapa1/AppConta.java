package etapa1;

public class AppConta {
    public static void main(String[] args) {

        Conta conta1 = new ContaCorrente(0, 5000);

        conta1.saque(4000);
        conta1.mostrarDados();

    }
}

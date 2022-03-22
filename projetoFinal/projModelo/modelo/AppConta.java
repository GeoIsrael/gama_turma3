package projModelo.modelo;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GerenciaConta contas = new GerenciaConta();
        int opcao = 0;
        int numero;
        double saldo;
        String entradaDigitada;
        Conta c;

        Conta conta1 = new ContaCorrente(0, 5000);

        while (opcao!=4){
            System.out.println("****** BEM-VINDO AO NEWBANK S2******");
            System.out.println("Oque Desejas?");
            System.out.println("1-Criar Conta Corrente");
            System.out.println("2-Criar Conta Especial");
            System.out.println("3-Consultar Conta");
            System.out.println("4-Sair");

            entradaDigitada = teclado.nextLine();
            opcao = Integer.parseInt(entradaDigitada);

            switch(opcao){
                case 1:
                    System.out.println("Digite o numero da conta:");
                    entradaDigitada = teclado.nextLine();
                    numero = Integer.parseInt(entradaDigitada);
                    System.out.println("Digite o saldo da Conta:");
                    entradaDigitada = teclado.nextLine();
                    saldo = Integer.parseInt(entradaDigitada);
                    c = new ContaCorrente(numero, saldo);
                    contas.adicionar(c);
                    break;

        
                case 2:
                    System.out.println("Digite o numero da conta:");
                    entradaDigitada = teclado.nextLine();
                    numero = Integer.parseInt(entradaDigitada);
                    System.out.println("Digite o saldo da Conta:");
                    entradaDigitada = teclado.nextLine();
                    saldo = Integer.parseInt(entradaDigitada);
                    c = new ContaEspecial(numero, saldo);
                    contas.adicionar(c);
                    break;

                case 3:
                    System.out.println("Digite o código para procurar:");
                    entradaDigitada = teclado.nextLine();
                    numero = Integer.parseInt(entradaDigitada);
                    System.out.println(contas.exibir(numero));
                    break;


                case 4:
                    System.out.println("Fim do programa.");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        teclado.close();

        
    }
}

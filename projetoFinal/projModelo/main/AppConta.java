package projModelo.main;

import java.util.Scanner;

import projModelo.modelo.Conta;
import projModelo.modelo.ContaCorrente;
import projModelo.modelo.ContaEspecial;
import projModelo.util.GerenciaConta;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GerenciaConta contas = new GerenciaConta();
        int opcao = 0;
        int numero;
        double saldo;
        double valorASacar;
        String entradaDigitada;
        Conta c;

        while (opcao != 7) {
            System.out.println("****** BEM-VINDO AO NEWBANK S2******");
            System.out.println("Oque Desejas?");
            System.out.println("1 - Criar Conta Corrente");
            System.out.println("2 - Criar Conta Especial");
            System.out.println("3 - Consultar Conta");
            System.out.println("4 - Efetuar Saque em uma conta");
            System.out.println("5 - Efetuar Deposito em uma conta");
            System.out.println("6 - Excluir Conta");
            System.out.println("7 - Sair");

            System.out.println("Faça sua escollha");
            entradaDigitada = teclado.next();
            opcao = Integer.parseInt(entradaDigitada);

            switch (opcao) {
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
                    System.out.println("Digite o numero da conta para procurar:");
                    entradaDigitada = teclado.nextLine();
                    numero = Integer.parseInt(entradaDigitada);
                    System.out.println(contas.exibir(numero));
                    break;

                case 4:
                    System.out.println("Digite o numero da conta:");
                    entradaDigitada = teclado.nextLine();
                    numero = Integer.parseInt(entradaDigitada);
                    System.out.println("Digite o valor  para sacar:");
                    entradaDigitada = teclado.nextLine();
                    valorASacar = Integer.parseInt(entradaDigitada);
                    boolean alterou = contas.sacarNaConta(numero, valorASacar);
                    if (alterou) {
                        System.out.println("Saque efetuado com sucesso");
                    } else {
                        System.out.println("Saque Não efetuado");
                    }
                    break;

                case 5:
                    System.out.println("Digite o numero da conta:");
                    entradaDigitada = teclado.nextLine();
                    numero = Integer.parseInt(entradaDigitada);
                    System.out.println("Digite o valor  para Depositar:");
                    entradaDigitada = teclado.nextLine();
                    valorASacar = Integer.parseInt(entradaDigitada);
                    boolean validacao = contas.depositarNaConta(numero, valorASacar);
                    if (validacao) {
                        System.out.println("Deposito efetuado com sucesso");
                    } else {
                        System.out.println("Deposito Não efetuado");
                    }
                    break;

                case 6:
                    System.out.println("Digite o código a ser removido:");
                    entradaDigitada = teclado.nextLine();
                    numero = Integer.parseInt(entradaDigitada);
                    boolean removeu = contas.remover(numero);
                    if (removeu) {
                        System.out.println("Removido com sucesso");
                    } else {
                        System.out.println("Não foi possível remover");
                    }
                    break;

                case 7:
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

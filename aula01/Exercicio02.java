import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);


    
        double salario, credito, limite;
        boolean validade;


        System.out.println("Qual o Seu Salario?");
        salario = teclado.nextDouble();


        System.out.println("Qual o valor do credito que você deseja?");
        credito= teclado.nextDouble();

        limite=salario*0.3;

        validade= credito>limite;

        System.out.println(validade);

        if(validade){
            System.out.println("credito aprovado");
        } else {
            System.out.println("credito Negado");
        }
    }
}

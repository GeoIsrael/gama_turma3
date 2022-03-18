import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        double nota1, nota2, media;

        nota1 = leitor.nextDouble();

        nota2 = leitor.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println(media);

        leitor.close();

    }

}
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero, contador;

        contador=1;


        numero= teclado.nextInt();


        while (contador<=numero){
            System.out.println(contador);
            contador++;

        }

        teclado.close();

    }
}

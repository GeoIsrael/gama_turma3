import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador, chute;
        contador =0;
        chute=1;
        

        while (chute!=0){
            chute=teclado.nextInt();
            contador=contador+chute;
        }
        System.out.println(contador);
    }
}

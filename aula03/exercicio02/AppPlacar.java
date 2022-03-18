package exercicio02;

public class AppPlacar {
    public static void main(String[] args) {

        Placar jogo1 = new Placar("Fortaleza", "Ceara", 10, -2);
        Placar jogo2 = new Placar("Fortaleza", "Flamengo");
        Placar jogo3 = new Placar();

        jogo1.mostrarPlacar();
        jogo2.mostrarPlacar();
        jogo3.mostrarPlacar();
        


    }
}

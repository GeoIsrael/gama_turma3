package exercicio02;

public class teste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("civc", "gol", 10.0);

        carro1.getConsumo();

        carro1.setCobsumo(50);

        carro1.getConsumo();
    }
}

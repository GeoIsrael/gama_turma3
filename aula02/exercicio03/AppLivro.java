package exercicio03;

public class AppLivro {
    public static void main(String[] args) {
        Ebook livro1 = new Ebook("Machado de Assis", "autor", -1);

        livro1.mostrar();

        livro1.avancarUmaPagina();

        livro1.mostrar();
    }
}

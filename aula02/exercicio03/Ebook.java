package exercicio03;

public class Ebook {
    private String titulo, autor;
    private int totalDePaginas, NumeroDaPaginaAtual;

    public Ebook (String titulo, String autor,int totalDePaginas){
        this.titulo=titulo;
        this.autor = autor;
        this.totalDePaginas=totalDePaginas;
        this.NumeroDaPaginaAtual=1;
    }

    public void avancarUmaPagina(){
        NumeroDaPaginaAtual++;
    }

    public void voltarUmaPagina(){
        NumeroDaPaginaAtual--;
    }

    public int mudarPaginaAtual(int novaPagina){
        this.NumeroDaPaginaAtual=novaPagina;
        return NumeroDaPaginaAtual;
    }

    public void mostrarPaginaAtual(){
        System.out.println(NumeroDaPaginaAtual);
    }

    public void mostrar(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(totalDePaginas);
        System.out.println(NumeroDaPaginaAtual);
    }

}

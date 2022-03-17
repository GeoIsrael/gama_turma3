package exercicio03;

public class Ebook {
    private String titulo, autor;
    private int totalDePaginas, NumeroDaPaginaAtual;

    public Ebook (String titulo, String autor,int totalDePaginas){
        this.titulo=titulo;
        this.autor = autor;
        setTotalDePaginas(totalDePaginas);
        this.NumeroDaPaginaAtual=1;
    }

    public void avancarUmaPagina(){
        if(NumeroDaPaginaAtual<totalDePaginas)
        NumeroDaPaginaAtual++;
    }

    public void voltarUmaPagina(){
        if(NumeroDaPaginaAtual>1)
        NumeroDaPaginaAtual--;
    }

    public int mudarPaginaAtual(int novaPagina){
        if (novaPagina<=this.totalDePaginas)
        this.NumeroDaPaginaAtual=novaPagina;
        else
        System.out.println("O livro não tem essa pagina");
        return NumeroDaPaginaAtual;
    }

    public void mostrarPaginaAtual(){
        System.out.println(NumeroDaPaginaAtual);
    }

    public void mostrar(){
        System.out.println("*****__ Bem-Vindo ao APP de Livros Online *-* __****");
        System.out.println("O Titulo do seu Atual livro é: "+titulo);
        System.out.println("O autor do seu Livro é: "+autor);
        System.out.println("Você está na pagina: "+NumeroDaPaginaAtual);
        System.out.println("O seu livro tem: "+totalDePaginas+" Paginas");
        System.out.println("");
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas) {
        if (totalDePaginas>0)
        this.totalDePaginas = totalDePaginas;
    }

    

}

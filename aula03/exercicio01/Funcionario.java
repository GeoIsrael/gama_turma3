package aula03.exercicio01;

public class Funcionario {
    private String nome;
    protected int hora;
    protected int valorDaHora;
    protected int salarioFinal;

    public Funcionario (String nome,int hora, int valorDaHora){
        this.nome=nome;
        this.hora=hora;
        this.valorDaHora=valorDaHora;
    }

    public double salarioFinal (){

        salarioFinal=hora*valorDaHora;

        return salarioFinal;
    }

    public void exibirDados(){
        System.out.println(nome);
        System.out.println(hora);
        System.out.println(valorDaHora);
    }

    public void setHora(int hora) {
        if (hora>0)
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public String getNome() {
        return nome;
    }

    public void setValorDaHora(int valorDaHora) {
        if(valorDaHora>0)
        this.valorDaHora = valorDaHora;
    }


}

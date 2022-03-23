package exercicio01;

public class FuncionarioSenior extends Funcionario{

    

    int bonus=500, pontuaçãoDeBonus,adicional;

    public FuncionarioSenior(String nome, int hora, int valorDaHora) {
        super(nome, hora, valorDaHora);
    }


    @Override
    public double salarioFinal() {
        super.salarioFinal();
        pontuaçãoDeBonus=hora/10;
        adicional=bonus*pontuaçãoDeBonus;
        return adicional+super.salarioFinal;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }
}

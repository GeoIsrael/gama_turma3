package aula03.exercicio01;

public class FuncionarioSenior extends Funcionario{

    

    int bonus=500, pontuaçãoDeBonus,adicional;

    public FuncionarioSenior(String nome, int hora, int valorDaHora) {
        super(nome, hora, valorDaHora);
        //TODO Auto-generated constructor stub
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
        // TODO Auto-generated method stub
        super.exibirDados();
    }
}

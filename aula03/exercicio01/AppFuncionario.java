package exercicio01;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1= new Funcionario("israel", 20, 40);
        Funcionario senior01= new FuncionarioSenior("israel", 20, 40);

        funcionario1.exibirDados();
        senior01.exibirDados();

        System.out.println(funcionario1.salarioFinal());
        System.out.println(senior01.salarioFinal());
    }
}

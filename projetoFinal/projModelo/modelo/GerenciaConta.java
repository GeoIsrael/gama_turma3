package projModelo.modelo;

import java.util.ArrayList;

public class GerenciaConta {
        private ArrayList<Conta> contas;

        ArrayList<Conta> gerenciamentoDeContas = new ArrayList<>();

        public GerenciaConta(){
                contas= new ArrayList<>();
        }

        public void adicionar(Conta c){
                contas.add(c);
        }

        public String exibir (int numero){
                for (int i=0; i<contas.size();i++){
                        if(contas.get(i).getNumero()==numero){
                                return contas.get(i).toString();
                        }
                }
                return "Não Encontrado";
        }

       /// public boolean alterarTelefone(int numero, double novoSaldo){
     ///           for (int i =0; 1< contas.size(); 1++){
       //                 if (contas.get(i).getSaldo()==novoSaldo){
   //                             return contas.get(i).to
 //                       }
            
        private int posicao (int codigo){
                for (int i =0; i<contas.size(); i++){
                        if(contas.get(i).getNumero()==codigo){
                                return i;
                        }
                }
                return -1;
        }

        public boolean remover (int codigo){
                int posicao = posicao(codigo);
                if (posicao>=0){
                        if(contas.remove(posicao)!=null){
                                return true;
                        }
                }
                return false;
        }



        ContaCorrente cc1 = new ContaCorrente(0, 0);
        ContaCorrente cc2 = new ContaCorrente(0, 0);
        ContaEspecial ce1 = new ContaEspecial(0, 0);




    

    

    

}

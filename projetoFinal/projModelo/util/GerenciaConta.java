package projModelo.util;

import java.util.ArrayList;

import projModelo.modelo.Conta;

public class GerenciaConta {
        private ArrayList<Conta> contas;

        ArrayList<Conta> gerenciamentoDeContas = new ArrayList<>();

        public GerenciaConta() {
                contas = new ArrayList<>();
        }

        public void adicionar(Conta c) {
                contas.add(c);
        }

        public String exibir(int numero) {
                for (int i = 0; i < contas.size(); i++) {
                        if (contas.get(i).getNumero() == numero) {
                                return contas.get(i).toString();
                        }
                }
                return "Não Encontrado";
        }

        public boolean sacarNaConta(int numero, double valorASacar) {
                for (int i = 0; i < contas.size(); i++) {
                        if (contas.get(i).getNumero() == numero) {
                                contas.get(i).saque(valorASacar);
                                ;
                                return true;
                        }
                }
                return false;
        }

        public boolean depositarNaConta(int numero, double valorADepositar) {
                for (int i = 0; i < contas.size(); i++) {
                        if (contas.get(i).getNumero() == numero) {
                                contas.get(i).deposita(valorADepositar);
                                return true;
                        }
                }
                return false;
        }

        private int posicao(int codigo) {
                for (int i = 0; i < contas.size(); i++) {
                        if (contas.get(i).getNumero() == codigo) {
                                return i;
                        }
                }
                return -1;
        }

        public boolean remover(int codigo) {
                int posicao = posicao(codigo);
                if (posicao >= 0) {
                        if (contas.remove(posicao) != null) {
                                return true;
                        }
                }
                return false;
        }

}

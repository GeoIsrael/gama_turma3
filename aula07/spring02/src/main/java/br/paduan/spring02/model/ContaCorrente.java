package br.paduan.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "tb_conta_corrente")
public class ContaCorrente extends Conta{

    @Id // este atributo será uma chave primária na tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // os números serão gerados sequenciais (1, 2, 3, ...)
    @Column(name = "numero") // nome da coluna no BD
    private int numero;

    @Column(name = "saldo")
    private double saldo;

    public int getCodigo() {
        return numero;
    }

    public void setCodigo(int codigo) {
        this.numero = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   
    

}

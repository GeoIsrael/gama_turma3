package br.salles;

public class Calculadora {
    public double somar(double n1, double n2) {
        return n1+n2;
    }

    public double subtrair(double n1, double n2){
        return n1-n2;
    }

    public double Multiplicaca(double n1, double n2){
        return n1*n2;
    }

    public double divicao(double n1, double n2){
        if(n2==0)
            return -1;
        return n1/n2;
    }

    
}

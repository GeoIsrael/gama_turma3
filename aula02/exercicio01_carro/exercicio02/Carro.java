
package exercicio02;

    public class Carro {
        private String modelo, marca;
        private double consumo;

        public Carro(String modelo,String marca, Double consumo){
            this.modelo=modelo;
            this.marca=marca;
            this.consumo=consumo;
        }

        public void mostrar(){
            System.out.println(modelo);
            System.out.println(marca);
        } 

        public double getConsumo(){
            return consumo;
        } 

        public void setCobsumo(double novoConsumo)
        {
            if (novoConsumo>0){
                this.consumo=novoConsumo;
            }else
            System.out.println("Consumo Invalido");
        }


    }

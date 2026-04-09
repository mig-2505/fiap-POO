package br.com.fiapride.model;

public class Carro extends Veiculo {

        private int capacidadePassageiros;

        // CONSTRUTOR DA FILHA
        public Carro(String placa, String modelo, int capacidadePassageiros) {
                super(placa, modelo);
                this.setCapacidadePassageiros(capacidadePassageiros);}

        public int getCapacidadePassageiros() {
                return capacidadePassageiros;
        }

        public void setCapacidadePassageiros(int capacidadePassageiros) {
                this.capacidadePassageiros = capacidadePassageiros;
        }

}


package br.com.fiap.model;

public class Itens {
    private String nome;
    private double pesoItem;

    public Itens(String nome, double pesoItem) {
        this.nome = nome;
        this.pesoItem = pesoItem;
    }

    public void exibirResumo(){
        System.out.println("Nome do item: " + nome );
        System.out.println("Peso do Item: " + pesoItem + "\n");
    }

    public double getPesoItem() {return pesoItem;}
    public String getNome() {return nome;}

}

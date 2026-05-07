package br.com.fiap.model;

public class Itens implements Organizavel{
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

    @Override
    public void organizar() {
        System.out.println("Item organizado.");
    }

    @Override
    public void listarConteudo() {
        System.out.println("informações: " + nome + "-" + pesoItem + "KG");
    }

    public double getPesoItem() {return pesoItem;}
    public String getNome() {return nome;}

}

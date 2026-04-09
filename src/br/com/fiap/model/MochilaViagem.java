package br.com.fiap.model;

public class MochilaViagem extends Mochila{

    private boolean isCompartimentoTenis;

    public MochilaViagem(String material, int tamanho, double peso, Itens item) {
        super(material, tamanho, peso, item);
    }

    public void VerificarCompartimento(boolean isCompartimentoTenis){
        if (isCompartimentoTenis){
            System.out.println("É possivel colocar o tenis, a mochila tem o compartimento!");
        }
        else {
            System.out.println("Não é possivel colocar o tenis, a mochila não tem o compartimento!");
        }
    }
}

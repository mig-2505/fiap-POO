package br.com.fiap.model;

public class MochilaEsportiva extends Mochila{

    private boolean isCompartimentoObjEsportivo;

    public MochilaEsportiva(String material, int tamanho, double peso, Itens item, boolean isCompartimentoObjEsportivo) {
        super(material, tamanho, peso, item);
        isCompartimentoObjEsportivo = this.isCompartimentoObjEsportivo;
    }

    public void VerificarCompartimento(boolean isCompartimentoObjEsportivo){
        if (isCompartimentoObjEsportivo){
            System.out.println("É possivel colocar o objeto esportivo, a mochila tem o compartimento!");
        }
        else {
            System.out.println("Não é possivel colocar o objeto esportivo, a mochila não tem o compartimento!");
        }
    }
}

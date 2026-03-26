package br.com.fiap.main;

import br.com.fiap.model.Mochila;
import br.com.fiap.model.Itens;

public class TesteMochila {

	public static void main(String[] args) {

		Itens item1 = new Itens("Garrafa de agua cheia", 3);
		Itens item2 = new Itens("Estojo grande", 2);
		Itens item3 = new Itens("Caderno pequeno", 1);

		Mochila mochila1 = new Mochila("Nylon", 5, 5, true, false, item1);
		Mochila mochila2 = new Mochila("Couro", 2, 3, false, true, item2);
		Mochila mochila3 = new Mochila("Nylon", 4, 2, item3);

		System.out.println("==== Mochilas ====\n");

		System.out.println("Minha mochila é feita de " + mochila1.getMaterial());
		System.out.println("Minha mochila pesa " + mochila1.getPeso() + " Kilos");
		System.out.println("Minha mochila tem " + mochila1.getTamanho() + " metros\n");
		item1.exibirResumo();
		
		System.out.println("Abrindo mochila 1");
		mochila1.abrirMochila(true);
		System.out.println("Fechando mochila 1");
		mochila1.fecharMochila(true);
		
		System.out.println();
		
		System.out.println("Minha mochila é feita de " + mochila2.getMaterial());
		System.out.println("Minha mochila pesa " + mochila2.getPeso() + " Kilos");
		System.out.println("Minha mochila tem " + mochila2.getTamanho() + " metros\n");
		item2.exibirResumo();
		
		System.out.println("Abrindo mochila 2");
		mochila2.abrirMochila(false);
		System.out.println("Fechando mochila 2");
		mochila2.fecharMochila(false);
		
		System.out.println();
		
		System.out.println("Minha mochila é feita de " + mochila3.getMaterial());
		System.out.println("Minha mochila pesa " + mochila3.getPeso() + " Kilos");
		System.out.println("Minha mochila tem " + mochila3.getTamanho() + " metros\n");
		item3.exibirResumo();
	}

}

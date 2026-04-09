package br.com.fiap.main;

import br.com.fiap.model.Mochila;
import br.com.fiap.model.Itens;
import br.com.fiap.model.MochilaEsportiva;
import br.com.fiap.model.MochilaViagem;

public class SistemaPrincipal {

	public static void main(String[] args) {

		Itens item1 = new Itens("Garrafa de agua cheia", 3);
		Itens item2 = new Itens("Estojo grande", 2);
		Itens item3 = new Itens("Caderno pequeno", 1);

		Itens item4 = new Itens("Tenis casual", 2);
		Itens item5 = new Itens("Tenis de corrida", 2);
		Itens item6 = new Itens("Bola de Futebol", 3);

		Mochila mochila1 = new Mochila("Nylon", 5, 5, true, false, item1);
		Mochila mochila2 = new Mochila("Couro", 2, 3, false, true, item2);
		Mochila mochila3 = new Mochila("Nylon", 4, 2, item3);

		MochilaViagem mochilaViagem1 = new MochilaViagem("Nylon", 3, 4, item4);
		MochilaViagem mochilaViagem2 = new MochilaViagem("Tricoline", 4, 3, item5);
		MochilaEsportiva mochilaEsportiva1 = new MochilaEsportiva("Nylon", 6, 4, item6, true);

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

		System.out.println("==== Tipos de Mochilas ====\n");
		System.out.println("Minha mochila é feita de " + mochilaViagem1.getMaterial());
		System.out.println("Minha mochila pesa " + mochilaViagem1.getPeso() + " Kilos");
		System.out.println("Minha mochila tem " + mochilaViagem1.getTamanho() + " metros\n");
		item4.exibirResumo();
		mochilaViagem1.VerificarCompartimento(true);

		System.out.println();

		System.out.println("Minha mochila é feita de " + mochilaViagem2.getMaterial());
		System.out.println("Minha mochila pesa " + mochilaViagem2.getPeso() + " Kilos");
		System.out.println("Minha mochila tem " + mochilaViagem2.getTamanho() + " metros\n");
		item5.exibirResumo();
		mochilaViagem2.VerificarCompartimento(true);

		System.out.println();

		System.out.println("Minha mochila é feita de " + mochilaEsportiva1.getMaterial());
		System.out.println("Minha mochila pesa " + mochilaEsportiva1.getPeso() + " Kilos");
		System.out.println("Minha mochila tem " + mochilaEsportiva1.getTamanho() + " metros\n");
		item6.exibirResumo();
		mochilaEsportiva1.VerificarCompartimento(true);

	}

}

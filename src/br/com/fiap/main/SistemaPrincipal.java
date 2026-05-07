package br.com.fiap.main;

import br.com.fiap.model.Mochila;
import br.com.fiap.model.Itens;
import br.com.fiap.model.MochilaEsportiva;
import br.com.fiap.model.MochilaViagem;

import java.util.ArrayList;

public class SistemaPrincipal {

	public static void main(String[] args) {

		Itens item1 = new Itens("Garrafa de agua cheia", 3);
		Itens item2 = new Itens("Estojo grande", 2);
		Itens item3 = new Itens("Caderno pequeno", 1);
		Itens item4 = new Itens("Tenis casual", 2);
		Itens item5 = new Itens("Tenis de corrida", 2);
		Itens item6 = new Itens("Bola de Futebol", 3);

		MochilaViagem mochilaViagem1 = new MochilaViagem("Nylon", 3, 4, item4);
		// MochilaViagem mochilaViagem2 = new MochilaViagem("Tricoline", 4, 3, item5);
		MochilaEsportiva mochilaEsportiva1 = new MochilaEsportiva("Nylon", 6, 4, item6, true);

		// System.out.println("==== Mochilas ====\n");

		// System.out.println("Minha mochila é feita de " + mochila1.getMaterial());
		// System.out.println("Minha mochila pesa " + mochila1.getPeso() + " Kilos");
		// System.out.println("Minha mochila tem " + mochila1.getTamanho() + " metros\n");
		//item1.exibirResumo();

		//System.out.println("Abrindo mochila 1");
		// mochila1.abrirMochila(true);
		// System.out.println("Fechando mochila 1");
		// mochila1.fecharMochila(true);

		// System.out.println("==== Tipos de Mochilas ====\n");
		// System.out.println("Minha mochila é feita de " + mochilaViagem1.getMaterial());
		// System.out.println("Minha mochila pesa " + mochilaViagem1.getPeso() + " Kilos");
		// System.out.println("Minha mochila tem " + mochilaViagem1.getTamanho() + " metros\n");
		// item4.exibirResumo();
		// mochilaViagem1.VerificarCompartimento(true);

		// Lista Mochila
		ArrayList<Mochila> listaMochilas = new ArrayList<>();
		listaMochilas.add(mochilaViagem1);
		listaMochilas.add(mochilaEsportiva1);

		for (Mochila mochilas : listaMochilas){
			mochilas.mostrarModelo();
			mochilas.mostrarUsos();
			mochilas.mostrarItem();
			System.out.println("---------------------------------------");

		}

		// Lista Itens
		ArrayList<Itens> listaItens = new ArrayList<>();
		listaItens.add(item4);
		listaItens.add(item6);

		for (Itens itens : listaItens){
			itens.organizar();
			itens.listarConteudo();
		}

	}

}

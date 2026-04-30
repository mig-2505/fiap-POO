package br.com.fiap.main;

import br.com.fiap.model.Mochila;
import br.com.fiap.model.Itens;
import br.com.fiap.model.MochilaEsportiva;
import br.com.fiap.model.MochilaViagem;

import java.util.ArrayList;

public class TesteMochila {

	public static void main(String[] args) {

		Itens item4 = new Itens("Tenis casual", 2);
		Itens item6 = new Itens("Bola de Futebol", 3);

		MochilaViagem mochilaViagem1 = new MochilaViagem("Nylon", 3, 4, item4);
		MochilaEsportiva mochilaEsportiva1 = new MochilaEsportiva("Nylon", 6, 4, item6, true);

		// Listas
		ArrayList<Mochila> listaMochilas = new ArrayList<>();
		listaMochilas.add(mochilaViagem1);
		listaMochilas.add(mochilaEsportiva1);

		for (Mochila mochilas : listaMochilas) {
			mochilas.mostrarModelo();
			mochilas.mostrarUsos();
			mochilas.mostrarItem();
			System.out.println("---------------------------------------");

		}

	}
}

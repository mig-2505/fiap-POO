package br.com.fiap.model;

public class Mochila {
	
	private int tamanho;
	private String material;
	private double peso;
	private boolean aberto;
	private boolean fechado;

	private Itens item;
	
	public Mochila(String material, int tamanho, double peso, boolean aberto, boolean fechado, Itens item) {
		this.setTamanho(tamanho);
		this.setMaterial(material);
		this.setPeso(peso);
		this.setAberto(aberto);
		this.setFechado(fechado);
		this.item = item;
	}
	
	public Mochila(String material, int tamanho, double peso, Itens item) {
		this.setTamanho(tamanho);
		this.setMaterial(material);
		this.setPeso(peso);
		this.item = item;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}

	private void setTamanho(int numTamanho) {
		if(numTamanho > 0) {
			this.tamanho = numTamanho;
		} else {
			System.out.println("Erro de tamanho: Tentativa de colocar tamanho igual a 0 ou negativo");
		}
	}

	public String getMaterial() {
		return this.material;
	}

	private void setMaterial(String material) {
		this.material = material;
	}

	public double getPeso() {
		return this.peso;
	}

	private void setPeso(double numPeso) {
		if(numPeso > 0) {
			this.peso = numPeso;
		} else {
			System.out.println("Erro de Peso: Tentativa de colocar peso igual a 0 ou negativo");
		}
	}

	public boolean isAberto() {
		return aberto;
	}

	private void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public boolean isFechado() {
		return fechado;
	}

	private void setFechado(boolean fechado) {
		this.fechado = fechado;
	}

	
	public void abrirMochila(boolean aberto) {
		if (aberto) {
			System.out.println("Abrindo mochila");
			return;
		}
		if(!aberto) {
			System.out.println("Não abrindo mochila");
			return;
		}
	}
	
	public void fecharMochila(boolean fechado) {
		if (fechado) {
			System.out.println("Fechando mochila");
			return;
		}
		if(fechado == false) {
				System.out.println("Não fechando mochila");
				return;
		}
	}

	public void mostrarItem() {
		if (item != null) {
			item.exibirResumo();
		} else {
			System.out.println("Mochila sem item");
		}
	}
}

package br.com.fiapride.model;

public class Passageiro {
	
	private String nome;
	private double saldo;
	private String cpf;

	public Passageiro(String nome, String cpf) {
	 this.setNome(nome);
	 this.setCpf(cpf);
	 this.setSaldo(0); 
	}

	public double getSaldo() {
	return this.saldo; // Apenas devolve o valor, não altera nada.
	}
	
	private void setSaldo(double valor) {
	if (valor >= 0) {
	this.saldo = valor;
	} else {
	System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
	 }
	}
	
	public String getNome() {
	return this.nome;
	}
	
	private void setNome(String nome) {
	this.nome = nome;
	}
	
	public String getCpf() {
	return this.cpf;
	}
	
	private void setCpf(String cpf) {
	this.cpf = cpf;
	}

    public void adicionarSaldo(double saldoAtual) {
		saldo += saldoAtual;
    }
}

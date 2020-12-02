package br.ufpa.poo;

import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;

	private Pedido meuPedido;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCPF() {
		return this.cpf;
	}
	
	public void realizarPedido(List<String> nomes, Restaurante restaurante) {
		this.meuPedido = new Pedido(this, nomes);
		restaurante.realizarPedido(meuPedido);
	}
	
	public Pedido getPedido() {
		return meuPedido;
	}

}

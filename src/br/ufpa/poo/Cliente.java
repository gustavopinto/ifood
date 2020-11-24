package br.ufpa.poo;

public class Cliente {
	private String nome;
	private String cpf;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void realizarPedido(String pedido, Restaurante restaurante) {
		// TODO Auto-generated method stub
		
	}

	public Pedido getPedido() {
		// TODO Auto-generated method stub
		return null;
	}

}

package br.ufpa.poo;

public class Cliente {
	
	private String nome;
	private String cpf;
	private Pedido pedido;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void realizarPedido(String nomePedido, Restaurante restaurante) {
	
		this.pedido.nomePedido = nomePedido;
		this.pedido.restaurante = restaurante;
		restaurante.realizarPedido(pedido);
	}
	
	public String getNome(){
		return nome;
	}

}

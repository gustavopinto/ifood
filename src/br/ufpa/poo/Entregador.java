package br.ufpa.poo;

public class Entregador {
	
	private String nome;
	private Pedido pedido;
	
	public Entregador(String nome) {
		this.nome = nome;
	}
	
	public void receberPedido(Pedido pedido) {
		
		this.pedido = pedido;
		
	}
	
	public Pedido getPedido() {
		return this.pedido;
	}
	
	public String getNome() {
		return nome;
	}

}

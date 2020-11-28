package br.ufpa.poo;

public class Entregador {
	private String nome;
	Pedido pedido;
	
	public Entregador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void receberPedido(Pedido novoPedido) {
		this.pedido = novoPedido;		
	}

	public Pedido getPedido() {
		return this.pedido;
	}

}

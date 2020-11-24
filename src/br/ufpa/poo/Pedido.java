package br.ufpa.poo;

public class Pedido {
	private String nomeDoPedido;
	
	public Pedido(String pedido){
		this.nomeDoPedido = pedido;
	}
	
	public String getNome() {
		return this.nomeDoPedido;
	}
}

package br.ufpa.poo;

public class Pedido {
	private String nomeDoPedido;
	private Cliente cliente;
	
	public Pedido(String pedido){
		this.nomeDoPedido = pedido;
	}
	
	public Pedido(Cliente cliente, String pedido) {
		this.cliente = cliente;
		this.nomeDoPedido = pedido;
	}

	public String getNome() {
		return this.nomeDoPedido;
	}

	public boolean statusPagamento() {
		if(nomeDoPedido.isEmpty()) return false;
		return true;
	}

	public Cliente getCliente() {
		return this.cliente;
	}
}

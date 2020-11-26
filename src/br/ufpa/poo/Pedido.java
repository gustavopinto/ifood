package br.ufpa.poo;

public class Pedido {
	Cliente cliente;
	String nomePedido;
	
	public Pedido(Cliente cliente, String nomePedido) {
		this.cliente = cliente;
		this.nomePedido = nomePedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNomePedido() {
		return nomePedido;
	}

	public void setNomePedido(String nomePedido) {
		this.nomePedido = nomePedido;
	}

}

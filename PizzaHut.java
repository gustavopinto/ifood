package br.ufpa.poo;

public class PizzaHut implements Restaurante {
	
	private Pedido pedido;
	private Cliente cliente;

	@Override
	public void novoPedido() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void realizarPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public Pedido statusPedido() {
		// TODO Auto-generated method stub
		return this.pedido;
	}

	
}

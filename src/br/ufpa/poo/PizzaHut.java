package br.ufpa.poo;

public class PizzaHut implements Restaurante{
	Pedido pedido;
	
	@Override
	public void realizarPedido(Pedido novoPedido) {
		this.pedido = novoPedido;	
	}

	@Override
	public Pedido statusPedido() {
		return pedido;
	}
	
	
	
}

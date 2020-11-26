package br.ufpa.poo;

public class PizzaHut implements Restaurante {
	
	private Pedido novoPedido;

	@Override
	public void realizarPedido(Pedido pedido) {		
		
		double valorFrete = Math.random() * 10;
		double valorPrato = Math.random() * 20; 
		
		this.novoPedido = pedido;
		
		this.novoPedido.definirValorPedido(valorPrato, valorFrete);
	}

	@Override
	public void cancelarPedido(String nomePedido) {
		this.novoPedido = null;
	}

	@Override
	public void enviarPedidoPedido(Entregador entregador) {
		entregador.receberPedido(novoPedido);
	}
	
	public void finalizarPedido() {
		this.novoPedido = null;
	}
	
	public Pedido statusPedido() {
		return novoPedido;
	}

}

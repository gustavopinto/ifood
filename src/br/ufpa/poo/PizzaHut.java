package br.ufpa.poo;

public class PizzaHut implements Restaurante {
	
	private Pedido[] pedidos;
	private Pedido pedido;

	@Override
	public void realizarPedido(Pedido[] pedido) {		
		
		double valorFrete;
		double valorPrato; 
		
		this.pedidos = pedido;
		for(int i = 0; i < this.pedidos.length; i++) {
			valorFrete = Math.random() * 10;
			valorPrato = Math.random() * 20;
			this.pedidos[i].definirValorPedido(valorPrato, valorFrete);
		}
		
	}
	@Override
	public void realizarPedido(Pedido pedido) {
		double valorFrete;
		double valorPrato; 
		
		this.pedido = pedido;
		
			valorFrete = Math.random() * 10;
			valorPrato = Math.random() * 20;
			this.pedido.definirValorPedido(valorPrato, valorFrete);
		
		
	}

	@Override
	public void cancelarPedido(String nomePedido) {
		this.pedidos = null;
	}

	@Override
	public void enviarPedidoPedido(Entregador entregador) {
		entregador.receberPedido(pedidos);
	}
	
	public void finalizarPedido() {
		this.pedidos = null;
	}
	
	public Pedido[] statusPedido() {
		return pedidos;
	}

	


}

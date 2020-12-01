package br.ufpa.poo;

public class PizzaHut implements Restaurante {
	
	private Pedido[] novoPedido;

	@Override
	public void realizarPedido(Pedido[] pedido) {		
		
		double valorFrete;
		double valorPrato; 
		
		this.novoPedido = pedido;
		for(int i = 0; i < this.novoPedido.length; i++) {
			valorFrete = Math.random() * 10;
			valorPrato = Math.random() * 20;
			this.novoPedido[i].definirValorPedido(valorPrato, valorFrete);
		}
		
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
	
	public Pedido[] statusPedido() {
		return novoPedido;
	}

}

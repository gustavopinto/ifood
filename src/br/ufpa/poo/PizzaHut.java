package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

public class PizzaHut implements Restaurante {
	
	private Pedido novoPedido;

	@Override
	public void realizarPedido(Pedido pedido) {
		List<String> pedidos = pedido.getNomes();
		List<Double> valorPedidos = new ArrayList<>();
		
		for (String item: pedidos) {
			double valorPrato = Math.random() * 20;
			valorPedidos.add(valorPrato);
		}
		
		double valorFrete = Math.random() * 10;
		
		this.novoPedido = pedido;
		
		this.novoPedido.definirValorPedido(valorPedidos, valorFrete);
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

package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

public class PizzaHut implements Restaurante {
	private String statusPedidos;
	private List<Pedido> novosPedidos;
	
	public PizzaHut() {
		this.statusPedidos = "";
		this.novosPedidos = new ArrayList<Pedido>();
	}

	@Override
	public void receberPedido(List<Pedido> pedidos) {		
		
		double valorFrete = Math.random() * 10;
		
		pedidos.forEach(pedido -> {
			double valorPrato = Math.random() * 20; 
			
			pedido.definirValorPedido(valorPrato, valorFrete);

			this.novosPedidos.add(pedido);
		});
	}

	@Override
	public void cancelarPedido(String nomePedido) {
		this.novosPedidos = null;
	}

	@Override
	public void enviarPedido(Entregador entregador) {
		novosPedidos.forEach(pedido -> {
			entregador.receberPedido(pedido);
		});
	}
	
	public void finalizarPedido() {
		this.novosPedidos = null;
	}
	
	public String listarPedidos() {
		this.novosPedidos.forEach(pedido -> {
			this.statusPedidos += pedido.getNome() + " "; 
		});
		
		return this.statusPedidos;
	}
}

package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;


public class PizzaHut implements Restaurante {
	private List<Pedido> listaDePedidos = new ArrayList<>();
	private Pedido novoPedido;

	@Override
	public void realizarPedido(Pedido pedido) {		
		
		double valorFrete = Math.random() * 10;
		double valorPrato = Math.random() * 20; 
		
		this.novoPedido = pedido;
		
		this.novoPedido.definirValorPedido(valorPrato, valorFrete);
		
		listaDePedidos.add(this.novoPedido);
	}

	@Override
	public void cancelarPedido(Pedido nomePedido) {
		int index = listaDePedidos.indexOf(nomePedido);
		listaDePedidos.set(index, null);
	}

	@Override
	public void enviarPedido(Entregador entregador) {
		Pedido ultimoPedido = listaDePedidos.get(listaDePedidos.size() - 1);
		
		if(ultimoPedido != null) {
			entregador.receberPedido(ultimoPedido);
		}else {
			System.err.println("Não pode enviar um pedido cancelado ou finalizado");
		}
		
		
	}
	
	@Override
	public void finalizarPedido(Pedido pedido) {
		int index = listaDePedidos.indexOf(pedido);
		listaDePedidos.set(index, null);
	}
	
	@Override
	public Pedido statusPedido(int index) {
		return listaDePedidos.get(index);
	}

	

}

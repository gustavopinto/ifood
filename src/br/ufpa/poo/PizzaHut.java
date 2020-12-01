package br.ufpa.poo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class PizzaHut implements Restaurante {
	private List<Pedido> listaDePedidos = new ArrayList<>();
	private List<Calendar> dataDosPedidos = new ArrayList<>();
	
	private Pedido novoPedido;

	@Override
	public void realizarPedido(Pedido pedido) {		
		Calendar dataAtual = Calendar.getInstance();
		
		double valorFrete = Math.random() * 10;
		double valorPrato = Math.random() * 20; 
		
		this.novoPedido = pedido;
		
		this.novoPedido.definirValorPedido(valorPrato, valorFrete);
		
		listaDePedidos.add(this.novoPedido);
		dataDosPedidos.add(dataAtual);
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

	public Calendar getDataDoPedido(Pedido pedido) {
		int index = listaDePedidos.indexOf(pedido);		
		return dataDosPedidos.get(index);
	}

}

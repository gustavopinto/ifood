package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class PizzaHut implements Restaurante {
	private List<Calendar>dataDoPedido = new ArrayList<>();
	private List<Pedido>listaDePedidos = new ArrayList<>();
	private Pedido novoPedido;
	

	@Override
	public void realizarPedido(Pedido pedido) {		
		Calendar dataAtual = Calendar.getInstance();
		double valorFrete = Math.random() * 10;
		double valorPrato = Math.random() * 20; 
		
		this.novoPedido = pedido;
		
		this.novoPedido.definirValorPedido(valorPrato, valorFrete);
		listaDePedidos.add(this.novoPedido);
		dataDoPedido.add(dataAtual);
	}

	@Override
	public void cancelarPedido(Pedido nomePedido) {
		
		int index = listaDePedidos.indexOf(nomePedido);
		listaDePedidos.set(index, null);
	}

	@Override
	public void enviarPedido(Entregador entregador) {
		Pedido utimoPedido = listaDePedidos.get(listaDePedidos.size()-1);
		if(utimoPedido!=null) {
			entregador.receberPedido(utimoPedido);
		}
		else {
			System.err.println("Pedido Cancelado ou Finalizado");
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
		return dataDoPedido.get(index);
	}

}

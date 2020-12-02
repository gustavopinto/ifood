package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

public class PizzaHut implements Restaurante {
	
	private ArrayList<Pedido> novoPedido = new ArrayList<>();

	@Override
	public void realizarPedido(ArrayList<Pedido> listaDePedidos) {		//alteração 02
		
		for(int j=0; j<listaDePedidos.size(); j++) {
			
			this.novoPedido.add(listaDePedidos.get(j));
			double valorFrete = Math.random() * 10;
			double valorPrato = Math.random() * 20; 
			
			novoPedido.get(j).definirValorPedido(valorPrato, valorFrete);
				
		}
		
	}

	@Override
	public void cancelarPedido(String nomePedido) {
		this.novoPedido = null;
	}

	@Override
	public void enviarPedidos(Entregador entregador) {
		entregador.receberPedido(novoPedido);
	}
	
	public void finalizarPedido() {
		this.novoPedido = null;
	}
	
	public ArrayList<Pedido> statusPedidos() {   //alteração 03
		return this.novoPedido;
	}
	public void setNovoPedido(Pedido pedido) {   //alteração 04
		
		this.novoPedido.add(pedido);
	}
	
}

package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

public class PizzaHut implements Restaurante {
	
	private Pedido novoPedido;
	private List<Pedido> listaDePedidos = new ArrayList<>();

	@Override
	public void realizarPedido(Pedido pedido) {		
		
		double valorFrete = Math.random() * 10;
		double valorPrato = Math.random() * 20; 
		
		listaDePedidos.add(this.novoPedido);
		this.novoPedido.definirValorPedido(valorPrato, valorFrete);
	}

	@Override
	public void cancelarPedido(String nomePedido) {
        int c = 0;
		for(int i = 0; i < listaDePedidos.size();i++){
            if (listaDePedidos.get(i) == nomePedido) {
				c++;
            }
		}
		listaDePedidos.remove(c);
	}


	@Override
	public void enviarPedidoPedido(Entregador entregador) {
		if (listaDePedidos.isEmpty()) {
			System.out.print("Não há itens para entregar");
		} else {
		Pedido paraEntrega = listaDePedidos.get(listaDePedidos.size()-1);		
		entregador.receberPedido(paraEntrega);
		}
	}
	
	public void finalizarPedido() {
		this.novoPedido = null;
	}
	
	public Pedido statusPedido() {
		return listaDePedidos.get(listaDePedidos.size()-1);
	}

	public List<Pedido> getListaDePedidos() {
		return listaDePedidos;
	}

	public void setListaDePedidos(List<Pedido> listaDePedidos) {
		this.listaDePedidos = listaDePedidos;
	}

}

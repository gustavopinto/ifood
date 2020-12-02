package br.ufpa.poo;

import java.util.List;

public interface Restaurante {

	public void receberPedido(List<Pedido> pedidos);
	
	public void cancelarPedido(String nomePedido);

	public void enviarPedido(Entregador entregador);
	
	public void finalizarPedido();
	
	public String listarPedidos();
	
}

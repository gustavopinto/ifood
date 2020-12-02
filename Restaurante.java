package br.ufpa.poo;

import java.util.ArrayList;

public interface Restaurante {

	public void realizarPedido(ArrayList<Pedido> pedido); //alteração 01
	
	public void cancelarPedido(String nomePedido);

	public void enviarPedidos(Entregador entregador);
	
	public void finalizarPedido();
	
	public ArrayList<Pedido> statusPedidos();
	
	public void setNovoPedido(Pedido pedido); //
	
}

package br.ufpa.poo;

public interface Restaurante {

	public void realizarPedido(Pedido pedido);
	
	public void cancelarPedido(Pedido nomePedido);

	public void enviarPedido(Entregador entregador);
	
	public void finalizarPedido(Pedido pedido);
	
	public Pedido statusPedido(int index);
	
}

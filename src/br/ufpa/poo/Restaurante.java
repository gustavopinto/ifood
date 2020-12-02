package br.ufpa.poo;

public interface Restaurante {

	public void realizarPedido(Pedido pedido);
	
	public void cancelarPedido(String nomePedido);

	public void enviarPedido(Entregador entregador);
	
	public void finalizarPedido();
	
	public Pedido statusPedido();
	
}

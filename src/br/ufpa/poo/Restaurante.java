package br.ufpa.poo;

public interface Restaurante {
	
	public void realizarPedido(Pedido pedido);
	
	public void cancelarPedido(String nomePedido);

	public void enviarPedidoPedido(Entregador entregador);
	
	public void finalizarPedido();
	
	public Pedido[] statusPedido();

	void realizarPedido(Pedido[] pedido);
	
}

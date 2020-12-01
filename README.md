package br.ufpa.poo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestauranteTest {

	@Test
	void testNovoPedido(){
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Rafael", "00000"), "Pizza de Queijo", "chocolate", "refrigerante");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido().getNome(), "Pizza de Queijo","chocolate","refrigerante");
	}
	
	@Test
	void testNovoPedidoCliente() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Rafael", "00000"), "Pizza de Queijo","chocolate","refrigerante");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido().getCliente().getNome(), "Rafael");
	}
	@Test
	void DataPedido(Date data) {
		this.DataPedido(data);
		
		Data data = new PizzaHut();
		
		DataPedido NovaData =  new Pedido(new Cliente("Rafael", "00000"), "Pizza de Queijo","chocolate","refrigerante");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido().getCliente().getNome(), "Rafael");
		
	}
}

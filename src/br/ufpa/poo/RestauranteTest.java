package br.ufpa.poo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestauranteTest {

	@Test
	void testNovoPedido() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo", 0, null);
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido().getNome(), "Pizza de Queijo");
	}

	
	@Test
	void testNovoPedidoCliente() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo", 0, null);
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido().getCliente().getNome(), "Gustavo");
	}
	
	
}

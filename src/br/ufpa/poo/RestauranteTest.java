package br.ufpa.poo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestauranteTest {

	@Test
	void testNovoPedido() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido(0).getNome(), "Pizza de Queijo");
	}

	
	@Test
	void testNovoPedidoCliente() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido(0).getCliente().getNome(), "Gustavo");
	}
	
	@Test
	void testCancelarPedido() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido(0).getCliente().getNome(), "Gustavo");
		
		restaurante.cancelarPedido(novoPedido);
		
		Assertions.assertEquals(null, restaurante.statusPedido(0));
	}
	
	@Test
	void finalizarPedido() {
		
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido(0).getCliente().getNome(), "Gustavo");
		
		restaurante.finalizarPedido(novoPedido);
		
		Assertions.assertEquals(null, restaurante.statusPedido(0));
	}
	
	@Test
	void statusPedido() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido(0), novoPedido);
	}
	
	@Test
	void enviarPedido() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		restaurante.realizarPedido(novoPedido);
		
		Entregador entregador = new Entregador("Francisco");
		
		restaurante.enviarPedido(entregador);
		
		Assertions.assertEquals(restaurante.statusPedido(0), entregador.getPedido());
		
		restaurante.cancelarPedido(novoPedido);
		
		restaurante.enviarPedido(entregador);
	}
	
}

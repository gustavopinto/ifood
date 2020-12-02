package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestauranteTest {

	Restaurante pizzaHut = new PizzaHut();
	
	Entregador entregador = new Entregador("Henrique");
	
	Cliente leonardo = new Cliente("Leonardo", "00000000000");
	
	Pedido yakisoba = new Pedido(leonardo, "Yakisoba");
	
	@Test
	void testNovoPedido() {
		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(yakisoba);
		
		pizzaHut.receberPedido(pedidos);
		
		Assertions.assertEquals(pizzaHut.listarPedidos(), "Yakisoba ");
	}

	
	@Test
	void testNovoPedidoCliente() {
		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(yakisoba);
		
		leonardo.realizarPedido(pizzaHut, pedidos);
		
		Assertions.assertEquals(pizzaHut.listarPedidos(), "Yakisoba ");
	}
	
	
}

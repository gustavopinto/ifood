package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestauranteTest {

	@Test
	void testNovoPedido() {
		Restaurante restaurante = new PizzaHut();
		
		List<String> pedidos = new ArrayList<>();
		pedidos.add("Pizza de Queijo");
		pedidos.add("Pizza de Abacaxi");
		pedidos.add("Refrigerante de Cola");
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), pedidos);
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido().getNomes().get(0), "Pizza de Queijo");
	}

	
	@Test
	void testNovoPedidoCliente() {
		Restaurante restaurante = new PizzaHut();
		
		List<String> pedidos = new ArrayList<>();
		pedidos.add("Pizza de Queijo");
		pedidos.add("Pizza de Abacaxi");
		pedidos.add("Refrigerante de Cola");
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), pedidos);
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido().getCliente().getNome(), "Gustavo");
	}
	
	
}

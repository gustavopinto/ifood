package br.ufpa.poo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void testNovoCliente() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");
		Assertions.assertEquals(c1.getNome(), "Gustavo");
	}

	@Test
	void testRealizarPedido() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");
		
		List<String> pedidos = new ArrayList<>();
		pedidos.add("Pizza de Queijo");
		pedidos.add("Pizza de Abacaxi");
		pedidos.add("Refrigerante de Cola");

		c1.realizarPedido(pedidos, new PizzaHut());

		Assertions.assertEquals(c1.getPedido().getNomes().get(0), "Pizza de Queijo");
	}

	@Test
	void testValorPedido() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");
		
		List<String> pedidos = new ArrayList<>();
		pedidos.add("Pizza de Queijo");
		pedidos.add("Pizza de Abacaxi");
		pedidos.add("Refrigerante de Cola");

		c1.realizarPedido(pedidos, new PizzaHut());

		Assertions.assertEquals(c1.getPedido().getNomes().get(0), "Pizza de Queijo");

		// COMO FAZ O TESTE DO VALOR DO PEDIDO???
	}
	
	@Test
	void testDataPedido() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");
		
		List<String> pedidos = new ArrayList<>();
		pedidos.add("Pizza de Queijo");
		pedidos.add("Pizza de Abacaxi");
		pedidos.add("Refrigerante de Cola");

		c1.realizarPedido(pedidos, new PizzaHut());
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'às' HH:mm:ss z");
		
		Assertions.assertEquals(formatter.format(c1.getPedido().infoDataPedido()), formatter.format(new Date(System.currentTimeMillis())));
	}
}

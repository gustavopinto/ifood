package br.ufpa.poo;

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

		c1.realizarPedido("Pizza de Queijo", new PizzaHut());

		Assertions.assertEquals(c1.getPedido().getNome(), "Pizza de Queijo");
	}
	//testando modificacao
	@Test
	void testValorPedido() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");

		c1.realizarPedido("Pizza de Queijo", new PizzaHut());
		// COMO FAZ O TESTE DO VALOR DO PEDIDO???
	}

}

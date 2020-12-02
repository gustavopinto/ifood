package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteTest {
	Cliente leonardo = new Cliente("Leonardo", "00000000000");
	
	Restaurante pizzaHut = new PizzaHut();
	
	List<Pedido> pedidos = new ArrayList<Pedido>();
	
	@Test
	void testNovoCliente() {
		Assertions.assertEquals(leonardo.getNome(), "Leonardo");
	}

	@Test
	void testRealizarPedido() {
		Pedido yakisoba = new Pedido(leonardo, "Yakisoba");
		pedidos.add(yakisoba);
		Pedido arrozCarreteiro = new Pedido(leonardo, "Arroz Carreteiro");
		pedidos.add(arrozCarreteiro);
		
		leonardo.realizarPedido(pizzaHut, pedidos);

		Assertions.assertEquals(leonardo.getMeusPedidos(), "Yakisoba Arroz Carreteiro ");
	}
}

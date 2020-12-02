package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntregadorTest {
	Restaurante pizzaHut = new PizzaHut();
	
	Entregador entregador = new Entregador("Henrique");
	
	Cliente leonardo = new Cliente("Leonardo", "00000000000");
	
	Pedido yakisoba = new Pedido(leonardo, "Yakisoba");
	
	@Test
	void testNovoEntregador() {
		Assertions.assertEquals(entregador, entregador);
	}

	@Test
	void testReceberPedido() {
		entregador.receberPedido(yakisoba);
		
		Assertions.assertEquals(entregador.getPedido().getNome(), "Yakisoba");
	}

	@Test
	void testReceberPagamento() {
		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(yakisoba);
		
		leonardo.realizarPedido(pizzaHut, pedidos);
		pizzaHut.enviarPedido(entregador);

		boolean valorDoPedido = true;
		
		Assertions.assertEquals(entregador.getPedido().statusPagamento(), valorDoPedido);
	}

}

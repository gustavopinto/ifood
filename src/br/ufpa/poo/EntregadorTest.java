package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntregadorTest {

	@Test
	void testNovoEntregador() {
		Entregador entregador = new Entregador("Henrique");
		
		Assertions.assertEquals(entregador.getNome(), "Henrique");
	}

	@Test
	void testReceberPedido() {
		Entregador entregador = new Entregador("Henrique");
		List<String> pedidos = new ArrayList<>();
		pedidos.add("Pizza de Queijo");
		pedidos.add("Pizza de Abacaxi");
		pedidos.add("Refrigerante de Cola");
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), pedidos);
		
		entregador.receberPedido(novoPedido);
		
		Assertions.assertEquals(entregador.getPedido().getNomes().get(0), "Pizza de Queijo");
	}

	@Test
	void testReceberPagamento() {
		Entregador entregador = new Entregador("Henrique");
		
		List<String> pedidos = new ArrayList<>();
		pedidos.add("Pizza de Queijo");
		pedidos.add("Pizza de Abacaxi");
		pedidos.add("Refrigerante de Cola");
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), pedidos);
		
		Restaurante restaurante = new PizzaHut();
		restaurante.realizarPedido(novoPedido);
		
		entregador.receberPedido(novoPedido);
		entregador.receberPagamento(100);
		
		// QUAL O VALOR DO PEDIDO????
		boolean valorDoPedido = true;
		
		Assertions.assertEquals(entregador.getPedido().statusPagamento(), valorDoPedido);
		
		List<String> items = new ArrayList<>();
		
		for (int i = 0; i < items.size(); i++) {
			String item = items.get(0);
			
		}
			
	}

}

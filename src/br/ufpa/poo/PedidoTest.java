package br.ufpa.poo;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PedidoTest {
	Cliente leonardo = new Cliente("Leonardo", "000.000.000-00");
	
	Pedido yakisoba = new Pedido(leonardo, "Yakisoba");

	@Test
	void testNovoPedido() {
		
		Assertions.assertEquals(yakisoba.getNome(), "Yakisoba");
	}

}

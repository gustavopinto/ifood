package br.ufpa.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PedidoTest1 {

	@Test
	void test() {
		Pedido p =  new Pedido(new Cliente("Gustavo", "000000"), "Pizza");
		Assertions.assertEquals(p.getHora(), "1 de dez. de 2020");
	}

}

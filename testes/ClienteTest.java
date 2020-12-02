import br.ufpa.poo.Cliente;
import br.ufpa.poo.PizzaHut;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class ClienteTest {

	@Test
	void testNovoCliente() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");
		Assertions.assertEquals("Gustavo", c1.getNome());
	}

	@Test
	void testRealizarPedido() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");
		List<String> pedidos = new ArrayList<>();

		pedidos.add("Mussarela");
		pedidos.add("Peperoni");
		pedidos.add("Marguerita");
		pedidos.add("Calabresa");

		c1.realizarPedido(pedidos, new PizzaHut());

		Assertions.assertEquals("Peperoni", c1.getPedido().getNomes().get(1));
	}

	@Test
	void testDataPedido(){
		Cliente c1 = new Cliente("Gustavo", "00000000000");
		List<String> pedidos = new ArrayList<>();

		pedidos.add("Mussarela");
		pedidos.add("Peperoni");
		pedidos.add("Marguerita");
		pedidos.add("Calabresa");

		c1.realizarPedido(pedidos, new PizzaHut());

		Assertions.assertEquals(Calendar.getInstance().getTime().toString(), c1.getPedido().getData().toString());
	}


	@Test
	void testValorPedido() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");
		// COMO FAZ O TESTE DO VALOR DO PEDIDO???
	}

}

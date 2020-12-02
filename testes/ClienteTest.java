import br.ufpa.poo.Cliente;
import br.ufpa.poo.PizzaHut;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

class ClienteTest {

	@Test
	void testNovoCliente() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");
		Assertions.assertEquals("Gustavo", c1.getNome());
	}

	@Test
	void testRealizarPedido() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");

		c1.realizarPedido("Pizza de Queijo", new PizzaHut());

		Assertions.assertEquals("Pizza de Queijo", c1.getPedido().getNome());
	}

	@Test
	void testDataPedido(){
		Cliente c1 = new Cliente("Gustavo", "00000000000");

		c1.realizarPedido("Pizza de Queijo", new PizzaHut());

		Assertions.assertEquals(Calendar.getInstance().getTime().toString(), c1.getPedido().getData().toString());
	}


	@Test
	void testValorPedido() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");

		c1.realizarPedido("Pizza de Queijo", new PizzaHut());
		// COMO FAZ O TESTE DO VALOR DO PEDIDO???
	}

}

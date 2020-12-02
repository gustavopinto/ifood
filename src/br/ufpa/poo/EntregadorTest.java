package br.ufpa.poo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntregadorTest {
	
	static String dataHora = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());


	@Test
	void testNovoEntregador() {
		Entregador entregador = new Entregador("Henrique");
		
		Assertions.assertEquals(entregador.getNome(), "Henrique");
	}

	@Test
	void testReceberPedido() {
		Entregador entregador = new Entregador("Henrique");
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000000000"), "Pizza de Queijo", 35.0,dataHora);
		
		entregador.receberPedido(novoPedido);
		
		Assertions.assertEquals(entregador.getPedido().getNome(), "Pizza de Queijo");
	}

	@Test
	void testReceberPagamento() {
		Entregador entregador = new Entregador("Henrique");
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000000000"), "Pizza de Queijo", 35.0,dataHora);
		
		entregador.receberPedido(novoPedido);
		
		
		// QUAL O VALOR DO PEDIDO????
		boolean valorDoPedido = false;
		
		Assertions.assertEquals(entregador.getPedido().statusPagamento(),valorDoPedido);
		
		/*
		 * List<String> items = new ArrayList<>();
		 * 
		 * for (int i = 0; i < items.size(); i++) { String item = items.get(0); }
		 */
			
	}

}

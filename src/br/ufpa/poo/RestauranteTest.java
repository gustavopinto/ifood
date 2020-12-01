package br.ufpa.poo;

import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestauranteTest {

	@Test
	void testNovoPedido() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido(0).getNome(), "Pizza de Queijo");
	}

	
	@Test
	void testNovoPedidoCliente() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido(0).getCliente().getNome(), "Gustavo");
	}
	
	@Test
	void testCancelarPedido() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido(0).getCliente().getNome(), "Gustavo");
		
		restaurante.cancelarPedido(novoPedido);
		
		Assertions.assertEquals(null, restaurante.statusPedido(0));
	}
	
	@Test
	void testFinalizarPedido() {
		
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido(0).getCliente().getNome(), "Gustavo");
		
		restaurante.finalizarPedido(novoPedido);
		
		Assertions.assertEquals(null, restaurante.statusPedido(0));
	}
	
	@Test
	void testStatusPedido() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		restaurante.realizarPedido(novoPedido);
		
		Assertions.assertEquals(restaurante.statusPedido(0), novoPedido);
	}
	
	@Test
	void testEnviarPedido() {
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		restaurante.realizarPedido(novoPedido);
		
		Entregador entregador = new Entregador("Francisco");
		
		restaurante.enviarPedido(entregador);
		
		Assertions.assertEquals(restaurante.statusPedido(0), entregador.getPedido());
		
		restaurante.cancelarPedido(novoPedido);
		
		restaurante.enviarPedido(entregador);
	}
	
	@Test
	void testDatasDosPedidos() throws InterruptedException {
		
		PizzaHut restaurante = new PizzaHut();
		Pedido pedido1 = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		Pedido pedido2 = new Pedido(new Cliente("Jhoy", "00000"), "Pizza de Bacon");
		Pedido pedido3 = new Pedido(new Cliente("Yury", "00000"), "Pizza de Camarão");
		
		restaurante.realizarPedido(pedido1);
		Thread.sleep(3000);
		restaurante.realizarPedido(pedido2);
		Thread.sleep(2000);
		restaurante.realizarPedido(pedido3);
		
		Calendar data1 = restaurante.getDataDoPedido(pedido1);
		Calendar data2 = restaurante.getDataDoPedido(pedido2);
		Calendar data3 = restaurante.getDataDoPedido(pedido3);
		
		System.out.println(data1.getTime());
		System.out.println(data2.getTime());
		System.out.println(data3.getTime());
	}
}

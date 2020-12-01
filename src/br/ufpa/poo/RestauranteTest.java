package br.ufpa.poo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Calendar;

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
	void testCancelarPedido(){
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo","00000"),"Pizza de Quejo");
		restaurante.realizarPedido(novoPedido);
		Assertions.assertEquals(restaurante.statusPedido(0).getCliente().getNome(),"Gustavo");
		restaurante.cancelarPedido(novoPedido);
		Assertions.assertEquals(null, restaurante.statusPedido(0));
		
	}
	
	@Test
	void finalizarPedido(){
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo","00000"),"Pizza de Queijo");
		restaurante.realizarPedido(novoPedido);
		Assertions.assertEquals(restaurante.statusPedido(0).getCliente().getNome(), "Gustavo");
		restaurante.finalizarPedido(novoPedido);
		Assertions.assertEquals(null, restaurante.statusPedido(0));
	}
	
	@Test
	void statusPedido(){
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo","00000"), "Pizza de QUeijo");
		restaurante.realizarPedido(novoPedido);
		Assertions.assertEquals(restaurante.statusPedido(0), novoPedido);
	}
	
	@Test
	void enviarPedido(){
		Restaurante restaurante = new PizzaHut();
		Pedido novoPedido = new Pedido(new Cliente("Gustavo","00000"), "Pizza de Queijo");
		restaurante.realizarPedido(novoPedido);
		Entregador entregador = new Entregador("Bruno");
		restaurante.enviarPedido(entregador);
		Assertions.assertEquals(restaurante.statusPedido(0),entregador.getPedido());
		restaurante.cancelarPedido(novoPedido);
		restaurante.enviarPedido(entregador);
	}
	
	@Test
	void testDataDoPedido(){
		PizzaHut restaurante = new PizzaHut();
		Pedido pedido1 = new Pedido(new Cliente("Gustavo","00000"),"Pizza de Queijo");
		Pedido pedido2 = new Pedido(new Cliente("Jorge","00001"),"Refrigerante");
		Pedido pedido3 = new Pedido(new Cliente("Fernando","00002"),"Pizza Calabresa");
		Pedido pedido4 = new Pedido(new Cliente("Mario","00003"),"Pizza Mozzarella");
		
		Calendar data1 = restaurante.getDataDoPedido(pedido1);
		Calendar data2 = restaurante.getDataDoPedido(pedido2);
		Calendar data3 = restaurante.getDataDoPedido(pedido3);
		Calendar data4 = restaurante.getDataDoPedido(pedido4);
		
		System.out.println(data1.getTime());
		System.out.println(data2.getTime());
		System.out.println(data3.getTime());
		System.out.println(data4.getTime());
	}
	
	
}

package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestauranteTest {

	@Test
	void testNovosPedidos() {                                  //alteração 06
		
		ArrayList<Pedido> listaDePedidos = new ArrayList();
		
		ArrayList<String> listaNomesDePedidos = new ArrayList();
		
		Restaurante restaurante = new PizzaHut();
		
		Pedido novoPedido01 = new Pedido(new Cliente("Gustavo", "00000"), "Pizza de Queijo");
		
		listaDePedidos.add(novoPedido01);
		
		listaNomesDePedidos.add(novoPedido01.getNome());
		
		Pedido novoPedido02 = new Pedido(new Cliente("André", "11111"), "X-Burger");
		
		listaDePedidos.add(novoPedido02);
		
		listaNomesDePedidos.add(novoPedido02.getNome());
		
		Pedido novoPedido03 = new Pedido(new Cliente("Pedro", "22222"), "Batata Frita");
		
		listaDePedidos.add(novoPedido03);
		
		listaNomesDePedidos.add(novoPedido03.getNome());
		
		
		restaurante.realizarPedido(listaDePedidos);
		
		
		for(int j=0; j < listaDePedidos.size(); j++) {
			
			Assertions.assertEquals(restaurante.statusPedidos().get(j).getNome(), listaNomesDePedidos.get(j));
		}
		
	}

	
	@Test
	void testNovosPedidosClientes() {                                //alteração 07
		
		Restaurante restaurante = new PizzaHut();
		
		ArrayList<String> pedidos = new ArrayList<>();
		
		Cliente c1 = new Cliente("Paulo", "55555");
		
		pedidos.add("Pizza Margerita");
		pedidos.add("Pizza de Queijo44");
		pedidos.add("Pizza de Calabreza");
		
		c1.realizarPedido(pedidos, restaurante);
			
		for(int j=0; j< restaurante.statusPedidos().size(); j++) {
			Assertions.assertEquals(restaurante.statusPedidos().get(j).getNome(), pedidos.get(j));
		}
		
	}
	
}

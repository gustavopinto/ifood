package br.ufpa.poo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestauranteTest {

	@Test
	void testNovoPedido() {
		ArrayList<String> nomePedido = new ArrayList();
        ArrayList<String> cliente = new ArrayList();
 
        nomePedido.add("Pizza de Queijo");
        nomePedido.add("Pizza de Presunto");
        nomePedido.add("Pizza de Frango");
        nomePedido.add("Pizza de Arroz carreteiro");
        
        cliente.add("Vandick");
        cliente.add("Bérgson");
        cliente.add("Yago pikachu");
        cliente.add("Leandro Cearense");
        
        Cliente clientes[] = new Cliente[nomePedido.size()];
        Pedido pedidos[] = new Pedido[nomePedido.size()];
        
        for(int i = 0; i < nomePedido.size(); i++){
            clientes[i] = new Cliente(cliente.get(i), "00000"+i);
            pedidos[i] = new Pedido(clientes[i], nomePedido.get(i));
        }
		Restaurante restaurante = new PizzaHut();
		restaurante.realizarPedido(pedidos);
		
		for(int i = 0; i < pedidos.length; i++ ) {
			Assertions.assertEquals(restaurante.statusPedido()[0].getNome(), "Pizza de Queijo");
		}
	}

	
	@Test
	void testNovoPedidoCliente() {
		ArrayList<String> nomePedido = new ArrayList();
        ArrayList<String> cliente = new ArrayList();
 
        nomePedido.add("Pizza de Queijo");
        nomePedido.add("Pizza de Presunto");
        nomePedido.add("Pizza de Frango");
        nomePedido.add("Pizza de Arroz carreteiro");
        
        cliente.add("Vandick");
        cliente.add("Bérgson");
        cliente.add("Yago pikachu");
        cliente.add("Leandro Cearense");
        
        Cliente clientes[] = new Cliente[nomePedido.size()];
        Pedido pedidos[] = new Pedido[nomePedido.size()];
        
        for(int i = 0; i < nomePedido.size(); i++){
            clientes[i] = new Cliente(cliente.get(i), "00000"+i);
            pedidos[i] = new Pedido(clientes[i], nomePedido.get(i));
        }
		Restaurante restaurante = new PizzaHut();
		restaurante.realizarPedido(pedidos);
		
		for(int i = 0; i < clientes.length; i++ ) {
			Assertions.assertEquals(restaurante.statusPedido()[i].getCliente().getNome(), clientes[i].getNome());
		}		
		
	}
	
}

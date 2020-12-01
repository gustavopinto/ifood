package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Pedido> pedidos = new ArrayList<Pedido>();
		
		Cliente leonardo = new Cliente("Leonardo", "000.000.000-00");
		Entregador mario = new Entregador("Mário");
		Restaurante pizzaHut = new PizzaHut();
		
		Pedido yakisoba = new Pedido(leonardo, "Yakisoba");
		pedidos.add(yakisoba);
		Pedido arrozCarreteiro = new Pedido(leonardo, "Arroz Carreteiro");
		pedidos.add(arrozCarreteiro);
		
		leonardo.realizarPedido(pizzaHut, pedidos);
		
		pizzaHut.enviarPedido(mario);
		
		System.out.println(leonardo.statusMeusPedidos());
	}

}

package br.ufpa.poo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PizzaHutTest {
	
	static String dataHora = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());

	
	@Test
	void testeRealizarPedido(){
		Pedido novoPedido = new Pedido(new Cliente("Gustavo", "00000000000"), "Pizza de Queijo", 35.0,dataHora);
		Pedido novoPedido2 = new Pedido(new Cliente("Gustavo", "00000000000"), "Coca-Cola", 5.0,dataHora);
		Pedido novoPedido3 = new Pedido(new Cliente("Gustavo", "00000000000"), "Doce", 4.0,dataHora);

		listaDePedidos.add(Pedido);
		listaDePedidos.add(Pedido2);
		listaDePedidos.add(Pedido3);
		
				
		Assertions.assertEquals();

	}

}

package br.ufpa.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NovosTest {
	
	/*NOTA IMPORTANTE: não consegui implementar de maneira correta o teste de timestamp, 
	 * na execução do teste ele espera mais valores doq foi declarado na string.
	 */

	@Test
	void ListaTest() {
		PizzaHut restaurante = new PizzaHut();
		Cliente c1 = new Cliente("Joao", "00001");
		restaurante.realizarPedido(new Pedido(c1, "Pizza de Queijo", 22, 45));
		restaurante.realizarPedido(new Pedido(c1, "Pizza de Calabresa", 22, 46));
		
		Assertions.assertEquals(restaurante.getpedidos().size(), 2);//teste pra checar tamanho da lista da compra no restaurante
		Assertions.assertEquals(restaurante.getpedidos().get(0).getNome(), "Pizza de Queijo"); //teste pra checar item 0 da lista
		Assertions.assertEquals(restaurante.getpedidos().get(1).getNome(), "Pizza de Calabresa"); //teste pra checar item 1 da lista
		Assertions.assertEquals(restaurante.getpedidos().get(0).cal.getTime(), "22:45"); //teste pra checar hora do pedido 0
	}
	
	@Test
	void EntregaTest() {
		PizzaHut restaurante = new PizzaHut();	
		Cliente c1 = new Cliente("Joao", "00001");
		Entregador e1 = new Entregador("Paulo");
		restaurante.realizarPedido(new Pedido(c1, "Pizza de Queijo", 22, 45));
		restaurante.realizarPedido(new Pedido(c1, "Pizza de Calabresa", 22, 46));
		restaurante.enviarPedido(e1);
		Assertions.assertEquals(e1.getConta().getLista().size(), 2); //teste pra checar tamanho da lista recebida pelo entregador
		Assertions.assertEquals(e1.getConta().getValorTotal(), 30); //teste para checar valor total da compra
		Assertions.assertEquals(e1.getConta().getCliente().getNome(), "Joao"); // teste para checar o nome do cliente na conta
		
	}
	@Test
	void CompraTest() {
		//Teste para checar se o pagamento funcionou e a hora do pedido 0
		PizzaHut restaurante = new PizzaHut();
		Cliente c1 = new Cliente("Joao", "00001");
		Entregador e1 = new Entregador("Paulo");
		restaurante.realizarPedido(new Pedido(c1, "Pizza de Queijo", 22, 45));
		restaurante.realizarPedido(new Pedido(c1, "Pizza de Calabresa", 22, 46));
		restaurante.enviarPedido(e1);
		e1.receberPagamento(30);
		
		Assertions.assertEquals(e1.getConta().getPagou(), true);
		Assertions.assertEquals(e1.getConta().getLista().get(0).getCal().getTime(), "22:45");
	}
	
	

}

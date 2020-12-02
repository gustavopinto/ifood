package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

public class PizzaHut implements Restaurante {
	
	private Pedido novoPedido;
	List<Pedido> pedidos = new ArrayList<>();
	float valorFrete = 10; //frete fixado para 10 reais 
	Conta conta;
	
	

	@Override
	public void realizarPedido(Pedido pedido) {		
		
		//double valorPrato = Math.random() * 20;
		this.novoPedido = pedido;
		this.novoPedido.definirValorPedido(10);//todas as pizzas valem 10 reais 
		this.pedidos.add(novoPedido);
	}

	@Override
	public void cancelarPedido(String nomePedido) {
		this.novoPedido = null;
	}

	@Override
	public void enviarPedido(Entregador entregador) {
		float total = (float) 0;
		for (int i = 0; i < pedidos.size(); i++) {
			total = (float) (total + (pedidos.get(i).getValorPedido()));			
		}
		total = total + valorFrete;
		this.conta = new Conta(novoPedido.getCliente(), pedidos, total);		
		entregador.receberPedido(conta);
	}
	
	public void finalizarPedido() {
		this.novoPedido = null;
	}
	
	public Pedido statusPedido() {
		return novoPedido;
	}
	
	public List<Pedido> getpedidos(){
		return (pedidos);
	}
	
	public void ver() {
		for (int i = 0; i < pedidos.size(); i++) {
			System.out.println(pedidos.get(i).getNome());
		}
	}

}

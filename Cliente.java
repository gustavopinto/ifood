package br.ufpa.poo;

import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String cpf;

	private Pedido meuPedido;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCPF() {
		return this.cpf;
	}
	
	public void realizarPedido(ArrayList<String> nomesDosPedidos, Restaurante restaurante) {     // alteração 05
			
			ArrayList<Pedido> pedidos = new ArrayList<>();
			for(int i=0; i < nomesDosPedidos.size(); i++) {
				Pedido pedido = new Pedido(this, nomesDosPedidos.get(i));
				pedidos.add(pedido);
				restaurante.realizarPedido(pedidos);
			}
			

	}
	
	public Pedido getPedido() {
		return meuPedido;
	}

}

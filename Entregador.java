package br.ufpa.poo;

import java.util.ArrayList;

public class Entregador {

	private String nome;
	private ArrayList<Pedido> pedidos;
	
	private double saldo;

	public Entregador(String nome) {
		this.nome = nome;
	}

	public void receberPedido(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public void receberPagamento(double valor) {
		if (valor == pedido.getValorTotal()) {
			pedido.realizarPagamento();
			this.saldo += pedido.getValorFrete();
		}
	}

	public String getNome() {
		return this.nome;
	}

	public ArrayList<Pedido> getPedido() {
		return this.pedidos;
	}

}

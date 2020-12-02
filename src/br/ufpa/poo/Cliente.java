package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	private String status;
	
	private List<Pedido> meusPedidos;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.status = "";
		this.meusPedidos = new ArrayList<Pedido>();
	}

	public String getNome() {
		return this.nome;
	}

	public String getCPF() {
		return this.cpf;
	}
	
	public void realizarPedido(Restaurante restaurante, List<Pedido> pedidos) {
		this.meusPedidos = pedidos;
		
		pedidos.forEach(pedido -> {
			pedido.realizarPagamento();
		});
		
		restaurante.receberPedido(meusPedidos);
	}
	
	public String statusMeusPedidos() {
		
		status += "Cliente: " + this.nome + "\n"; 
		status += "Valor do frete: R$" + String.format("%.2f", this.meusPedidos.get(0).getValorFrete()) + "\n"; 
		status += "Pedidos: " + "\n"; 
		
		this.meusPedidos.forEach(pedido -> {
			status += pedido.getNome() + ": R$" + String.format("%.2f", pedido.getValorPedido()) + "\n"; 
		});
		status += "Valor do Total: R$ " + String.format("%.2f", this.meusPedidos.get(0).getValorTotal()) + "\n"; 
		
		return status;
	}

	public String getMeusPedidos() {
		this.meusPedidos.forEach(pedido -> {
			status += pedido.getNome() + " ";
		});
		return status;
	}

}

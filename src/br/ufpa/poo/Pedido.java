package br.ufpa.poo;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pedido {

	private double valorFrete;
	private Cliente cliente;
	private boolean chegou;
	private boolean pagou;
	private Date data;
	private List<String> nomes;
	private List<Double> valorPedidos;


	public Pedido (Cliente cliente, List<String> nomes) {
		this.cliente = cliente;
		this.chegou = false;
		this.pagou = false;
		this.data = Calendar.getInstance().getTime();
		this.nomes = nomes;
	}

	public Pedido (Cliente cliente, List<String> nomes, List<Double> valorPedidos) {
		this(cliente, nomes);
		this.valorPedidos = valorPedidos;
	}

	public double getValorTotal() {
		return valorPedido + valorFrete;
	}

	public double getValorFrete() {
		return valorPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void definirValorPedido(List<Double> valorPedidos, double valorFrete) {
		this.valorPedidos = valorPedidos;
		this.valorFrete = valorFrete;
	}

	public boolean statusPagamento() {
		return this.pagou;
	}
	
	public void realizarPagamento() {
		this.pagou=true;
	}
	
	public boolean statusEntrega() {
		return this.chegou;
	}
	
	public void pedidoEntregue() {
		this.chegou = true;
	}

	public Date getData() {
		return data;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public List<Double> getValorPedidos() {
		return valorPedidos;
	}
}

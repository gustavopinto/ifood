package br.ufpa.poo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Pedido {

	private List<String> nomes;
	private List<Double> valorPedidos;
	private double somaPedidos;
	private double valorFrete;
	private Cliente cliente;
	private boolean chegou;
	private boolean pagou;
	private Date dataPedido;
	
	public Pedido (Cliente cliente, List<String> nomes) {
		this.nomes = nomes;
		this.somaPedidos = 0;
		this.cliente = cliente;
		this.chegou = false;
		this.pagou = false;
		this.dataPedido = new Date(System.currentTimeMillis());
	}
	
	public Pedido (Cliente cliente, List<String> nomes, List<Double> valorPedidos) {
		this(cliente, nomes);
		this.valorPedidos = valorPedidos;
	}

	public List<String> getNomes() {
		return nomes;
	}
	
	private double somarValorPedidos() {
		double soma = 0;
		
		for (Double d: this.valorPedidos) {
			soma += d;
		}
		
		return soma;
	}

	public double getValorTotal() {
		return somarValorPedidos() + valorFrete;
	}
	
	public List<Double> getValorPedido() {
		return valorPedidos;
	}

	public double getValorFrete() {
		return valorFrete;
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
	
	public Date infoDataPedido() {
		return this.dataPedido;
	}
}

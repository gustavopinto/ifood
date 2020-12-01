	package br.ufpa.poo;

public class Pedido {

	private String nome;
	private double valorPedido;
	private double valorFrete;
	private Cliente cliente;
	private boolean chegou;
	private boolean pagou;
	
	public Pedido (Cliente cliente, String nomeDoPedido) {
		this.nome = nomeDoPedido;
		this.cliente = cliente;
		this.chegou = false;
		this.pagou = false;
	}
	
	public Pedido (Cliente cliente, String nomeDoPedido, double valorPedido) {
		this(cliente, nomeDoPedido);
		this.valorPedido = valorPedido;
	}

	public String getNome() {
		return nome;
	}

	public double getValorTotal() {
		return valorPedido + valorFrete;
	}
	
	public double getValorPedido() {
		return valorPedido;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void definirValorPedido(double valorPedido, double valorFrete) {
		this.valorPedido = valorPedido;
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
}

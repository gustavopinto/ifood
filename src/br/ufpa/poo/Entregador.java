package br.ufpa.poo;

public class Entregador {
	
	private String nome;
	private Pedido pedido;
	
	private double saldo;

	public Entregador(String nome) {
		this.nome = nome;
	}

	public void receberPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void receberPagamento(double valor) {
		if (valor == pedido.getValorTotal()) {
			pedido.realizarPagamento();
			this.setSaldo(this.getSaldo() + pedido.getValorFrete());
		}
	}

	public String getNome() {
		return this.nome;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

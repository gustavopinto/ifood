package br.ufpa.poo;

public class Entregador {
	String nome;
	Conta conta;

	public Entregador(String nome) {
		this.nome = nome;
	}

	public void receberPedido(Conta conta) {
		this.conta = conta;
	}

	public void receberPagamento(float valor) {
		if (valor == this.conta.getValorTotal()) {
			boolean pagou = true;
			conta.pagamento(pagou);				
		}
	}

	public String getNome() {
		return this.nome;
	}

	public Conta getConta() {
		return this.conta;
	}

}

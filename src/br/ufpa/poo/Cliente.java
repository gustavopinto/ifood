package br.ufpa.poo;


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
	
	public void realizarPedido(String nome, Restaurante restaurante) {
		this.meuPedido = new Pedido(null, nome, 0, nome);  
		restaurante.realizarPedido(meuPedido);
	}
	
	public Pedido getPedido() {
		return meuPedido;
	}

}

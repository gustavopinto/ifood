package br.ufpa.poo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pedido {

	private String nome;
	private double valorPedido;
	private Cliente cliente;
	private boolean chegou;
	private boolean pagou;
	//private int hora; NOTA: pensei em utilizar tipo primitivo pra armazenar o tempo de forma simples, mas decidi trocar
	//private int minuto;     entretanto os testes não sairam do jeito que eu esperava.
	SimpleDateFormat sdf = new SimpleDateFormat( "HH:mm" );
	Calendar cal = Calendar.getInstance();

	
	public Pedido (Cliente cliente, String nomeDoPedido, int hora, int min) {
		this.nome = nomeDoPedido;
		this.cliente = cliente;
		this.chegou = false;
		this.pagou = false;
		cal.set(Calendar.HOUR_OF_DAY, hora);
		cal.set(Calendar.MINUTE, min);
	}
	
	public String getNome() {
		return nome;
	}

	public double getValorTotal() {
		return valorPedido; 
	}
	
	public double getValorPedido() {
		return valorPedido;
	}

	public double getValorFrete() {
		return valorPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void definirValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
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
	
	/*public int getHora() {
		return (hora);
	}
	public int getMin() {
		return(minuto);
	}*/
	public Calendar getCal() {
		return (cal);
	}
}

package br.ufpa.poo;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	private Cliente cliente;
	private boolean pagou;	
List<Pedido> pedidos = new ArrayList<>();
private float valorTotal;

	
	public Conta (Cliente cl, List<Pedido> a, float b) {
		this.cliente = cl;
		this.pedidos = a;
		this.valorTotal = b;
		this.pagou = false;

	}
	
	public float getValorTotal() {
		return (this.valorTotal);
	}
	
	public void pagamento(boolean p) {	
		this.pagou = p;
	}
	
	public List<Pedido> getLista() {
		return pedidos;
	}
	
	public Cliente getCliente() {
		return(cliente);
	}
	public boolean getPagou() {
		return(pagou);
	}
	}


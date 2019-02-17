package br.com.fiap.modelo;

public class Pedido {
	private int numPedido;
	private Cliente cliente;
	private double total;
	private String formaPagamento;
	private ItemPedido itemPedido;
	
	public String getAll() {
		return numPedido + "\n" +
				cliente.getAll() + "\n" + 
				total + "\n" + 
				formaPagamento + "\n" + 
				itemPedido.getAll();
	}
	
	public void setAll(int numPedido, Cliente cliente, double total, String formaPagamento, ItemPedido itemPedido) {
		setNumPedido(numPedido);
		setCliente(cliente);
		setTotal(total);
		setFormaPagamento(formaPagamento);
		setItemPedido(itemPedido);
	}
	public Pedido() {
		super();
	}
	public Pedido(int numPedido, Cliente cliente, double total, String formaPagamento, ItemPedido itemPedido) {
		super();
		setNumPedido(numPedido);
		setCliente(cliente);
		setTotal(total);
		setFormaPagamento(formaPagamento);
		setItemPedido(itemPedido);
	}
	public int getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		if (formaPagamento.equalsIgnoreCase("CARTÃO")) {
			this.formaPagamento = formaPagamento.toUpperCase();
		}else {
			this.formaPagamento="A VISTA";
		}
	}
	public ItemPedido getItemPedido() {
		return itemPedido;
	}
	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}

}

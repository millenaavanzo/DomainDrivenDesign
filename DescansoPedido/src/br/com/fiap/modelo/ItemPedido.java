package br.com.fiap.modelo;

public class ItemPedido {
	private Produto produto;
	private int qtde;
	private double valor;
	
	public double getSubTotal() {
		return qtde*valor;
	}
	
	public String getAll() {
		return produto.getAll() + "\n" +
				qtde + "\n" + 
				valor;
	}
	public void setAll(Produto produto, int qtde, double valor) {
		setProduto(produto);
		setQtde(qtde);
		setValor(valor);
	}
	public ItemPedido() {
		super();
	}
	public ItemPedido(Produto produto, int qtde, double valor) {
		super();
		setProduto(produto);
		setQtde(qtde);
		setValor(valor);
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		if (qtde<=0) {
			qtde=1;
		}
		this.qtde = qtde;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}

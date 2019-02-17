package br.com.fiap.modelo;

public class Produto {
	private int codigo;
	private double valor;
	private String descricao;
	private Fornecedor fornecedor;

	public void setAll(int codigo, double valor, String descricao, Fornecedor fornecedor) {
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
		this.fornecedor = fornecedor;
	}
	public Produto() {
	}
	public Produto(int codigo, double valor, String descricao, Fornecedor fornecedor) {
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
		this.fornecedor = fornecedor;
	}
	public String getAll() {
		return codigo + "\n" + valor + "\n" + 
				descricao + "\n" + fornecedor.getAll();
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}

package br.com.fiap.modelo;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	private String tipo;
	public String getAll() {
		return codigo + "\n" +
				descricao + "\n" + 
				valor + "\n" + 
				tipo;
	}
	public void setAll(int codigo, String descricao, double valor, String tipo) {
		setCodigo(codigo);
		setDescricao(descricao);
		setValor(valor);
		setTipo(tipo);
	}

	public Produto() {
		super();
	}
	public Produto(int codigo, String descricao, double valor, String tipo) {
		super();
		setCodigo(codigo);
		setDescricao(descricao);
		setValor(valor);
		setTipo(tipo);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao.toUpperCase();
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if (tipo.equalsIgnoreCase("ALIMENTÍCIO") || 
				tipo.equalsIgnoreCase("ELETRÔNICO")) {
			this.tipo = tipo.toUpperCase();
		}else {
			this.tipo="TIPO DESCONHECIDO";
		}
	}

}

package br.com.fiap.modelo;

public class Curso {
	private String descricao;
	private double valor;
	private int codigo;
	private String titulacao;
	private int duracao;
	
	public String getResumo() {
		return descricao + "\n" + valor + "\n" + duracao;
	}
	
	public void setResumo(int d, double v, String desc) {
		descricao=desc;
		valor=v;
		duracao=d;
	}
	
	public double getParcela() {
		return valor/duracao;
	}
	
	public String getAll() {
		return  "Descrição...:" + descricao + "\n"+ 
				"Valor.......:" + valor + "\n"+
				"Código......:" + codigo+"\n"+
				"Titulação...:" + titulacao+"\n"+
				"Duração.....:" + duracao;
	}
	
	public void setAll(String descricao, double valor, int codigo, String titulacao, int duracao) {
		this.descricao = descricao;
		this.valor = valor;
		this.codigo = codigo;
		this.titulacao = titulacao;
		this.duracao = duracao;
	}

	public Curso() {
		super();
	}
	public Curso(String descricao, double valor, int codigo, String titulacao, int duracao) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.codigo = codigo;
		this.titulacao = titulacao;
		this.duracao = duracao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}



}

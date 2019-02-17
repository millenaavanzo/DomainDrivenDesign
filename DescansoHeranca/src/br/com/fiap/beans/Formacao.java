package br.com.fiap.beans;

public class Formacao {
	private String descricao;
	private Unidade unidade;
	private double valor;
	private int duracao;
	private String coordenacao;
	private String sigla;
	
	public void definirDuracao() {	
		if (this instanceof Tecnologo) {
			duracao=24;
		}else if( this instanceof Medio) {
			duracao=36;
		}else {
			if (descricao.indexOf("ENGENHARIA")>=0) {
				duracao=60;
			}else {
				duracao=48;
			}
		}
	}
	
	
	public String getAll() {
		return descricao + "\n" +
				unidade.getAll() + "\n" + 
				valor + "\n" + 
				duracao + "\n" + 
				coordenacao + "\n" + 
				sigla;
	}
	public void setAll(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla) {
		setDescricao(descricao);
		setUnidade(unidade);
		setValor(valor);
		setDuracao(duracao);
		setCoordenacao(coordenacao);
		setSigla(sigla);
	}

	public Formacao() {
		super();
	}
	public Formacao(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla) {
		super();
		setDescricao(descricao);
		setUnidade(unidade);
		setValor(valor);
		setDuracao(duracao);
		setCoordenacao(coordenacao);
		setSigla(sigla);
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getCoordenacao() {
		return coordenacao;
	}
	public void setCoordenacao(String coordenacao) {
		this.coordenacao = coordenacao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}

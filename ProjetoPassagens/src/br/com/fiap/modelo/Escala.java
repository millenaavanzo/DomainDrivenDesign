package br.com.fiap.modelo;

public class Escala {
	private String duracao;
	private String localidade;
	
	public void setAll(String d, String loc) {
		duracao=d;
		localidade=loc;
	}
	public String getAll() {
		return duracao + "\n" + localidade;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

}

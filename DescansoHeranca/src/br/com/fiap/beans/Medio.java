package br.com.fiap.beans;

public class Medio extends Formacao{
	private String tipo;
	private String orientadorPedagogico;
	
	public String getAll() {
		return super.getAll() + "\n" + 
				tipo + "\n" + orientadorPedagogico;
	}
	
	public void setAll(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla,
			String tipo, String orientadorPedagogico) {
		super.setAll(descricao, unidade, valor, duracao, coordenacao, sigla);
		setTipo(tipo);
		setOrientadorPedagogico(orientadorPedagogico);
	}
	
	public Medio(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla,
			String tipo, String orientadorPedagogico) {
		super(descricao, unidade, valor, duracao, coordenacao, sigla);
		setTipo(tipo);
		setOrientadorPedagogico(orientadorPedagogico);
	}
	public Medio() {
		super();
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getOrientadorPedagogico() {
		return orientadorPedagogico;
	}
	public void setOrientadorPedagogico(String orientadorPedagogico) {
		this.orientadorPedagogico = orientadorPedagogico;
	}

	
}

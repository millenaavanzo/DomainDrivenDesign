package br.com.fiap.beans;

public class Tecnologo extends Formacao{
	private boolean planoEstendido;
	private String am;

	public String getAll() {
		return super.getAll() + "\n" + planoEstendido + "\n" + am;
	}
	public void setAll(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla,
			boolean planoEstendido, String am) {
		super.setAll(descricao, unidade, valor, duracao, coordenacao, sigla);
		setPlanoEstendido(planoEstendido);
		setAm(am);
	}

	public Tecnologo(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla,
			boolean planoEstendido, String am) {
		super(descricao, unidade, valor, duracao, coordenacao, sigla);
		setPlanoEstendido(planoEstendido);
		setAm(am);
	}
	public Tecnologo() {
		super();
	}
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}
	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	public String getAm() {
		return am;
	}
	public void setAm(String am) {
		this.am = am;
	}

}

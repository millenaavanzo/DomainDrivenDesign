package br.com.fiap.beans;

public class Bacharelado extends Formacao{
	
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	private boolean planoEstendido;
	
	
	public String getAll() {
		return super.getAll() + "\n" + projetoConclusao + "\n" + cargaHorariaEstagio + "\n" + planoEstendido;
	}
	public void setAll(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla,
			String projetoConclusao, int cargaHorariaEstagio, boolean planoEstendido) {
		super.setAll(descricao, unidade, valor, duracao, coordenacao, sigla);
		setProjetoConclusao(projetoConclusao);
		setCargaHorariaEstagio(cargaHorariaEstagio);
		setPlanoEstendido(planoEstendido);
	}

	public Bacharelado(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla,
			String projetoConclusao, int cargaHorariaEstagio, boolean planoEstendido) {
		super(descricao, unidade, valor, duracao, coordenacao, sigla);
		setProjetoConclusao(projetoConclusao);
		setCargaHorariaEstagio(cargaHorariaEstagio);
		setPlanoEstendido(planoEstendido);
	}
	public Bacharelado() {
		super();
	}
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}
	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}

}

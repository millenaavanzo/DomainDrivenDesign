package br.com.fiap.modelo;

public class Aluno {
	private int rm;
	private String nome;
	private double ps;
	private double am;
	private double nac;
	private int faltas;
	private Curso curso;
	private Endereco endereco;
	
	public String getSobrenome() {
		if (nome.indexOf(" ")>=0) {
			return nome.substring(nome.indexOf(" ")+1);
		}
		return null;
	}
	
	public String getPrimeiroNome() {
		if (nome.indexOf(" ")>=0) {
			return nome.substring(0, nome.indexOf(" "));
		}
		return nome;
	}
	
	public String getStatus() {
		if (getMedia()>=6) {
			return "Aprovado";
		}else {
			return null;
		}
	}
	
	public void lancarFalta(int q) {
		faltas=faltas+q;
	}
	
	public double getMedia() {
		return ps*0.5+am*0.3+nac*0.2;
	}
	
	public String getAll() {
		return  "RM..........:" + rm + "\n" +
				"Nome........:" + nome + "\n" + 
				"PS..........:" + ps + "\n" + 
				"AM..........:" + am + "\n" + 
				"NAC.........:" + nac + "\n" + 
				"Faltas......:" + faltas + "\n" + 
				"Curso.......:" +"\n" + curso.getAll() + "\n"+
				"Endereco....:" +"\n" + endereco.getAll();
	}
	public void setAll(int rm, String nome, double ps, double am, double nac, int faltas, Curso curso, Endereco endereco) {
		setRm(rm);
		setNome(nome);
		setPs(ps);
		setAm(am);
		setNac(nac);
		setFaltas(faltas);
		setCurso(curso);
		setEndereco(endereco);
	}
	public Aluno() {
		super();
	}
	public Aluno(int rm, String nome, double ps, double am, double nac, int faltas, Curso curso, Endereco endereco) {
		super();
		setRm(rm);
		setNome(nome);
		setPs(ps);
		setAm(am);
		setNac(nac);
		setFaltas(faltas);
		setCurso(curso);
		setEndereco(endereco);
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.equalsIgnoreCase("churros")) {
			nome="NOME INACEITAVEL";
		}
		
		if (nome.length()>40) {
			nome= nome.substring(0, 40);
		}
		this.nome = nome.toUpperCase();
	}
	public double getPs() {
		return ps;
	}
	public void setPs(double ps) {
		this.ps = ps;
	}
	public double getAm() {
		return am;
	}
	public void setAm(double am) {
		this.am = am;
	}
	public double getNac() {
		return nac;
	}
	public void setNac(double nac) {
		this.nac = nac;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}

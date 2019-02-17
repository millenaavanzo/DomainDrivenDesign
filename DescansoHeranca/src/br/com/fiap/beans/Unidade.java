package br.com.fiap.beans;

public class Unidade {
	private String nome;
	private String fone;
	private String email;
	
	public String getAll() {
		return nome + "\n" + fone + "\n" + email;
	}
	
	public void setAll(String nome, String fone, String email) {
		setNome(nome);
		setFone(fone);
		setEmail(email);
	}

	public Unidade(String nome, String fone, String email) {
		super();
		setNome(nome);
		setFone(fone);
		setEmail(email);
	}
	public Unidade() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

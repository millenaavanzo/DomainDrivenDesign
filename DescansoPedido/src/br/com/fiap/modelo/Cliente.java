package br.com.fiap.modelo;

public class Cliente {
	private String nome;
	private String telefone;
	private int codigo;
	private int qtdeEstrelas;
	private String login;
	private String senha;
	private String email;
	
	public void lancarEstrelas() {
		if (qtdeEstrelas<5) {
			qtdeEstrelas++;
		}
	}
	
	public void lancarEstrelas(int q) {
		if(qtdeEstrelas+q<=5) {
			qtdeEstrelas+=q;
			//qtdeEstrelas = qtdeEstrelas + q;
		}
	}
	
	public String getServer() {
		if (email.indexOf("@")>=0) {
			return email.substring(email.indexOf("@")+1);
		}
		return null;
	}
	public String getUser() {
		if(email.indexOf("@")>=0) {
			return email.substring(0, email.indexOf("@"));
		}
		return null;
	}
	
	public String getAll() {
		return nome + "\n" +
				telefone + "\n" + 
				codigo + "\n" + 
				qtdeEstrelas + "\n" + 
				login + "\n" + 
				senha + "\n" + 
				email;
	}
	
	public void setAll(String nome, String telefone, int codigo, int qtdeEstrelas, String login, String senha, String email) {
		setNome(nome);
		setTelefone(telefone);
		setCodigo(codigo);
		setQtdeEstrelas(qtdeEstrelas);
		setLogin(login);
		setSenha(senha);
		setEmail(email);
	}
	public Cliente() {
		super();
	}
	public Cliente(String nome, String telefone, int codigo, int qtdeEstrelas, String login, String senha, String email) {
		super();
		setNome(nome);
		setTelefone(telefone);
		setCodigo(codigo);
		setQtdeEstrelas(qtdeEstrelas);
		setLogin(login);
		setSenha(senha);
		setEmail(email);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		if (telefone.length()>15) {
			telefone=telefone.substring(0, 15);
			//telefone="TELEFONE INVÁLIDO";
		}
		this.telefone = telefone;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQtdeEstrelas() {
		return qtdeEstrelas;
	}
	public void setQtdeEstrelas(int qtdeEstrelas) {
		if (qtdeEstrelas<1 || qtdeEstrelas>5) {
			qtdeEstrelas=1;
		}
		this.qtdeEstrelas = qtdeEstrelas;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		if (login.length()<8 || login.length()>15) {
			login=null;
		}
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.indexOf("@")<0 || email.indexOf(".")<0) {
			email="erro@fiap.com.br";
		}
		this.email = email.toLowerCase();
	}

}







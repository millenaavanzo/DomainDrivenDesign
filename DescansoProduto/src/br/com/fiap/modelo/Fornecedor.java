package br.com.fiap.modelo;

public class Fornecedor {
	private String cnpj;
	private String razaoSocial;
	
	public Fornecedor (String c) {
		cnpj=c;
	}
	public Fornecedor() {}
	
	public Fornecedor(String c, String r) {
		cnpj=c;
		razaoSocial=r;
	}
	
	public String getAll() {
		return cnpj + "\n" + razaoSocial;
	}
	
	public void setAll(String c, String r) {
		cnpj=c;
		razaoSocial=r;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}

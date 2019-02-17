package br.com.fiap.modelo;

public class Endereco {
private String logradouro;
private String numero;
private String cep;
private String bairro;
public String getAll() {
	return  "Logradouro..:" + logradouro + "\n"+
			"N�mero......:" + numero + "\n"+
			"CEP.........:" + cep + "\n"+
			"Bairro......:" + bairro;
}
public void setAll(String logradouro, String numero, String cep, String bairro) {
	this.logradouro = logradouro;
	this.numero = numero;
	this.cep = cep;
	this.bairro = bairro;
}
public Endereco() {
	super();
}
public Endereco(String logradouro, String numero, String cep, String bairro) {
	super();
	this.logradouro = logradouro;
	this.numero = numero;
	this.cep = cep;
	this.bairro = bairro;
}
public String getLogradouro() {
	return logradouro;
}
public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}

}

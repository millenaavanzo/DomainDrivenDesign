package br.com.fiap.modelo;

public class Voo {
private String numero;
private String destino;
private Escala escala;

public void setAll(String n, String d, Escala e) {
	numero=n;
	destino=d;
	escala=e;
}

public String getAll() {
	return  "Número...: " + numero + "\n" + 
			"Destino..: " + destino + "\n" +
			"Escala...: " +"\n" + escala.getAll();
}

public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public String getDestino() {
	return destino;
}
public void setDestino(String destino) {
	this.destino = destino;
}
public Escala getEscala() {
	return escala;
}
public void setEscala(Escala escala) {
	this.escala = escala;
}



}

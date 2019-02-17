package br.com.fiap.principal;

import br.com.fiap.modelo.Escala;
import br.com.fiap.modelo.Voo;

public class TesteVoo {

	public static void main(String[] args) {
		Voo objeto = new Voo();
		Escala e = new Escala();
		objeto.setAll("JJ123", "Carapicuiba", e);
		e.setAll("1hora", "Oz-asco");
		System.out.println(objeto.getAll());

		
	}

}



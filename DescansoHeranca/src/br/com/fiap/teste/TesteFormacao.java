package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Bacharelado;
import br.com.fiap.beans.Formacao;
import br.com.fiap.beans.Medio;
import br.com.fiap.beans.Tecnologo;
import br.com.fiap.beans.Unidade;
import br.com.fiap.view.Magica;

public class TesteFormacao {

	public static void main(String[] args) {
		char resp = JOptionPane.showInputDialog
				("Digite: \n" + 
					"<B> para Bacharelado\n"+
					"<T> para Tecnologo\n" +
					"<M> para Medio")
				.toUpperCase().charAt(0);
		Formacao f=null;
		if (resp=='T') {
			f = new Tecnologo();
		}else if (resp=='M') {
			f = new Medio(
					Magica.texto("Descricao"), 
					new Unidade(
							Magica.texto("Nome"), 
							Magica.texto("Fone"), 
							Magica.texto("Email")
							), 
					Magica.decimal("Valor"), 
					0, 
					Magica.texto("Coordenação"), 
					Magica.texto("Sigla"),
					Magica.texto("Tipo"), 
					Magica.texto("Orientador Pedagógico")
					);
		}else if(resp=='B') {
			f = new Bacharelado();
		}else {
			System.out.println("Opção inválida");
		}
		f.definirDuracao();
		System.out.println(f.getAll());
		

	}

}







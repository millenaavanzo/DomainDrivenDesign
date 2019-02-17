package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Aluno;
import br.com.fiap.view.Magica;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setNome(Magica.texto("Digite o nome:"));
		System.out.println(a.getPrimeiroNome());
		System.out.println(a.getSobrenome());
		
		
		a.setRm(Integer.parseInt
				(JOptionPane.showInputDialog
				("Digite o RM:")));
		a.setPs(Double.parseDouble
				(JOptionPane.showInputDialog
				("Digite a PS")));
		
	}

}

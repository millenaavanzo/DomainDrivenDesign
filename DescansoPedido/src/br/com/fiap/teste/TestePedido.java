package br.com.fiap.teste;

import javax.swing.JOptionPane;

public class TestePedido {

	public static void main(String[] args) {
		char sexo='M';
		//while(sexo!='M' && sexo!='F') {
		//	sexo = JOptionPane.showInputDialog
		//	 ("Digite M ou F").toUpperCase().charAt(0);
		//}
		do {
			sexo = JOptionPane.showInputDialog
			 ("Digite M ou F").toUpperCase().charAt(0);
		}while(sexo!='M' && sexo!='F');
		
		if (sexo=='M') {
			System.out.println("Masculino");
		}else {
			System.out.println("Feminino");
		}


	}

}

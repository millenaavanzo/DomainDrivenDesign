package br.com.fiap.principal;

import br.com.fiap.excecao.Excecao;
import br.com.fiap.magica.Magica;

public class Teste {
	public static void main(String[] args) {
		try {
			double num= Magica.decimal("N�mero");
			System.out.println(num);
			//trata excecoes separadamente
			//o ultimo exception nao pode vir primeiro por ser geral, e n�o usa os outros
		}
		/*catch (NumberFormatException e) {
		//	System.out.println("Digite um numero");
			//e.printStackTrace(); /mostra a excecao e coloca no catch
		}catch(ArithmeticException e) {
			System.out.println("Erro aritmetico");
		} */
		catch(Exception e) {
		System.out.println(Excecao.tratarExcecao(e));	
		}
		finally {
			System.out.println("Fim");
		}

	}
}

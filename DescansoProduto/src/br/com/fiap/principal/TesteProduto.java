package br.com.fiap.principal;

import br.com.fiap.modelo.Fornecedor;
import br.com.fiap.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Fornecedor f = new Fornecedor();
		f.setCnpj("4654");
		f.setRazaoSocial("Chaves");
		//=============================
		Fornecedor f2 = new Fornecedor();
		f2.setAll("123", "Chaves");
		//====================
		Fornecedor f3 = new Fornecedor("123", "Chaves");
		//=====================
		Produto p = new Produto();
		p.setAll(1, 10, "Churros", f);
		//==============================
		Produto p2 = new Produto(
				1, 
				50, 
				"Churros", 
				new Fornecedor("456", "Casas Bahia"));
		
		System.out.println(p2.getAll());
	}
}






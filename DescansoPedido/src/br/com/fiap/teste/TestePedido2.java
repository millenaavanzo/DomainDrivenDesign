package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Cliente;
import br.com.fiap.modelo.ItemPedido;
import br.com.fiap.modelo.Pedido;
import br.com.fiap.modelo.Produto;
import br.com.fiap.view.Magica;

public class TestePedido2 {

	public static void main(String[] args) {
		int resposta=0;
		do {
			
			Pedido p = new Pedido(
					Magica.inteiro("Nº pedido"), 
					new Cliente(
							Magica.texto("Nome"), 
							Magica.texto("Telefone"), 
							Magica.inteiro("Código"), 
							Magica.inteiro("Estrelas"), 
							Magica.texto("Login"), 
							Magica.texto("Senha"), 
							Magica.texto("Email")
							), 
					Magica.decimal("Total"), 
					Magica.texto("Pagamento"), 
					new ItemPedido(
							new Produto(
									Magica.inteiro("Cod"), 
									Magica.texto("Desc"), 
									Magica.decimal("Valor"), 
									Magica.texto("Tipo")
									), 
							Magica.inteiro("Qtde venda"), 
							Magica.decimal("Valor Venda")
							)
					);
			System.out.println(p.getAll());
			p.getCliente().lancarEstrelas(3);
			System.out.println(p.getCliente().getQtdeEstrelas());
			
			resposta=JOptionPane.
					showConfirmDialog(
							null, 
							"Continuar?",
							"Pergunta",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE
							);
		}while(resposta==0);

	}

}

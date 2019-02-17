package br.com.fiap.teste;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.fiap.excecao.Excecao;

public class Conexao2 {

	public static void main(String[] args) {	
		Connection con = null;
		///FEITO COM PREPARED STATEMENT
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection
					//@localhost para usar em casa, ORCL = xe, no lugar do rm colocar "SYSTEM"
					("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","RM81400","180900");
			System.out.println("Abriu");

			stmt = con.prepareStatement("select * from T_DDD_CLIENTE where NR_CLIENTE=? AND NM_CLIENTE=?");
			//fazer conexão para ver se coincide com o banco, como se fosse usuario e senha
			String strNome=JOptionPane.showInputDialog("Digite o nome").toUpperCase();
			int intNumero=Integer.parseInt(JOptionPane.showInputDialog("Digite o número do cliente"));
			//COLOCAR O PARAMETRO DO ? PARA PEGAR A VARIAVEL
			stmt.setInt(1, intNumero);
			stmt.setString(2, strNome);
			rs = stmt.executeQuery();
			
			
			if (rs.next()) {
				System.out.println("Autorizado");
				//se der outro aparece a outra linha da coluna
				System.out.println("Numero do cliente: "+rs.getInt("NR_CLIENTE"));
				System.out.println("Nome cliente: "+rs.getString("NM_CLIENTE"));
				System.out.println("Quantidade de estrelas: "+rs.getInt("QT_ESTRELAS"));
				System.out.println("-------------------------");
			}else {
				System.out.println("Informação incorreta");
			}


			//DESLOCAR PONTEIRO PARA A LINHA DE DADOS
			//enquanto houver linha ele retorna tru e mostra todos os dados

			while (rs.next()) {
				//se der outro aparece a outra linha da coluna
				System.out.println("Numero do cliente: "+rs.getInt("NR_CLIENTE"));
				System.out.println("Nome cliente: "+rs.getString("NM_CLIENTE"));
				System.out.println("Quantidade de estrelas: "+rs.getInt("QT_ESTRELAS"));
				System.out.println("-------------------------");
			}
		}catch(Exception e) {
			//1º Momento: o sistema está em teste
			e.printStackTrace();
			//2º Momento: o sistema está homologado
			System.out.println(Excecao.tratarExcecao(e));
		}finally {
			// é sempre executado para encerrar conexão
			try {
				con.close();
				System.out.println("fechou");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(Excecao.tratarExcecao(e));
			}
		}

	}

}

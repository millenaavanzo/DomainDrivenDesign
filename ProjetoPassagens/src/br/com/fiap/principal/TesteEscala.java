package br.com.fiap.principal;
import br.com.fiap.modelo.Escala;

public class TesteEscala {

public static void main(String[] args) {
	Escala objeto = new Escala();
	objeto.setLocalidade("Oz-asco");
	objeto.setDuracao("1 hora");
	System.out.println(objeto.getLocalidade());
	System.out.println(objeto.getDuracao());
	
	
}

}

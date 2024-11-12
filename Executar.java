package atividadeava;

public class Executar {
	   public static void main(String[] args) {
	       IDados dados = new Dados();
	       Receita receita = dados.receita();
	       Impressao impressao = new Impressao();
	       impressao.imprimir(receita);
	    
	}
}

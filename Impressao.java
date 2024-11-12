package atividadeava;

public class Impressao {
    public void imprimir(Receita receita) {
        System.out.println("RECEITA MEDICA");
        System.out.println("CLEINTE: " + receita.getCliente().getNome());
        System.out.println("MEDICO: " + receita.getMedico().getNome());
        System.out.println("DATA: " + receita.getDataReceita());
        System.out.println("DESCRICAO: " + receita.getDescricao());
        System.out.println("MEDICAMENTO:");
        for (Medicamento medicamento : receita.getMedicamentos()) {
            System.out.println("- " + medicamento.getDescricao() + " (" + medicamento.getFormato() + "):$$$ " + medicamento.getPreco());
        }
    }
}

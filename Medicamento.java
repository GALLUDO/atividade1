package atividadeava;

public class Medicamento {
    private String descricao;
    private double preco;
    private Formato formato;

    public Medicamento(String descricao, double preco, Formato formato) {
        this.descricao = descricao;
        this.preco = preco;
        this.formato = formato;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public Formato getFormato() {
        return formato;
    }
}
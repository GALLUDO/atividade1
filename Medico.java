package atividadeava;

public class Medico {
    private String nome;
    private String especialidade;
    private String cre;

    public Medico(String nome, String especialidade, String cre) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.cre = cre;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCre() {
        return cre;
    }
}
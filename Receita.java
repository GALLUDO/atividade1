package atividadeava;

import java.util.Date;

public class Receita {
    private Cliente cliente;
    private Medico medico;
    private Medicamento[] medicamentos;
    private String descricao;
    private Date dataReceita;

    public Receita(Cliente cliente, Medico medico, Medicamento[] medicamentos, String descricao, Date dataReceita) {
        this.cliente = cliente;
        this.medico = medico;
        this.medicamentos = medicamentos;
        this.descricao = descricao;
        this.dataReceita = dataReceita;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Medicamento[] getMedicamentos() {
        return medicamentos;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDataReceita() {
        return dataReceita;
    }
}

package atividadeava;

import java.util.Date;

interface IDados {
    Medico[] medicos();
    Cliente[] clientes();
    Medicamento[] medicamentos();
    Receita receita();
}


public class Dados implements IDados {
    public Medico[] medicos() {
        return new Medico[] {
            new Medico("Dr. JOAO", "NEUROLOGISTA", "12345"),
            new Medico("Dra. JOANA", "ORTOPEDISTA", "67890")
        };
    }

    public Cliente[] clientes() {
        return new Cliente[] {
            new Cliente("123.456.789-00", "CARLAO", "ASDFAS@email.com"),
            new Cliente("987.654.321-00", "CARLONA", "ADFASDF@email.com")
        };
    }

    public Medicamento[] medicamentos() {
        return new Medicamento[] {
            new Medicamento("MEDICAMENTO A", 9990.99, Formato.COMPRIMIDO),
            new Medicamento("MEDICAMENTO B", 3000.99, Formato.LIQUIDO)
        };
    }
    public Receita receita() {
        Cliente cliente = clientes()[0];
        Medico medico = medicos()[0];
        Medicamento[] medicamentos = medicamentos();
        return new Receita(cliente, medico, medicamentos, "CANCER NO CEREBRO TERMINAL REMEDIOS SUPRESSORES DE DOR", new Date());
    }
}

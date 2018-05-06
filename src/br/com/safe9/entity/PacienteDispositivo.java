package br.com.safe9.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class PacienteDispositivo {
    
    @ManyToOne
    @JoinColumn(name = "IdPessoaPaciente")
    private Pessoa pessoaPaciente;
        
    @ManyToOne
    @JoinColumn(name = "serial")
    private Dispositivo dispositivo;
    
    @Id
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    
    @Id
    @Temporal(TemporalType.DATE)
    private Date dataFim;

    public Pessoa getPessoaPaciente() {
        return pessoaPaciente;
    }

    public void setPessoaPaciente(Pessoa pessoaPaciente) {
        this.pessoaPaciente = pessoaPaciente;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
    
}

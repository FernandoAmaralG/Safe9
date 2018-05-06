package br.com.safe9.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Bebe {
    
    @Id
    @JoinColumn(name = "IdPessoaBebe", referencedColumnName = "IdPessoaPaciente",insertable = false, updatable = false)
    @OneToOne
    private Paciente paciente;
    
    private Byte batimentoCardiaco;
    
    @Temporal(TemporalType.DATE)
    private Date inicioGestacao;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    
    public Byte getBatimentoCardiaco() {
        return batimentoCardiaco;
    }

    public void setBatimentoCardiaco(Byte batimentoCardiaco) {
        this.batimentoCardiaco = batimentoCardiaco;
    }

    public Date getInicioGestacao() {
        return inicioGestacao;
    }

    public void setInicioGestacao(Date inicioGestacao) {
        this.inicioGestacao = inicioGestacao;
    }
    
    
}
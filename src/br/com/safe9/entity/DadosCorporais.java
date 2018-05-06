package br.com.safe9.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class DadosCorporais {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdDadosCorporais;
    
    @NotNull(message = "Insira uma temperatura")
    private Float temperatura;
    
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull(message = "Insira uma data")
    private Date dataDado;
    
    @NotNull(message = "Insira o valor do inchaço")
    private Float inchaco;
    
    @NotNull(message = "Insira o batimento cardíaco")
    private Byte batimentoCardiaco;
    
    @NotNull(message = "Insira a pressão")
    private Double pressao;
    
    @OneToMany(mappedBy = "dadosCorporais")
    private List<Paciente> pacientes;

    public Integer getIdDadosCorporais() {
        return IdDadosCorporais;
    }

    public void setIdDadosCorporais(Integer IdDadosCorporais) {
        this.IdDadosCorporais = IdDadosCorporais;
    }

    public Float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Float temperatura) {
        this.temperatura = temperatura;
    }

    public Date getDataDado() {
        return dataDado;
    }

    public void setDataDado(Date dataDado) {
        this.dataDado = dataDado;
    }

    public Float getInchaco() {
        return inchaco;
    }

    public void setInchaco(Float inchaco) {
        this.inchaco = inchaco;
    }

    public Byte getBatimentoCardiaco() {
        return batimentoCardiaco;
    }

    public void setBatimentoCardiaco(Byte batimentoCardiaco) {
        this.batimentoCardiaco = batimentoCardiaco;
    }

    public Double getPressao() {
        return pressao;
    }

    public void setPressao(Double pressao) {
        this.pressao = pressao;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
}

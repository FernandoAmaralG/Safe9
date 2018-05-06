package br.com.safe9.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Dispositivo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serial;
    
    @NotNull(message = "Insira um tipo")
    @Size(max = 1)
    private String tipo;
    
    @NotNull(message = "Insira um valor")
    private Double valorUnitario;
    
    @OneToMany(mappedBy = "dispositivo")
    private List<PacienteDispositivo> pacienteDispositivo;

    public List<PacienteDispositivo> getPacienteDispositivo() {
        return pacienteDispositivo;
    }

    public void setPacienteDispositivo(List<PacienteDispositivo> pacienteDispositivo) {
        this.pacienteDispositivo = pacienteDispositivo;
    }
    
    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
}

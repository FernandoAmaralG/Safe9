package br.com.safe9.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Cidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCidade;
    
    @NotNull(message = "Insira uma cidade")
    @Size(max = 100, message = "A cidade deverá conter no máximo 100 caractéres")
    private String Descricao;

    @ManyToOne
    @JoinColumn(name = "UF")
    private UnidadeFederativa UF;
    
    @OneToMany(mappedBy = "cidade")
    private List<Endereco> Enderecos;

    public List<Endereco> getEnderecos() {
        return Enderecos;
    }

    public void setEnderecos(List<Endereco> Enderecos) {
        this.Enderecos = Enderecos;
    }

    public UnidadeFederativa getUF() {
        return UF;
    }

    public void setUF(UnidadeFederativa UF) {
        this.UF = UF;
    }
    
    public Integer getIdCidade() {
        return IdCidade;
    }

    public void setIdCidade(Integer IdCidade) {
        this.IdCidade = IdCidade;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
}

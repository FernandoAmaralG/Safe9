package br.com.safe9.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdEndereco;
    
    @NotNull(message = "Insira um Logradouro")
    @Size(max = 120, message = "Logradouro deverá ter no máximo 120 caractéres")
    private String Logradouro;
    
    @NotNull(message = "Insira um Bairro")
    @Size(max = 100, message = "Bairro deverá ter no máximo 100 caractéres")
    private String Bairro;
    
    @NotNull(message = "Insira um CEP válido")
    private Integer CEP;
    
    @NotNull(message = "Insira um número")
    private Short Numero;

    @ManyToOne
    @JoinColumn(name = "IdCidade")
    private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    public Integer getIdEndereco() {
        return IdEndereco;
    }

    public void setIdEndereco(Integer IdEndereco) {
        this.IdEndereco = IdEndereco;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public Integer getCEP() {
        return CEP;
    }

    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    public Short getNumero() {
        return Numero;
    }

    public void setNumero(Short Numero) {
        this.Numero = Numero;
    }
    
    
}

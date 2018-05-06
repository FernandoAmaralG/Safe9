package br.com.safe9.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Telefone {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short IdTelefone;
    
    @NotNull(message = "Insira um número de telefone")
    private Integer NmrTelefone;
    
    @NotNull(message = "Insira uma descrição")
    @Size(max = 30, message = "A descrição deverá ter 30 caractéres")
    private String Descricao;
    
    @ManyToOne
    @JoinColumn(name = "IdPessoa")
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Short getIdTelefone() {
        return IdTelefone;
    }

    public void setIdTelefone(Short IdTelefone) {
        this.IdTelefone = IdTelefone;
    }

    public Integer getNmrTelefone() {
        return NmrTelefone;
    }

    public void setNmrTelefone(Integer NmrTelefone) {
        this.NmrTelefone = NmrTelefone;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
}

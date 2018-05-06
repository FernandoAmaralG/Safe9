package br.com.safe9.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Pessoa {

    //Primary Key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short IdPessoa;
    
    @NotNull(message = "Insira um Nome")
    @Size(max = 100, message = "O nome deverá ter no máximo 100 caractéres")
    private String Nome;
    
    @ManyToOne
    @JoinColumn(name = "IdEndereco")
    private Endereco endereco;
    
    @OneToMany(mappedBy = "pessoa")
    private List<Telefone> telefones;

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Short getIdPessoa() {
        return IdPessoa;
    }

    public void setIdPessoa(Short IdPessoa) {
        this.IdPessoa = IdPessoa;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
}

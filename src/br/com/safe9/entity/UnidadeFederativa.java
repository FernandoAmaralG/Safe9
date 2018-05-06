package br.com.safe9.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class UnidadeFederativa {
    
    @Id
    @Size(max = 2, message = "Insira uma Unidade Federativa(UF)")
    private String UF;
    
    @NotNull
    @Size(max = 50, message = "A unidade federativa deverá ter no máximo 50 caractéres")
    private String Descricao;

//    @OneToMany(mappedBy = "UF")
//    private List<Cidade> cidades;
    
    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
}

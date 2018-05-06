package br.com.safe9.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Medico {
    
    @Id
    @OneToOne
    //@JoinColumn(name = "IdPessoaMedico", referencedColumnName = "idPessoa",insertable = false, updatable = false)
    private Pessoa pessoa;
    
    @NotNull
    private Double CRM;

    @ManyToOne
    @JoinColumn(name = "IdLogin")
    private Login loginMedico;
    
    

    public Login getLoginMedico() {
        return loginMedico;
    }

    public void setLoginMedico(Login loginMedico) {
        this.loginMedico = loginMedico;
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    

    public Double getCRM() {
        return CRM;
    }

    public void setCRM(Double CRM) {
        this.CRM = CRM;
    }
    
}

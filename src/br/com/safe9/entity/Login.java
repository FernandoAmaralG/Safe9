package br.com.safe9.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Login {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdLogin;
    
    @NotNull(message = "Insira um usuário")
    @Size(max = 120, message = "O usuário deve conter 120 caracteres")
    private String usuario;
    
    @NotNull(message = "Insira uma senha")
    @Size(max = 60, message = "A senha deve conter 60 caracteres")
    private String senha;
    
    @OneToMany(mappedBy = "loginMedico")
    private List<Medico> medicos;

    @OneToMany(mappedBy = "loginPaciente")
    private List<Paciente> pacientes;

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
        
    public Long getIdLogin() {
        return IdLogin;
    }

    public void setIdLogin(Long IdLogin) {
        this.IdLogin = IdLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }
    
}

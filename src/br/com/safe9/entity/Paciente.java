package br.com.safe9.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Paciente {
    
    @Id
    @OneToOne
    @JoinColumn(name = "IdPessoaPaciente", referencedColumnName = "idPessoa",insertable = false, updatable = false)
    private Pessoa pessoa;
    
    @NotNull(message = "Insira um CPF válido")
    private Long CPF;
    
    @NotNull(message = "Insira uma idade")
    private Byte idade;
    
    @NotNull(message = "Insira um peso")
    private Float peso;
    
    @NotNull(message = "Insira uma altura")
    private Float altura;
    
    @NotNull(message = "Insira uma data de nascimento")
    private String dataNascimento;
    
    @ManyToOne
    @JoinColumn(name = "IdLogin")
    private Login loginPaciente;
    
    @ManyToOne
    @JoinColumn(name = "IdDadosCorporais")
    private DadosCorporais dadosCorporais;
    
    @OneToMany(mappedBy = "pessoaPaciente")
    private List<PacienteDispositivo> pacienteDispositivo;

    public List<PacienteDispositivo> getPacienteDispositivo() {
        return pacienteDispositivo;
    }

    public void setPacienteDispositivo(List<PacienteDispositivo> pacienteDispositivo) {
        this.pacienteDispositivo = pacienteDispositivo;
    }
    
    public DadosCorporais getDadosCorporais() {
        return dadosCorporais;
    }
    
    public void setDadosCorporais(DadosCorporais dadosCorporais) {
        this.dadosCorporais = dadosCorporais;
    }
    
    public Long getCPF() {
        return CPF;
    }

    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }

    public Byte getIdade() {
        return idade;
    }

    public void setIdade(Byte idade) {
        this.idade = idade;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Login getLoginPaciente() {
        return loginPaciente;
    }

    public void setLoginPaciente(Login loginPaciente) {
        this.loginPaciente = loginPaciente;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
        
        
}

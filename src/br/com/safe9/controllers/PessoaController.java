package br.com.safe9.controllers;

import javax.inject.Named;
import javax.enterprise.context.*;
import br.com.safe9.entity.*;
import br.com.safe9.ejb.*;
import java.util.List;
import javax.ejb.*;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@RequestScoped
public class PessoaController {
    
    private Pessoa pessoa;

    @EJB
    private PessoaEJB pessoaEjb;
    
    public PessoaController(){
        
        pessoa = new Pessoa();
    }
    
    public void salvar(){
        String erro = pessoaEjb.salvar(pessoa);
        
        if(erro == null){
            
            FacesContext.getCurrentInstance()
                    .addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvo com sucesso, null", null)
                    );
            pessoa = new Pessoa();
        }else{
            FacesContext.getCurrentInstance()
                    .addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO, erro, null)
                    );
        
        }
    }
    
    public List <Pessoa> listarPessoas(){
        return pessoaEjb.todos();
    }
    
    public void editar(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
    public PessoaController(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
 
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}

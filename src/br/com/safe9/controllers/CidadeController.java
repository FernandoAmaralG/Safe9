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
public class CidadeController {

	private Cidade cidade;

    @EJB
    private CidadeEJB cidadeEjb;
    
    public CidadeController(){
        
    	cidade = new Cidade();
    }
    
    public void salvar(){
        String erro = cidadeEjb.salvar(cidade);
        
        if(erro == null){
            
            FacesContext.getCurrentInstance()
                    .addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvo com sucesso, null", null)
                    );
            cidade = new Cidade();
        }else{
            FacesContext.getCurrentInstance()
                    .addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO, erro, null)
                    );
        
        }
    }
    
    public List <Cidade> listarCidades(){
        return cidadeEjb.todos();
    }
    
    public void editar(Cidade cidade){
        this.cidade = cidade;
    }
    
    public CidadeController(Cidade cidade) {
        this.cidade = cidade;
    }
    
 
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}

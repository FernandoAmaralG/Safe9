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
public class DadosCorporaisController {

	private DadosCorporais dadoscorporais;

    @EJB
    private DadosCorporaisEJB dadoscorporaisEjb;
    
    public DadosCorporaisController(){
        
    	dadoscorporais = new DadosCorporais();
    }
    
    public void salvar(){
        String erro = dadoscorporaisEjb.salvar(dadoscorporais);
        
        if(erro == null){
            
            FacesContext.getCurrentInstance()
                    .addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvo com sucesso, null", null)
                    );
            dadoscorporais = new DadosCorporais();
        }else{
            FacesContext.getCurrentInstance()
                    .addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO, erro, null)
                    );
        
        }
    }
    
    public List <DadosCorporais> listarDadosCorporais(){
        return dadoscorporaisEjb.todos();
    }
    
    public void editar(DadosCorporais dadoscorporais){
        this.dadoscorporais = dadoscorporais;
    }
    
    public DadosCorporaisController(DadosCorporais) {
        this.dadoscorporais = dadoscorporais;
    }
    
 
    public DadosCorporais getDadosCorporais() {
        return dadoscorporais;
    }

    public void setDadosCorporais(DadosCorporais dadoscorporais) {
        this.dadoscorporais = dadoscorporais;
    }
}

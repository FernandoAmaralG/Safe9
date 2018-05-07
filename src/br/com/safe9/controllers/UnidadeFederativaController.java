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
public class UnidadeFederativaController {

	private UnidadeFederativa unidadeFederativa;

    @EJB
    private UnidadeFederativaEJB unidadeFederativaEjb;
    
    public UnidadeFederativaController(){
        
    	unidadeFederativa = new UnidadeFederativa();
    }
    
    public void salvar(){
        String erro = unidadeFederativaEjb.salvar(unidadeFederativa);
        
        if(erro == null){
            
            FacesContext.getCurrentInstance()
                    .addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvo com sucesso, null", null)
                    );
            unidadeFederativa = new UnidadeFederativa();
        }else{
            FacesContext.getCurrentInstance()
                    .addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO, erro, null)
                    );
        
        }
    }
    
    public List <UnidadeFederativa> listarUnidadeFederativa(){
        return unidadeFederativaEjb.todos();
    }
    
    public void editar(UnidadeFederativa unidadeFederativa){
        this.unidadeFederativa = unidadeFederativa;
    }
    
    public UnidadeFederativaController(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }
    
 
    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }
    
}

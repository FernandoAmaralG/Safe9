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

public class BebeController {

	private Bebe bebe;

    @EJB
    private BebeEJB bebeEjb;
    
    public BebeController(){
        
    	bebe = new Bebe();
    }
    
    public void salvar(){
        String erro = bebeEjb.salvar(bebe);
        
        if(erro == null){
            
            FacesContext.getCurrentInstance()
                    .addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvo com sucesso, null", null)
                    );
            bebe = new Bebe();
        }else{
            FacesContext.getCurrentInstance()
                    .addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO, erro, null)
                    );
        
        }
    }
    
    public List <Bebe> listarBebes(){
        return bebeEjb.todos();
    }
    
    public void editar(Bebe bebe){
        this.bebe = bebe;
    }
    
    public BebeController(Bebe bebe) {
        this.bebe = bebe;
    }
    
 
    public Bebe getBebe() {
        return bebe;
    }

    public void setBebe(Bebe bebe) {
        this.bebe = bebe;
    }

}

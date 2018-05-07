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
public class TelefoneController {

	 private Telefone telefone;

	    @EJB
	    private TelefoneEJB telefoneEjb;
	    
	    public TelefoneController(){
	        
	    	telefone = new Telefone();
	    }
	    
	    public void salvar(){
	        String erro = telefoneEjb.salvar(telefone);
	        
	        if(erro == null){
	            
	            FacesContext.getCurrentInstance()
	                    .addMessage(null,
	                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvo com sucesso, null", null)
	                    );
	            telefone = new Telefone();
	        }else{
	            FacesContext.getCurrentInstance()
	                    .addMessage(null,
	                            new FacesMessage(FacesMessage.SEVERITY_INFO, erro, null)
	                    );
	        
	        }
	    }
	    
	    public List <Telefone> listarTelefones(){
	        return telefoneEjb.todos();
	    }
	    
	    public void editar(Telefone telefone){
	        this.telefone = telefone;
	    }
	    
	    public TelefoneController(Telefone telefone) {
	        this.telefone = telefone;
	    }
	    
	 
	    public Telefone getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(Telefone telefone) {
	        this.telefone = telefone;
	    }
}

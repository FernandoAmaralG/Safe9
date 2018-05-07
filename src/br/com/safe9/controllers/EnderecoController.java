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
public class EnderecoController {

	 private Endereco endereco;

	    @EJB
	    private EnderecoEJB enderecoEjb;
	    
	    public EnderecoController(){
	        
	    	endereco = new Endereco();
	    }
	    
	    public void salvar(){
	        String erro = enderecoEjb.salvar(endereco);
	        
	        if(erro == null){
	            
	            FacesContext.getCurrentInstance()
	                    .addMessage(null,
	                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvo com sucesso, null", null)
	                    );
	            endereco = new Endereco();
	        }else{
	            FacesContext.getCurrentInstance()
	                    .addMessage(null,
	                            new FacesMessage(FacesMessage.SEVERITY_INFO, erro, null)
	                    );
	        
	        }
	    }
	    
	    public List <Endereco> listarEnderecos(){
	        return enderecoEjb.todos();
	    }
	    
	    public void editar(Endereco endereco){
	        this.endereco = endereco;
	    }
	    
	    public EnderecoController(Endereco endereco) {
	        this.endereco = endereco;
	    }
	    
	 
	    public Endereco getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(Endereco endereco) {
	        this.endereco = endereco;
	    }

}

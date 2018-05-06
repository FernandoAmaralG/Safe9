package br.com.safe9.ejb;

import br.com.safe9.ejb.GenericEJB;
import javax.ejb.*;
import br.com.safe9.entity.Endereco;

@Stateless
public class EnderecoEJB extends GenericEJB<Endereco>{
   
    
    public EnderecoEJB(){
        
        super(Endereco.class);
    }
}
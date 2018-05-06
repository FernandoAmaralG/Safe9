package br.com.safe9.ejb;

import br.com.safe9.ejb.GenericEJB;
import javax.ejb.*;
import br.com.safe9.entity.Telefone;

@Stateless
public class TelefoneEJB extends GenericEJB<Telefone>{
   
    
    public TelefoneEJB(){
        
        super(Telefone.class);
    }
}

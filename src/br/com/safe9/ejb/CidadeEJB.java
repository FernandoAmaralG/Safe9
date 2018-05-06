package br.com.safe9.ejb;

import br.com.safe9.ejb.GenericEJB;
import javax.ejb.*;
import br.com.safe9.entity.Cidade;

@Stateless
public class CidadeEJB extends GenericEJB<Cidade>{
   
    
    public CidadeEJB(){
        
        super(Cidade.class);
    }
}

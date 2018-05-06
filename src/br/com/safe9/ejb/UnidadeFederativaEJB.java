package br.com.safe9.ejb;

import br.com.safe9.ejb.GenericEJB;
import javax.ejb.*;
import br.com.safe9.entity.UnidadeFederativa;

@Stateless
public class UnidadeFederativaEJB  extends GenericEJB<UnidadeFederativa>{
   
    
    public UnidadeFederativaEJB(){
        
        super(UnidadeFederativa.class);
    }
}

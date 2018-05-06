package br.com.safe9.ejb;

import br.com.safe9.ejb.GenericEJB;
import javax.ejb.*;
import br.com.safe9.entity.DadosCorporais;

@Stateless
public class DadosCorporaisEJB extends GenericEJB<DadosCorporais>{
   
    
    public DadosCorporaisEJB(){
        
        super(DadosCorporais.class);
    }
}
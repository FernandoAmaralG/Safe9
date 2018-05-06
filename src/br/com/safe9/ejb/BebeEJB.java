package br.com.safe9.ejb;

import br.com.safe9.ejb.GenericEJB;
import javax.ejb.*;
import br.com.safe9.entity.Bebe;

@Stateless
public class BebeEJB extends GenericEJB<Bebe>{
   
    
    public BebeEJB(){
        
        super(Bebe.class);
    }
}

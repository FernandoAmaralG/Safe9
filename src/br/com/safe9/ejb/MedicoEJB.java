package br.com.safe9.ejb;

import br.com.safe9.ejb.GenericEJB;
import javax.ejb.*;
import br.com.safe9.entity.Medico;

@Stateless
public class MedicoEJB  extends GenericEJB<Medico>{
   
    
    public MedicoEJB(){
        
        super(Medico.class);
    }
}

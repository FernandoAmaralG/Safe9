package br.com.safe9.ejb;

import br.com.safe9.ejb.GenericEJB;
import javax.ejb.*;
import br.com.safe9.entity.Dispositivo;

@Stateless
public class DispositivoEJB extends GenericEJB<Dispositivo>{
   
    
    public DispositivoEJB(){
        
        super(Dispositivo.class);
    }
}

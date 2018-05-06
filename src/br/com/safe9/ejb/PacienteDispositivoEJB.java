package br.com.safe9.ejb;

import br.com.safe9.ejb.GenericEJB;
import javax.ejb.*;
import br.com.safe9.entity.PacienteDispositivo;

@Stateless
public class PacienteDispositivoEJB extends GenericEJB<PacienteDispositivo>{
   
    
    public PacienteDispositivoEJB(){
        
        super(PacienteDispositivo.class);
    }
}
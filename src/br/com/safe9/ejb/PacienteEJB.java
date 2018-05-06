package br.com.safe9.ejb;

import br.com.safe9.ejb.GenericEJB;
import javax.ejb.*;
import br.com.safe9.entity.Paciente;

@Stateless
public class PacienteEJB  extends GenericEJB<Paciente>{
   
    
    public PacienteEJB(){
        
        super(Paciente.class);
    }
}
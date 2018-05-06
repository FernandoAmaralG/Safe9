package br.com.safe9.ejb;

import br.com.safe9.ejb.GenericEJB;
import javax.ejb.*;
import br.com.safe9.entity.Login;

@Stateless
public class LoginEJB extends GenericEJB<Login>{
   
    
    public LoginEJB(){
        
        super(Login.class);
    }
}
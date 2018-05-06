package br.com.safe9.ejb;

import br.com.safe9.ejb.GenericEJB;
import javax.ejb.*;
import br.com.safe9.entity.Pessoa;

@Stateless
public class PessoaEJB extends GenericEJB<Pessoa>{
   
    
    public PessoaEJB(){
        
        super(Pessoa.class);
    }
}
package br.com.safe9.ejb;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;


public class GenericEJB <T> {
    
    @PersistenceContext
    protected EntityManager em;
    private Class<T> classe;
    
    public GenericEJB(Class<T> classe){
    
        this.classe = classe;
    }
    
    
     public String salvar(T entidade){
        try{  
        //em.persist(marca); // salva
        em.merge(entidade); // Se o dado existir, ele consulta e altera, se não ele insere
        }catch(Exception ex){
            return "Erro ao salvar" + ex.getMessage();
        }
        return null;
    }
     
     public T consultarPorId(Serializable id){
     
         T entidade = em.find(classe, id);   
         return entidade;     
     }
    
     public String excluir(Serializable id){
         
         try{
             T entidade = consultarPorId(id);
             em.remove(entidade);
             return null;
         }catch(Exception ex){
             return "Erro ao excluir" + ex.getMessage();
         }
     }
     
     public List<T> todos(){
         String nomeClasse = classe.getSimpleName();
                 
         TypedQuery<T> query = em.createQuery("Select m  from" + nomeClasse+ "as m", classe);
                 
         return query.getResultList();
     }
}

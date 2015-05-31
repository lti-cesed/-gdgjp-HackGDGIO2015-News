package br.facisa.cesed.webservicenewswear.dao;

import br.facisa.cesed.webservicenewswear.entidades.Notificacao;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


public class NotificacaoDAO {
    
    private static NotificacaoDAO instance;
    
    public static NotificacaoDAO getInstance(){
    
        if (instance == null) {
            
            instance = new NotificacaoDAO();
        }
        return instance;
    }

    public NotificacaoDAO() {
    }
    
    public void cadastrar(Notificacao notificacao){
        
        EntityManager em = Util.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(notificacao);
        tx.commit();
        em.close();
        
    }
    
    public Collection<Notificacao> listarTodos(){
        EntityManager em = Util.getEntityManager();    
        Query query = em.createQuery("SELECT e FROM Notificacao e"); 
        Collection<Notificacao> notificacoes =  query.getResultList();
        em.close();
        return (Collection<Notificacao>) notificacoes;
    }
}

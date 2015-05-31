/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.facisa.cesed.webservicenewswear.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author Atylla
 */
public class Util {
    
    private static final String PERSISTENCEUNIT = "WebserviceNW";
    
    public static EntityManager getEntityManager() {        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCEUNIT);
        EntityManager em = factory.createEntityManager();
        em.getEntityManagerFactory().getCache().evictAll();
        return em;
    }

}
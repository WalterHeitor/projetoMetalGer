/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Marcos Winther
 */
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Model.Projetos;

/**
 *
 * @author Marcos Winther
 */
public class ProjetosDAO {
    private static ProjetosDAO instance;
    protected EntityManager entityManager;

    public static ProjetosDAO getInstance(){
        if (instance == null){
            instance = new ProjetosDAO();
        }
                    
        return instance;
    }
    private ProjetosDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public Projetos getById(final int id) {
        return entityManager.find(Projetos.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Projetos> findAll() {
        return entityManager.createQuery("FROM " + Projetos.class.getName()).getResultList();
    }
          
    public void persist(Projetos projetos) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(projetos);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(Projetos projetos) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(projetos);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Projetos projetos) {
        try {
            entityManager.getTransaction().begin();
            projetos = entityManager.find(Projetos.class, projetos.getId_projeto());
            entityManager.remove(projetos);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            Projetos projetos = getById(id);
            remove(projetos);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}


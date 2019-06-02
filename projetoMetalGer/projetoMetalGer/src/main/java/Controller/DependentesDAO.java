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
import Model.Dependentes;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Marcos Winther
 */
public class DependentesDAO {
    private static DependentesDAO instance;
    protected EntityManager entityManager;

    public static DependentesDAO getInstance(){
        if (instance == null){
            instance = new DependentesDAO();
        }
                    
        return instance;
    }
    private DependentesDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public Dependentes getById(final int id) {
        return entityManager.find(Dependentes.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Dependentes> findAll() {
        return entityManager.createQuery("FROM " + Dependentes.class.getName()).getResultList();
    }
          
    public void persist(Dependentes dependentes) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(dependentes);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(Dependentes dependentes) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(dependentes);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Dependentes dependentes) {
        try {
            entityManager.getTransaction().begin();
            dependentes = entityManager.find(Dependentes.class, dependentes.getId_dependentes());
            entityManager.remove(dependentes);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            Dependentes dependentes = getById(id);
            remove(dependentes);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}


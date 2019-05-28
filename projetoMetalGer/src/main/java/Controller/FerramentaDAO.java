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
import Model.Ferramenta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Marcos Winther
 */
public class FerramentaDAO {
    private static FerramentaDAO instance;
    protected EntityManager entityManager;

    public static FerramentaDAO getInstance(){
         if (instance == null){
            instance = new FerramentaDAO();
        }
                    
        return instance;
    }
    private FerramentaDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public Ferramenta getById(final int id) {
        return entityManager.find(Ferramenta.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Ferramenta> findAll() {
        return entityManager.createQuery("FROM " + Ferramenta.class.getName()).getResultList();
    }
          
    public void persist(Ferramenta ferramenta) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(ferramenta);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(Ferramenta ferramenta) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(ferramenta);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Ferramenta ferramenta) {
        try {
            entityManager.getTransaction().begin();
            ferramenta = entityManager.find(Ferramenta.class, ferramenta.getId_ferramenta());
            entityManager.remove(ferramenta);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            Ferramenta ferramenta = getById(id);
            remove(ferramenta);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}

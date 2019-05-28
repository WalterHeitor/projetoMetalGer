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
import Model.Insumo;

/**
 *
 * @author Marcos Winther
 */
public class InsumoDAO {
    private static InsumoDAO instance;
    protected EntityManager entityManager;

    public static InsumoDAO getInstance(){
        if (instance == null){
            instance = new InsumoDAO();
        }
                    
        return instance;
    }
    private InsumoDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public Insumo getById(final int id) {
        return entityManager.find(Insumo.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Insumo> findAll() {
        return entityManager.createQuery("FROM " + Insumo.class.getName()).getResultList();
    }
          
    public void persist(Insumo insumo) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(insumo);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(Insumo insumo) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(insumo);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Insumo insumo) {
        try {
            entityManager.getTransaction().begin();
            insumo = entityManager.find(Insumo.class, insumo.getId_insumo());
            entityManager.remove(insumo);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            Insumo insumo = getById(id);
            remove(insumo);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}


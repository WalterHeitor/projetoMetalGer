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
import Model.Telefone;

/**
 *
 * @author Marcos Winther
 */
public class TelefoneDAO {
    private static TelefoneDAO instance;
    protected EntityManager entityManager;

    public static TelefoneDAO getInstance(){
        if (instance == null){
            instance = new TelefoneDAO();
        }
                    
        return instance;
    }
    private TelefoneDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public Telefone getById(final int id) {
        return entityManager.find(Telefone.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Telefone> findAll() {
        return entityManager.createQuery("FROM " + Telefone.class.getName()).getResultList();
    }
          
    public void persist(Telefone telefone) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(telefone);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(Telefone telefone) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(telefone);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Telefone telefone) {
        try {
            entityManager.getTransaction().begin();
            telefone = entityManager.find(Telefone.class, telefone.getId_telefone());
            entityManager.remove(telefone);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            Telefone telefone = getById(id);
            remove(telefone);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}

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
import Model.Enderecos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Marcos Winther
 */
public class EnderecosDAO {
    private static EnderecosDAO instance;
    protected EntityManager entityManager;

    public static EnderecosDAO getInstance(){
        if (instance == null){
            instance = new EnderecosDAO();
        }
                    
        return instance;
    }
    private EnderecosDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public Enderecos getById(final int id) {
        return entityManager.find(Enderecos.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Enderecos> findAll() {
        return entityManager.createQuery("FROM " + Enderecos.class.getName()).getResultList();
    }
          
    public void persist(Enderecos enderecos) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(enderecos);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(Enderecos enderecos) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(enderecos);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Enderecos enderecos) {
        try {
            entityManager.getTransaction().begin();
            enderecos = entityManager.find(Enderecos.class, enderecos.getId_endereco());
            entityManager.remove(enderecos);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            Enderecos enderecos = getById(id);
            remove(enderecos);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}

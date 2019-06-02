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
import Model.Cliente;
import Model.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Marcos Winther
 */
public class PessaoDAO {
    private static PessaoDAO instance;
    protected EntityManager entityManager;

    public static PessaoDAO getInstance(){
        if (instance == null){
            instance = new PessaoDAO();
        }
                    
        return instance;
    }
    private PessaoDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public Pessoa getById(final int id) {
        return entityManager.find(Pessoa.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Cliente> findAll() {
        return entityManager.createQuery("FROM " + Pessoa.class.getName()).getResultList();
    }
          
    public void persist(Pessoa pessoa) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(pessoa);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(Pessoa pessoa) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(pessoa);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Pessoa pessoa) {
        try {
            entityManager.getTransaction().begin();
            pessoa = entityManager.find(Cliente.class, pessoa.getId_pessoa());
            entityManager.remove(pessoa);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            Pessoa pessoa = getById(id);
            remove(pessoa);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}
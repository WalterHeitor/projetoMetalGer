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
import Model.ProjetoInsumo;

/**
 *
 * @author Marcos Winther
 */
public class ProjetoInsumoDAO {
    private static ProjetoInsumoDAO instance;
    protected EntityManager entityManager;

    public static ProjetoInsumoDAO getInstance(){
        if (instance == null){
            instance = new ProjetoInsumoDAO();
        }
                    
        return instance;
    }
    private ProjetoInsumoDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public ProjetoInsumo getById(final int id) {
        return entityManager.find(ProjetoInsumo.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<ProjetoInsumo> findAll() {
        return entityManager.createQuery("FROM " + ProjetoInsumo.class.getName()).getResultList();
    }
          
    public void persist(ProjetoInsumo projetoInsumo) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(projetoInsumo);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(ProjetoInsumo projetoInsumo) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(projetoInsumo);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(ProjetoInsumo projetoInsumo) {
        try {
            entityManager.getTransaction().begin();
            projetoInsumo = entityManager.find(ProjetoInsumo.class, projetoInsumo.getId_projeto_insumo());
            entityManager.remove(projetoInsumo);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            ProjetoInsumo projetoInsumo = getById(id);
            remove(projetoInsumo);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}


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
import Model.OrdemServico;

/**
 *
 * @author Marcos Winther
 */
public class OrdemServicoDAO {
    private static OrdemServicoDAO instance;
    protected EntityManager entityManager;

    public static OrdemServicoDAO getInstance(){
        if (instance == null){
            instance = new OrdemServicoDAO();
        }
                    
        return instance;
    }
    private OrdemServicoDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public OrdemServico getById(final int id) {
        return entityManager.find(OrdemServico.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<OrdemServico> findAll() {
        return entityManager.createQuery("FROM " + OrdemServico.class.getName()).getResultList();
    }
          
    public void persist(OrdemServico ordemServico) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(ordemServico);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(OrdemServico ordemServico) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(ordemServico);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(OrdemServico ordemServico) {
        try {
            entityManager.getTransaction().begin();
            ordemServico = entityManager.find(OrdemServico.class, ordemServico.getId_ordem_servico());
            entityManager.remove(ordemServico);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            OrdemServico ordemServico = getById(id);
            remove(ordemServico);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}

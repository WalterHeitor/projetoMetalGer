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
import Model.MaoObraOrdemServico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Marcos Winther
 */
public class MaoObraOrdemServicoDAO {
    private static MaoObraOrdemServicoDAO instance;
    protected EntityManager entityManager;

    public static MaoObraOrdemServicoDAO getInstance(){
        if (instance == null){
            instance = new MaoObraOrdemServicoDAO();
        }
                    
        return instance;
    }
    private MaoObraOrdemServicoDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public MaoObraOrdemServico getById(final int id) {
        return entityManager.find(MaoObraOrdemServico.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<MaoObraOrdemServico> findAll() {
        return entityManager.createQuery("FROM " + MaoObraOrdemServico.class.getName()).getResultList();
    }
          
    public void persist(MaoObraOrdemServico obraOrdemServico) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(obraOrdemServico);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(MaoObraOrdemServico obraOrdemServico) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(obraOrdemServico);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(MaoObraOrdemServico obraOrdemServico) {
        try {
            entityManager.getTransaction().begin();
            obraOrdemServico = entityManager.find(MaoObraOrdemServico.class, obraOrdemServico.getDescricaoOperacao());
            entityManager.remove(obraOrdemServico);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            MaoObraOrdemServico obraOrdemServico = getById(id);
            remove(obraOrdemServico);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}
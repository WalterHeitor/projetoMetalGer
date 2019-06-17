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
import Model.FuncionarioOrdemServico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Marcos Winther
 */
public class FuncionarioOrdemServicoDAO {
    private static FuncionarioOrdemServicoDAO instance;
    protected EntityManager entityManager;

    public static FuncionarioOrdemServicoDAO getInstance(){
        if (instance == null){
            instance = new FuncionarioOrdemServicoDAO();
        }
                    
        return instance;
    }
    private FuncionarioOrdemServicoDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public FuncionarioOrdemServico getById(final int id) {
        return entityManager.find(FuncionarioOrdemServico.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<FuncionarioOrdemServico> findAll() {
        return entityManager.createQuery("FROM " + FuncionarioOrdemServico.class.getName()).getResultList();
    }
          
    public void persist(FuncionarioOrdemServico funcionarioOrdemServico) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(funcionarioOrdemServico);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(FuncionarioOrdemServico funcionarioOrdemServico) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(funcionarioOrdemServico);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(FuncionarioOrdemServico funcionarioOrdemServico) {
        try {
            entityManager.getTransaction().begin();
            funcionarioOrdemServico = entityManager.find(FuncionarioOrdemServico.class, funcionarioOrdemServico.getId_funcionario_ordem_servico());
            entityManager.remove(funcionarioOrdemServico);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            FuncionarioOrdemServico funcionarioOrdemServico = getById(id);
            remove(funcionarioOrdemServico);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}
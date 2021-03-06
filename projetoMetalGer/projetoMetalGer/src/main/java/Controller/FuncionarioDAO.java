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
import Model.Funcionario;

/**
 *
 * @author Marcos Winther
 */
public class FuncionarioDAO {
    private static FuncionarioDAO instance;
    protected EntityManager entityManager;

    public static FuncionarioDAO getInstance(){
         if (instance == null){
            instance = new FuncionarioDAO();
        }
                    
        return instance;
    }
    private FuncionarioDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public Funcionario getById(final int id) {
        return entityManager.find(Funcionario.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Funcionario> findAll() {
        return entityManager.createQuery("FROM " + Funcionario.class.getName()).getResultList();
    }
          
    public void persist(Funcionario funcionario) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(funcionario);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(Funcionario funcionario) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(funcionario);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(Funcionario funcionario) {
        try {
            entityManager.getTransaction().begin();
            funcionario = entityManager.find(Funcionario.class, funcionario.getCpf_func());
            entityManager.remove(funcionario);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            Funcionario funcionario = getById(id);
            remove(funcionario);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}
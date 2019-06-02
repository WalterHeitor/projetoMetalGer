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
import Model.EmprestimoFerramenta;

/**
 *
 * @author Marcos Winther
 */
public class EmprestimoFerramentaDAO {
    private static EmprestimoFerramentaDAO instance;
    protected EntityManager entityManager;

    public static EmprestimoFerramentaDAO getInstance(){
        if (instance == null){
            instance = new EmprestimoFerramentaDAO();
        }
                    
        return instance;
    }
    private EmprestimoFerramentaDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public EmprestimoFerramenta getById(final int id) {
        return entityManager.find(EmprestimoFerramenta.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<EmprestimoFerramenta> findAll() {
        return entityManager.createQuery("FROM " + EmprestimoFerramenta.class.getName()).getResultList();
    }
          
    public void persist(EmprestimoFerramenta emprestimoFerramenta) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(emprestimoFerramenta);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(EmprestimoFerramenta emprestimoFerramenta) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(emprestimoFerramenta);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(EmprestimoFerramenta emprestimoFerramenta) {
        try {
            entityManager.getTransaction().begin();
            emprestimoFerramenta = entityManager.find(EmprestimoFerramenta.class, emprestimoFerramenta.getId_emprestimo_ferramenta());
            entityManager.remove(emprestimoFerramenta);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            EmprestimoFerramenta emprestimoFerramenta = getById(id);
            remove(emprestimoFerramenta);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}

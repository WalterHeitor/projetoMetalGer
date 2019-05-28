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
import Model.PedidoCompra;
import Model.PedidoCompraInsumo;

/**
 *
 * @author Marcos Winther
 */
public class PedidoCompraInsumoDAO {
    private static PedidoCompraInsumoDAO instance;
    protected EntityManager entityManager;

    public static PedidoCompraInsumoDAO getInstance(){
        if (instance == null){
            instance = new PedidoCompraInsumoDAO();
        }
                    
        return instance;
    }
    private PedidoCompraInsumoDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public PedidoCompraInsumo getById(final Long id) {
        return entityManager.find(PedidoCompraInsumo.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<PedidoCompra> findAll() {
        return entityManager.createQuery("FROM " + PedidoCompraInsumo.class.getName()).getResultList();
    }
          
    public void persist(PedidoCompraInsumo pedidoCompraInsumo) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(pedidoCompraInsumo);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(PedidoCompraInsumo pedidoCompraInsumo) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(pedidoCompraInsumo);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(PedidoCompraInsumo pedidoCompraInsumo) {
        try {
            entityManager.getTransaction().begin();
            pedidoCompraInsumo = entityManager.find(PedidoCompraInsumo.class, pedidoCompraInsumo.getId_pedCompIns());
            entityManager.remove(pedidoCompraInsumo);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final Long id) {
        try {
            PedidoCompraInsumo pedidoCompraInsumo = getById(id);
            remove(pedidoCompraInsumo);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}


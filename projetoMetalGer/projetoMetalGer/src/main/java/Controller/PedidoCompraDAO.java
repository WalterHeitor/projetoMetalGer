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

/**
 *
 * @author Marcos Winther
 */
public class PedidoCompraDAO {
    private static PedidoCompraDAO instance;
    protected EntityManager entityManager;

    public static PedidoCompraDAO getInstance(){
        if (instance == null){
            instance = new PedidoCompraDAO();
        }
                    
        return instance;
    }
    private PedidoCompraDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_lcp");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
  
        return entityManager;
        
    }
         
    public PedidoCompra getById(final int id) {
        return entityManager.find(PedidoCompra.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<PedidoCompra> findAll() {
        return entityManager.createQuery("FROM " + PedidoCompra.class.getName()).getResultList();
    }
          
    public void persist(PedidoCompra pedidoCompra) {
    
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(pedidoCompra);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
                    
                   
    }

    public void merge(PedidoCompra pedidoCompra) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(pedidoCompra);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void remove(PedidoCompra pedidoCompra) {
        try {
            entityManager.getTransaction().begin();
            pedidoCompra = entityManager.find(PedidoCompra.class, pedidoCompra.getId_pedido_compra());
            entityManager.remove(pedidoCompra);
            entityManager.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                entityManager.getTransaction().rollback();
            }
    }
  
    public void removeById(final int id) {
        try {
            PedidoCompra pedidoCompra = getById(id);
            remove(pedidoCompra);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }   

}


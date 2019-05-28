package Teste;


import Controller.InsumoDAO;
import Controller.ProjetosDAO;
import Model.Cliente;
import Model.Insumo;
import Model.Projetos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walter heitor
 */
public class TestePedidoCompra {
    public static void main(String[] args) {
      Cliente c = new Cliente("1234", "softWalter", "1234", "Walter", 2);  
      //ClienteDAO.getInstance().persist(c);
      Projetos p = new Projetos("itumbiara", "correia transprtadora", "lateral", "maria", "clara", "walter", "walter heitor", c);
      p.setPessoa(c);
      ProjetosDAO.getInstance().persist(p);
     // ProjetosDAO.getInstance().merge(p);
      Insumo i = new Insumo("disco de corte", 123, 1);
      InsumoDAO.getInstance().persist(i);
        System.out.println("----------------teste realizado com sucesso------------------");
    }
    
    
}

package Teste;


import Controller.InsumoDAO;
import Controller.ProjetosDAO;
import Model.Cliente;
import Model.Funcionario;
import Model.Insumo;
import Model.Projetos;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walter heitor
 */
public class TesteInsercaoTable {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("pai_func", "mae_func", "cart_profissional_serie_func", "cart_reservista_func",
                "cart_resrvis_categoria_func", "titulo_eleitor_func", "cart_identidade_func", new Date(90, 4, 3),
                "orgao_emissorcart_identidade_func", "cpf_func", "pis_func", new Date(91, 7, 5), "local_nasc_func",
                new Date(78, 5, 1), "estado_civil_func", "grau_instrucao_func", "peso_func", "cabelo_func", "pele_func", "defeitos_func", "nome", 1);
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

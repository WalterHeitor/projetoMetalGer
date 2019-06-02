package Teste;


import Controller.FuncionarioDAO;
import Controller.InsumoDAO;
import Controller.OrdemServicoDAO;
import Controller.ProjetosDAO;
import Model.Cliente;
import Model.Funcionario;
import Model.Insumo;
import Model.OrdemServico;
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
      FuncionarioDAO.getInstance().persist(f);
      System.out.println("---- funcionario inserido com sucesso ----");
      Cliente c = new Cliente("1234", "softWalter", "1234", "Walter", 2);  
      //ClienteDAO.getInstance().persist(c);
      Projetos p = new Projetos("itumbiara", "correia transprtadora", "lateral", "maria", "clara", "walter", "walter heitor", c);
      p.setPessoa(c);
      //ProjetosDAO.getInstance().persist(p);
      System.out.println("---- cliente e projeto --- inserido com sucesso ----");
     // ProjetosDAO.getInstance().merge(p);
      Insumo i = new Insumo("disco de corte", 123, 1);
      InsumoDAO.getInstance().persist(i);
      System.out.println("---- Insumo inserido com sucesso----");
      OrdemServico os = new OrdemServico(new Date(00, 8, 2), new Date(00, 8, 10), new Date(00, 8, 12), "confecção transportadora", "Executando",p);
      OrdemServicoDAO.getInstance().persist(os);
        System.out.println("----- Ordem Serviço inserido com sucesso ----"); 
        System.out.println("---------------- teste realizado com sucesso ------------------");
    }
    
    
}

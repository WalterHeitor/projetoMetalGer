/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Controller.ClienteDAO;
import Controller.FerramentaDAO;
import Controller.FuncionarioDAO;
import Controller.InsumoDAO;
import Controller.OrdemServicoDAO;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author walter heitor
 */
public class GeraRelatorios {
 //relatorio funcionarios  
     public void GerarRelatorioFuncionario()throws JRException{
        System.out.println("gerando relatorio Funcionarios");
        
        List listaFuncionarios = FuncionarioDAO.getInstance().findAll();
        
        JasperReport jr =
                JasperCompileManager.compileReport("C:/Users/walter heitor/Desktop/projetoMetalGer/projetoMetalGer/projetoMetalGer/src/main/java/Relatorios//rerlatorioFuncionario.jrxml");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jr, null, new JRBeanCollectionDataSource(listaFuncionarios));
        JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/walter heitor/Desktop/teste/reportFunc.pdf");
        System.out.println("Relatorio gerado");
        
    }
 //relatorio clientes
      public void GerarRelatorioClientes()throws JRException{
        System.out.println("gerando relatorio Chientes");
        
        List listaClientes = ClienteDAO.getInstance().findAll();
        
        JasperReport jr =
                JasperCompileManager.compileReport("C:/Users/walter heitor/Desktop/projetoMetalGer/projetoMetalGer/projetoMetalGer/src/main/java/Relatorios//relatorioCliente.jrxml");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jr, null, new JRBeanCollectionDataSource(listaClientes));
        JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/walter heitor/Desktop/teste/reportCliente.pdf");
        System.out.println("Relatorio gerado");
        
    }
//relatorio ferramenta
      public void GerarRelatorioFerrmentas()throws JRException{
        System.out.println("gerando relatorio Ferramentas");
        
        List listaFerramenta = FerramentaDAO.getInstance().findAll();
        
        JasperReport jr =
                JasperCompileManager.compileReport("C:/Users/walter heitor/Desktop/projetoMetalGer/projetoMetalGer/projetoMetalGer/src/main/java/Relatorios//relatorioFerramenta.jrxml");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jr, null, new JRBeanCollectionDataSource(listaFerramenta));
        JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/walter heitor/Desktop/teste/reportFerramenta.pdf");
        System.out.println("Relatorio gerado");
        
    }
 //relatorio insumo
     public void GerarRelatorioInsumo()throws JRException{
        System.out.println("gerando relatorio Inzumo");
        
        List listaInsumo = InsumoDAO.getInstance().findAll();
        
        JasperReport jr =
                JasperCompileManager.compileReport("C:/Users/walter heitor/Desktop/projetoMetalGer/projetoMetalGer/projetoMetalGer/src/main/java/Relatorios//relatorioInsumo.jrxml");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jr, null, new JRBeanCollectionDataSource(listaInsumo));
        JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/walter heitor/Desktop/teste/reportInsumo.pdf");
        System.out.println("Relatorio gerado");
        
    }
//relatorio Ordem Servico
     public void GerarRelatorioOrdemServico()throws JRException{
        System.out.println("gerando relatorio Ordem Servico");
        
        List listaOrdemServico = OrdemServicoDAO.getInstance().findAll();
        
        JasperReport jr =
                JasperCompileManager.compileReport("C:/Users/walter heitor/Desktop/projetoMetalGer/projetoMetalGer/projetoMetalGer/src/main/java/Relatorios//relatorioOrdemServico.jrxml");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jr, null, new JRBeanCollectionDataSource(listaOrdemServico));
        JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/walter heitor/Desktop/teste/reportOS.pdf");
        System.out.println("Relatorio gerado");
        
    }
}

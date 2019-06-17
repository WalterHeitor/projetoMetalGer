/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Cadastro.telaCadastroClientes;
import View.Cadastro.TelaCadastroEmpregado;
import Controller.ProjetosDAO;
import Util.GeraRelatorios;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class telaInicial extends javax.swing.JFrame {

    /**
     * Creates new form telaInicial
     */
    public telaInicial() {
        initComponents();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuCadFuncionarios = new javax.swing.JMenuItem();
        MenuCadClientes = new javax.swing.JMenuItem();
        MenuCadFerramentas = new javax.swing.JMenuItem();
        Relatorios = new javax.swing.JMenu();
        MenuRelatorioFuncionario_ = new javax.swing.JMenuItem();
        MenuRelatorioCliente_ = new javax.swing.JMenuItem();
        MenuRelatorioFerramenta_ = new javax.swing.JMenuItem();
        MenuRelatorioInsumo_ = new javax.swing.JMenuItem();
        MenuRelatorioOrdemServico_ = new javax.swing.JMenuItem();
        MenuRelatorioProjetoClientes = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuCadastro.setText("Cadastros");

        MenuCadFuncionarios.setText("Funcionarios");
        MenuCadFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadFuncionariosActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadFuncionarios);

        MenuCadClientes.setText("Clientes");
        MenuCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadClientesActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadClientes);

        MenuCadFerramentas.setText("Ferramentas");
        MenuCadFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadFerramentasActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadFerramentas);

        jMenuBar1.add(MenuCadastro);

        Relatorios.setText("Relatorios");

        MenuRelatorioFuncionario_.setText("Funcionarios");
        MenuRelatorioFuncionario_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioFuncionario_ActionPerformed(evt);
            }
        });
        Relatorios.add(MenuRelatorioFuncionario_);

        MenuRelatorioCliente_.setText("Clientes");
        MenuRelatorioCliente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioCliente_ActionPerformed(evt);
            }
        });
        Relatorios.add(MenuRelatorioCliente_);

        MenuRelatorioFerramenta_.setText("Ferramentas");
        MenuRelatorioFerramenta_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioFerramenta_ActionPerformed(evt);
            }
        });
        Relatorios.add(MenuRelatorioFerramenta_);

        MenuRelatorioInsumo_.setText("Insumos");
        MenuRelatorioInsumo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioInsumo_ActionPerformed(evt);
            }
        });
        Relatorios.add(MenuRelatorioInsumo_);

        MenuRelatorioOrdemServico_.setText("Ordem Serviço");
        MenuRelatorioOrdemServico_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioOrdemServico_ActionPerformed(evt);
            }
        });
        Relatorios.add(MenuRelatorioOrdemServico_);

        MenuRelatorioProjetoClientes.setText("Projeto/Clientes");
        MenuRelatorioProjetoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioProjetoClientesActionPerformed(evt);
            }
        });
        Relatorios.add(MenuRelatorioProjetoClientes);

        jMenuBar1.add(Relatorios);

        jMenu5.setText("Serviços");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(418, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadFuncionariosActionPerformed
        // TODO add your handling code here:
        TelaCadastroEmpregado cadastroEmpregado = new TelaCadastroEmpregado();
        cadastroEmpregado.setVisible(true);
    }//GEN-LAST:event_MenuCadFuncionariosActionPerformed

    private void MenuCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadClientesActionPerformed
        // TODO add your handling code here:
        telaCadastroClientes tlcli = new telaCadastroClientes();
        tlcli.setVisible(true);
    }//GEN-LAST:event_MenuCadClientesActionPerformed

    private void MenuRelatorioFuncionario_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioFuncionario_ActionPerformed
       // TODO add your handling code here:
            /* try {
            JRResultSetDataSource setDataSource;
            setDataSource = new JRResultSetDataSource(
            (ResultSet) FuncionarioDAO.getInstance().findAll());
            JasperPrint jasperPrint;
            jasperPrint = JasperFillManager.fillReport("Relatorios/relatorioFuncionario.jasper",
            new HashMap(), setDataSource);
            JasperViewer jv = new JasperViewer(jasperPrint, false);
            jv.setVisible(true);
            jv.toFront();
            } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null,"Erro ao realizar o relatorio"+e.getMessage());
            }*/
        
        try {
            System.out.println("gerar relatorio");
            GeraRelatorios rf = new GeraRelatorios();
            rf.GerarRelatorioFuncionario();
        } catch (JRException ex) {
            Logger.getLogger(telaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_MenuRelatorioFuncionario_ActionPerformed
 
    private void MenuRelatorioInsumo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioInsumo_ActionPerformed
        // TODO add your handling code here:
        /*try { 
            JRResultSetDataSource setDataSource;
            setDataSource = new JRResultSetDataSource(
                    (ResultSet) FuncionarioDAO.getInstance().findAll());
            JasperPrint jasperPrint;
            jasperPrint = JasperFillManager.fillReport("C://Users//walter heitor//Desktop//projetoMetalGer//projetoMetalGer//projetoMetalGer//"
                    + "RElatorios//relatorioFuncionario.jasper",
                    new HashMap(), setDataSource);
            JasperViewer jv = new JasperViewer(jasperPrint, false);
            jv.setVisible(true);
            jv.toFront();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null,"Erro ao realizar o relatorio"+e.getMessage());
        }*/
        GeraRelatorios ins = new GeraRelatorios();
        try {
            ins.GerarRelatorioInsumo();
        } catch (JRException ex) {
            Logger.getLogger(telaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuRelatorioInsumo_ActionPerformed

    private void MenuCadFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadFerramentasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MenuCadFerramentasActionPerformed

    private void MenuRelatorioCliente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioCliente_ActionPerformed
        // TODO add your handling code here:
        /*try {
            
            JasperPrint jasperPrint;
            jasperPrint = JasperFillManager.fillReport("C:\\Users\\walter heitor\\Desktop\\projetoMetalGer\\projetoMetalGer\\projetoMetalGer\\RElatorios\\relatorioCliente.jrxml",
                    null, new JRBeanCollectionDataSource(ClienteDAO.getInstance().findAll()));
            JasperViewer jv = new JasperViewer(jasperPrint, false);
            jv.setVisible(true);
            jv.toFront();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null,"Erro ao realizar o relatorio Cliente----"+e.getMessage());
        }*/
        GeraRelatorios rc = new GeraRelatorios();
        try {
            rc.GerarRelatorioClientes();
        } catch (JRException ex) {
            Logger.getLogger(telaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuRelatorioCliente_ActionPerformed

    private void MenuRelatorioFerramenta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioFerramenta_ActionPerformed
        // TODO add your handling code here:
        GeraRelatorios rf = new GeraRelatorios();
        try {
            rf.GerarRelatorioFerrmentas();
        } catch (JRException ex) {
            Logger.getLogger(telaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
      /*  try {
            JRResultSetDataSource setDataSource;
            setDataSource = new JRResultSetDataSource(
                    (ResultSet) ClienteDAO.getInstance().findAll());
            JasperPrint jasperPrint;
            jasperPrint = JasperFillManager.fillReport("Relatorios/relatorioFerramenta.jasper",
                    new HashMap(), setDataSource);
            JasperViewer jv = new JasperViewer(jasperPrint, false);
            jv.setVisible(true);
            jv.toFront();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null,"Erro ao realizar o relatorio"+e.getMessage());
        }*/
    }//GEN-LAST:event_MenuRelatorioFerramenta_ActionPerformed

    private void MenuRelatorioOrdemServico_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioOrdemServico_ActionPerformed
        try {
            // TODO add your handling code here:
            /*try {
            JRResultSetDataSource setDataSource;
            setDataSource = new JRResultSetDataSource(
            (ResultSet) ClienteDAO.getInstance().findAll());
            JasperPrint jasperPrint;
            jasperPrint = JasperFillManager.fillReport("Relatorios/relatorioOrdemServico.jasper",
            new HashMap(), setDataSource);
            JasperViewer jv = new JasperViewer(jasperPrint, false);
            jv.setVisible(true);
            jv.toFront();
            } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null,"Erro ao realizar o relatorio"+e.getMessage());
            }*/
            GeraRelatorios os = new GeraRelatorios();
            os.GerarRelatorioOrdemServico();
        } catch (JRException ex) {
            Logger.getLogger(telaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuRelatorioOrdemServico_ActionPerformed

    private void MenuRelatorioProjetoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioProjetoClientesActionPerformed
        try {
            // TODO add your handling code here:
            GerarRelatorioProjetoCliente();
        } catch (JRException ex) {
            Logger.getLogger(telaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuRelatorioProjetoClientesActionPerformed

    
    public void GerarRelatorioProjetoCliente()throws JRException{
        System.out.println("gerando relatorio ");
        List listaProjeto = ProjetosDAO.getInstance().findAll();
        
        JasperReport jr =
                JasperCompileManager.compileReport("C:/Users/walter heitor/Desktop/projetoMetalGer/projetoMetalGer/projetoMetalGer/src/main/java/Relatorios//relatorioProjetoCliente.jrxml");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jr, null, new JRBeanCollectionDataSource(listaProjeto));
        JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/teste/reportProjCliente.pdf");
        System.out.println("Relatorio gerado");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCadClientes;
    private javax.swing.JMenuItem MenuCadFerramentas;
    private javax.swing.JMenuItem MenuCadFuncionarios;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuRelatorioCliente_;
    private javax.swing.JMenuItem MenuRelatorioFerramenta_;
    private javax.swing.JMenuItem MenuRelatorioFuncionario_;
    private javax.swing.JMenuItem MenuRelatorioInsumo_;
    private javax.swing.JMenuItem MenuRelatorioOrdemServico_;
    private javax.swing.JMenuItem MenuRelatorioProjetoClientes;
    private javax.swing.JMenu Relatorios;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

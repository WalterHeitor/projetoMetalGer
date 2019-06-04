/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteDAO;
import Controller.FuncionarioDAO;
import java.sql.ResultSet;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
<<<<<<< HEAD
        MenuRelatorioFuncionario_ = new javax.swing.JMenuItem();
        MenuRelatorioCliente_ = new javax.swing.JMenuItem();
        MenuRelatorioFerramenta_ = new javax.swing.JMenuItem();
        MenuRelatorioInsumo_ = new javax.swing.JMenuItem();
=======
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
>>>>>>> 4e457893d7f1e9aa134ae8385df851d7f279106d
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastros");

        jMenuItem1.setText("Funcionarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Ferramentas");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatorios");

        MenuRelatorioFuncionario_.setText("Funcionarios");
        MenuRelatorioFuncionario_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioFuncionario_ActionPerformed(evt);
            }
        });
        jMenu2.add(MenuRelatorioFuncionario_);

        MenuRelatorioCliente_.setText("Clientes");
        jMenu2.add(MenuRelatorioCliente_);

        MenuRelatorioFerramenta_.setText("Ferramentas");
        jMenu2.add(MenuRelatorioFerramenta_);

        MenuRelatorioInsumo_.setText("Insumos");
        MenuRelatorioInsumo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioInsumo_ActionPerformed(evt);
            }
        });
        jMenu2.add(MenuRelatorioInsumo_);

        jMenuItem5.setText("Cliente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        TelaCadastroEmpregado cadastroEmpregado = new TelaCadastroEmpregado();
        cadastroEmpregado.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        telaCadastroClientes tlcli = new telaCadastroClientes();
        tlcli.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void MenuRelatorioFuncionario_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioFuncionario_ActionPerformed
        // TODO add your handling code here:
        try {
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
        }
    }//GEN-LAST:event_MenuRelatorioFuncionario_ActionPerformed

    private void MenuRelatorioInsumo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioInsumo_ActionPerformed
        // TODO add your handling code here:
        try {
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
        }
    }//GEN-LAST:event_MenuRelatorioInsumo_ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        try {
            JRResultSetDataSource setDataSource;
            setDataSource = new JRResultSetDataSource(
                    (ResultSet) ClienteDAO.getInstance().findAll());
            JasperPrint jasperPrint;
            jasperPrint = JasperFillManager.fillReport("Relatorios/relatorioCliente.jasper",
                    new HashMap(), setDataSource);
            JasperViewer jv = new JasperViewer(jasperPrint, false);
            jv.setVisible(true);
            jv.toFront();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null,"Erro ao realizar o relatorio"+e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
    private javax.swing.JMenuItem MenuRelatorioCliente_;
    private javax.swing.JMenuItem MenuRelatorioFerramenta_;
    private javax.swing.JMenuItem MenuRelatorioFuncionario_;
    private javax.swing.JMenuItem MenuRelatorioInsumo_;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;

    // End of variables declaration//GEN-END:variables
}

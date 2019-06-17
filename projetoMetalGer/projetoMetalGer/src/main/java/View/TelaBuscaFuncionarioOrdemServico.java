/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.FuncionarioOrdemServicoDAO;
import Model.FuncionarioOrdemServico;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author walter heitor
 */
public class TelaBuscaFuncionarioOrdemServico extends javax.swing.JFrame {

    /**
     * Creates new form TelaBuscaProjetos
     */
    public TelaBuscaFuncionarioOrdemServico() {
        initComponents();
    }
    
    public void popularTabelaFuncionarioOrdemServico(List<FuncionarioOrdemServico> foslistaFuncionarioOrdemServico){
        DefaultTableModel modeloTabela = new DefaultTableModel();
        this.tabelaFuncionarioOrdemServico.setModel(modeloTabela);
        modeloTabela.addColumn("Id");
        modeloTabela.addColumn("Descricao");
        modeloTabela.addColumn("Data Prevista");
        modeloTabela.addColumn("Ordem Servico");
        modeloTabela.addColumn("Status Servico");
        
        for(FuncionarioOrdemServico fos :foslistaFuncionarioOrdemServico){
            modeloTabela.addRow(new Object[]{
                fos.getId_funcionario_ordem_servico(),
                fos.getDescricao(),
                fos.getDt_prevista(),
                fos.getOrdem_servico(),
                fos.getStatus_servico()
            });
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionarioOrdemServico = new javax.swing.JTable();
        btnBuscarProjetos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca de Projetos");

        tabelaFuncionarioOrdemServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaFuncionarioOrdemServico);

        btnBuscarProjetos.setText("buscar Funcionario O. S.");
        btnBuscarProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProjetosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarProjetos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscarProjetos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProjetosActionPerformed
        // TODO add your handling code here:
       /* Projetos p = new Projetos("itmbiara", "esteira", "esteira transportadora", "walter", "heitor", "oliveira", "tadeu");
        ProjetosDAO.getInstance().persist(p);
        Projetos p1 = new Projetos("santa helena", "esteira01", "esteira transportadora milho", "helio", "maria", "oliveira", "matheus");
        ProjetosDAO.getInstance().persist(p1);
        Projetos p2 = new Projetos("araporan", "elevador", "elevador transportadora milho", "joao", "clara", "oliveira", "marcos");
        ProjetosDAO.getInstance().persist(p2);*/
       
       
        List<FuncionarioOrdemServico> listaFuncionarioOrdemServico = new ArrayList<>();
        listaFuncionarioOrdemServico = FuncionarioOrdemServicoDAO.getInstance().findAll();
        this.popularTabelaFuncionarioOrdemServico(listaFuncionarioOrdemServico);
    }//GEN-LAST:event_btnBuscarProjetosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBuscaFuncionarioOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaFuncionarioOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaFuncionarioOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaFuncionarioOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaFuncionarioOrdemServico().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProjetos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFuncionarioOrdemServico;
    // End of variables declaration//GEN-END:variables
}

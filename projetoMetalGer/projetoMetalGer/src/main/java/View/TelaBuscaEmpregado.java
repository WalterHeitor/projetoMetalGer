/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.FuncionarioDAO;
import Model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author walter heitor
 */
public class TelaBuscaEmpregado extends javax.swing.JFrame {

    /**
     * Creates new form TelaBuscaProjetos
     */
    public TelaBuscaEmpregado() {
        initComponents();
    }
    
    public void popularTabelaFuncionario(List<Funcionario> flistaFuncionario){
        DefaultTableModel modeloTabela = new DefaultTableModel();
        this.tabelaFuncionario.setModel(modeloTabela);
        modeloTabela.addColumn("Tipo");
        modeloTabela.addColumn("Nome");
        modeloTabela.addColumn("Pai");
        modeloTabela.addColumn("Mae");
        modeloTabela.addColumn("CTPS");
        modeloTabela.addColumn("reservista");
        modeloTabela.addColumn("reservista_categoria");
        modeloTabela.addColumn("tituloEleitor");
        modeloTabela.addColumn("RG");
        modeloTabela.addColumn("emissaoRg");
        modeloTabela.addColumn("orgaoRg");
        modeloTabela.addColumn("cpf");
        modeloTabela.addColumn("pis");
        modeloTabela.addColumn("dataPis");
        modeloTabela.addColumn("localNascimento");
        modeloTabela.addColumn("dt_nasc");
        modeloTabela.addColumn("estado_civil");
        modeloTabela.addColumn("escolaridade");
        modeloTabela.addColumn("pele");
        modeloTabela.addColumn("peso");
        modeloTabela.addColumn("cabelo");
        modeloTabela.addColumn("defeitos");
        modeloTabela.addColumn("ex_admissional");
        modeloTabela.addColumn("cod_afastamento");
        modeloTabela.addColumn("dataAdmissao");
        modeloTabela.addColumn("dataFgts");
        modeloTabela.addColumn("cargo atual");
        modeloTabela.addColumn("tipo salario");
        modeloTabela.addColumn("local_trabalho");
        modeloTabela.addColumn("membro_Cipa");
        modeloTabela.addColumn("dt_saida_func");
        modeloTabela.addColumn("ex_admissional");
        modeloTabela.addColumn("ferias periodo gozo");
        modeloTabela.addColumn("alteracao_salarial");
        modeloTabela.addColumn("contribuicao_sindical");
        modeloTabela.addColumn("movimento afastamento");
        modeloTabela.addColumn("anotacoes gerais");
        
        for(Funcionario f :flistaFuncionario){
            modeloTabela.addRow(new Object[]{
                f.getTipo(),
                f.getNome(),
                f.getPai_func(),
                f.getMae_func(),
                f.getCart_profissional_serie_func(),
                f.getCart_reservista_func(),
                f.getCart_resrvis_categoria_func(),
                f.getTitulo_eleitor_func(),
                f.getCart_identidade_func(),
                f.getEmissao_cart_identidade(),
                f.getOrgao_emissorcart_identidade_func(),
                f.getCpf_func(),
                f.getPis_func(),
                f.getDt_pis_func(),
                f.getLocal_nasc_func(),
                f.getDt_nasc_func(),
                f.getEstado_civil_func(),
                f.getGrau_instrucao_func(),
                f.getPele_func(),
                f.getPeso_func(),
                f.getCabelo_func(),
                f.getDefeitos_func(),
                f.getEx_admicional(),
                f.getDt_admicao(),
                f.getDt_fgts(),
                f.getCargo_atual(),
                f.getTipo_salario(),
                f.getLocal_trabalho(),
                f.getMembro_cipa(),
                f.getDt_saida_func(),
                f.getEx_admicional(),
                f.getFerias_periodo_gozo_func(),
                f.getAlteracao_salario_func(),
                f.getContribuicao_sindical_func(),
                f.getMovimento_afastamento_func(),
                f.getAnotacoes_gerais_func()
                
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
        tabelaFuncionario = new javax.swing.JTable();
        btnBuscarProjetos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca de Projetos");

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaFuncionario);

        btnBuscarProjetos.setText("buscar Clientes");
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
       
       
        List<Funcionario> listaFuncionario = new ArrayList<>();
        listaFuncionario = FuncionarioDAO.getInstance().findAll();
        this.popularTabelaFuncionario(listaFuncionario);
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
            java.util.logging.Logger.getLogger(TelaBuscaEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaEmpregado().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProjetos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFuncionario;
    // End of variables declaration//GEN-END:variables
}
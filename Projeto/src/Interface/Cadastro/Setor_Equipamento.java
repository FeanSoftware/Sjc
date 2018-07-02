/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Cadastro;

//import Entidades.JComboBox;
import Entidades.*;
import banco.InserirDados;
import java.time.LocalDate;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio Cesar
 */
public class Setor_Equipamento extends JFrame {

    /**
     * Creates new form Setor_Equipamento
     */
    public Setor_Equipamento() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new JPanel();
        jComboBoxSetor = new javax.swing.JComboBox<>();
        jTextNome = new javax.swing.JTextField();
        jRadioButtonEquipamento = new javax.swing.JRadioButton();
        jRadioButtonSetor = new javax.swing.JRadioButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jComboBoxEmpresa = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBoxSetor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Setor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jComboBoxSetor.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxSetorPopupMenuWillBecomeVisible(evt);
            }
        });

        jTextNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        buttonGroup1.add(jRadioButtonEquipamento);
        jRadioButtonEquipamento.setText("Equipamento");

        buttonGroup1.add(jRadioButtonSetor);
        jRadioButtonSetor.setText("Setor");
        jRadioButtonSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSetorActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jComboBoxEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Empresa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jComboBoxEmpresa.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxEmpresaPopupMenuWillBecomeVisible(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextNome))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonEquipamento)
                    .addComponent(jRadioButtonSetor))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonSetorActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        Setor empresa = (Setor) jComboBoxEmpresa.getSelectedItem();
        Setor setor = (Setor) jComboBoxSetor.getSelectedItem();
        String nomeTipo;
        if(jRadioButtonEquipamento.isSelected()){
            nomeTipo = jRadioButtonEquipamento.getText();
        }else{ 
            nomeTipo = jRadioButtonSetor.getText();
        }
        if(empresa != null){
            if(setor != null){
                if(!jTextNome.getText().equals("")){
                    if(jRadioButtonEquipamento.isSelected() || jRadioButtonSetor.isSelected()){
                        if(JOptionPane.showConfirmDialog(null,
                                "Deseje salvar os dados"
                                        + "\nUnidade: "+empresa.getNome()
                                +"\nSetor: "+setor.getNome()
                                +"\nTipo: "+nomeTipo
                                +"\nNome: "+jTextNome.getText(),"Deseja mesmo salvar",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
                           if(nomeTipo.equals(jRadioButtonEquipamento.getText())){
                               Equipamento e = new Equipamento();
                               e.setNome(jTextNome.getText());
                               e.setDataUltimaExpesao(LocalDate.now().toString());
                               //InserirDados.inserirEquipamento(e,setor.getId(),empresa.getId());
                                if(setor.equals(empresa)){
                                   JOptionPane.showMessageDialog(null,"Voce nao pode salvar um equipamento no setor: \n"+setor.getNome(),"Setor Invalido",JOptionPane.ERROR_MESSAGE);
                               }else{
                                   InserirDados.inserirEquipamento(e,setor.getId(),empresa.getId());
                               }
                               
                               
                           }else{
                               Setor e = new Setor();
                               e.setNome(jTextNome.getText());
                               
                               if(setor.equals(empresa)){
                                   InserirDados.inserirSetor(e,0,empresa.getId());
                               }else{
                                   InserirDados.inserirSetor(e,setor.getId(),empresa.getId());
                               }
                           }
                            
                        }
                       
                    }else{
                       JOptionPane.showMessageDialog(null,"Selecione um tipo","Erro",JOptionPane.ERROR_MESSAGE);  
                    }
                     
                }else{
                    JOptionPane.showMessageDialog(null,"Informe um nome","Erro",JOptionPane.ERROR_MESSAGE);
                }
                 
            }else{
                JOptionPane.showMessageDialog(null,"Selecione um setor","Erro",JOptionPane.ERROR_MESSAGE);
            }
             
        }else{
            JOptionPane.showMessageDialog(null,"Selecione uma empresa","Erro",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxSetorPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxSetorPopupMenuWillBecomeVisible
        // TODO add your handling code here:
        Setor empresa = (Setor) jComboBoxEmpresa.getSelectedItem();
        
        if(empresa != null){
            List<Setor> list = banco.ResgatarDados.getAllSetores(empresa.getId());
            jComboBoxSetor.removeAllItems();
            jComboBoxSetor.addItem( (Setor)jComboBoxEmpresa.getSelectedItem());
            for(Setor s :list){
                
                jComboBoxSetor.addItem(s);   
             }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma empresa","erro",JOptionPane.OK_OPTION);
        }
        
        
    }//GEN-LAST:event_jComboBoxSetorPopupMenuWillBecomeVisible

    private void jComboBoxEmpresaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxEmpresaPopupMenuWillBecomeVisible
        // TODO add your handling code here:
         List<Setor> list = banco.ResgatarDados.getAllEmpresas();
        jComboBoxEmpresa.removeAllItems();
             for(Setor s :list){
                
                jComboBoxEmpresa.addItem(s);   
             }
         
        
         
    }//GEN-LAST:event_jComboBoxEmpresaPopupMenuWillBecomeVisible

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Deseja sair","Deseja sair",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Setor_Equipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setor_Equipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setor_Equipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setor_Equipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setor_Equipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<Setor> jComboBoxEmpresa;
    private javax.swing.JComboBox<Setor> jComboBoxSetor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonEquipamento;
    private javax.swing.JRadioButton jRadioButtonSetor;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}

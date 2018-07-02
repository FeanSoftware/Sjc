/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Sistema;

import Entidades.*;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.converter.LocalDateStringConverter;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio Cesar
 */
public class NotaInspesao extends JFrame {

    private Equipamento equipamento;
    private String UrlMidia;

    public NotaInspesao() {
        initComponents();
        centralizarComponente();
    }

    public NotaInspesao(Equipamento equipamento) {
        initComponents();
        this.equipamento = equipamento;
        centralizarComponente();
    }

    private static void copiandoArquivo(String saidaCaminho, String inicio, String i) {
        //funçao responsavel por copiar os arquivos da pasta original e tranfirila para a pasta padrao do jogo
        Path novo = Paths.get(saidaCaminho);
        Path cAbsoluto = Paths.get(inicio);
        try {
            Files.createDirectories(novo);
            if (Files.isDirectory(novo)) {
                Files.copy(cAbsoluto, Paths.get(novo + "\\" + i), StandardCopyOption.REPLACE_EXISTING);

            } else {
                JOptionPane.showMessageDialog(null, "Diretório Não Criado", "Criação do Novo Diretório", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Algo deu errado desculpa", "Criação do Novo Diretório", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void getImagem() {
        JFileChooser fc = new JFileChooser();
        BufferedImage imagem = null;
        //  String user;
        int id = 0;
        int valido = fc.showOpenDialog(jPanelPrincipal);
        if (valido == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            this.UrlMidia = "" + file + "";
            int largura = jLabelImagen.getWidth(), altura = jLabelImagen.getHeight();
            try {
                imagem = ImageIO.read(new File(this.UrlMidia));
                Icon icon = new ImageIcon(imagem.getScaledInstance(largura, altura,
                        java.awt.Image.SCALE_SMOOTH));
                this.jLabelImagen.setIcon(icon);
            } catch (IOException ex) {
                Logger.getLogger(NotaInspesao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private Nota getNewNota() {
        // DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Nota nota = new Nota();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        // System.out.println(formato.format(jDateChooserManutencao.getDate()));
        nota.setDateInspecao(jDateChooserManutencao.getDate());
        nota.setDateOcorencia(jDateChooserOcorrencia.getDate());
        nota.setEquipamento(equipamento);
        nota.setInformacoes(jTextPaneInformacoes.getText());
        nota.setNomeResponsavel(jTextFieldResponsavel.getText());
        nota.setNomeResponsavelManutençao(jTextFieldResponsavelManutençao.getText());
        nota.setUrlImagem(UrlMidia);

        //LocalDate d = LocalDate.parse(formato.format(nota.getDateInspecao()));
        if (nota.getDateOcorencia() != null && nota.getDateInspecao() != null) {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate data = LocalDate.parse(formato.format(nota.getDateOcorencia()), format);
            LocalDate data2 = LocalDate.parse(formato.format(nota.getDateInspecao()), format);

            if (ChronoUnit.DAYS.between(data, data2) > -1) {

                if (!jTextFieldResponsavel.getText().equals("") && !jTextFieldResponsavelManutençao.getText().equals("") && !jTextPaneInformacoes.getText().equals("")) {
                    if (UrlMidia != null) {
                        return nota;
                    } else {
                        if (JOptionPane.showConfirmDialog(null, "Voce nao upou uma midia\nDeseja continuar", "Erro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            return nota;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Verifique os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Verifique as datas", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            
        }else{
            JOptionPane.showMessageDialog(null, "Verifique as datas", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return nota;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new JPanel();
        jDateChooserOcorrencia = new com.toedter.calendar.JDateChooser();
        jDateChooserManutencao = new com.toedter.calendar.JDateChooser();
        jTextFieldResponsavel = new javax.swing.JTextField();
        jTextFieldResponsavelManutençao = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneInformacoes = new javax.swing.JTextPane();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelMidia = new JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jButtonUpMidia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jDateChooserOcorrencia.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserOcorrencia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data da ocorrência "));
        jDateChooserOcorrencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jDateChooserManutencao.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserManutencao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data da manutenção"));
        jDateChooserManutencao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldResponsavel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldResponsavel.setBorder(javax.swing.BorderFactory.createTitledBorder("Responsavel"));

        jTextFieldResponsavelManutençao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldResponsavelManutençao.setBorder(javax.swing.BorderFactory.createTitledBorder("Responsavel pela manutençao"));

        jTextPaneInformacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Descriçao do serviço", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jTextPaneInformacoes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(jTextPaneInformacoes);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jPanelMidia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelMidiaLayout = new javax.swing.GroupLayout(jPanelMidia);
        jPanelMidia.setLayout(jPanelMidiaLayout);
        jPanelMidiaLayout.setHorizontalGroup(
            jPanelMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMidiaLayout.setVerticalGroup(
            jPanelMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );

        jButtonUpMidia.setText("Upload midia");
        jButtonUpMidia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpMidiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldResponsavelManutençao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldResponsavel)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jDateChooserOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelMidia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUpMidia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDateChooserOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldResponsavelManutençao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUpMidia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMidia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonSair)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUpMidiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpMidiaActionPerformed
        getImagem();        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonUpMidiaActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:

        if (JOptionPane.showConfirmDialog(null, "Deseja sair do equipamento: " + equipamento.getNome(), "Deseja sair", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:

        getNewNota();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(NotaInspesao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotaInspesao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotaInspesao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotaInspesao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotaInspesao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUpMidia;
    private com.toedter.calendar.JDateChooser jDateChooserManutencao;
    private com.toedter.calendar.JDateChooser jDateChooserOcorrencia;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JPanel jPanelMidia;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldResponsavel;
    private javax.swing.JTextField jTextFieldResponsavelManutençao;
    private javax.swing.JTextPane jTextPaneInformacoes;
    // End of variables declaration//GEN-END:variables
}

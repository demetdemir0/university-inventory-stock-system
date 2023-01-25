
package com.mycompany.a.demirbas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ManagerFrame extends javax.swing.JFrame {

   
    public ManagerFrame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btn_eem = new javax.swing.JButton();
        btn_bioEng = new javax.swing.JButton();
        btn_compEng = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel4.setBackground(new java.awt.Color(247, 247, 247));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MANAGER FRAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(229, 0, 45));

        btn_eem.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_eem.setText("ELECTRIC ELECTRONIC ENGINEERING");
        btn_eem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eemActionPerformed(evt);
            }
        });

        btn_bioEng.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_bioEng.setText("BIOMEDICAL ENGINEERING");
        btn_bioEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bioEngActionPerformed(evt);
            }
        });

        btn_compEng.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_compEng.setText("COMPUTER ENGINEERING");
        btn_compEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_compEngActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 0, 57));
        jLabel1.setText("WELCOME");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\w10\\Documents\\NetBeansProjects\\A-DEMIRBAS\\src\\main\\java\\loginImages\\fsmvuLogo.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btn_bioEng))
                            .addComponent(btn_compEng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_eem)
                .addGap(18, 18, 18)
                .addComponent(btn_bioEng)
                .addGap(18, 18, 18)
                .addComponent(btn_compEng)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_compEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_compEngActionPerformed
        CompEngFrame c_frame = new CompEngFrame(); //kullanici manager oldugu icin hem uc farkli muhendislik departmaninin demirbaslarina istedigi an 
        //erisim saglamasi gerekir. bu yuzden her bir buton kullaniciyi degisiklik yapmak istedigi frame'e yonlendirir
        c_frame.setVisible(true);

    }//GEN-LAST:event_btn_compEngActionPerformed

    private void btn_eemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eemActionPerformed
        ElectricEngFrame e_frame = new ElectricEngFrame();
        e_frame.setVisible(true);
    }//GEN-LAST:event_btn_eemActionPerformed

    private void btn_bioEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bioEngActionPerformed
        BiomedicalEng b_frame = new BiomedicalEng();
        b_frame.setVisible(true);

    }//GEN-LAST:event_btn_bioEngActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bioEng;
    private javax.swing.JButton btn_compEng;
    private javax.swing.JButton btn_eem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}

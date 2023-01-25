package com.mycompany.a.demirbas;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControlFrame extends javax.swing.JFrame {

    private static final String p_passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"; //personel sifresi icin gerekli sartlari yazdim
    private static final String m_passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{10,}$";//manager sifresi icin de gerekli sartlari yazdim.
    private static final Pattern p_pattern = Pattern.compile(p_passwordPattern); 
    private static final Pattern m_pattern = Pattern.compile(m_passwordPattern);
    //Ortaya çıkan Pattern daha sonra rastgele karakter dizilerini, normal ifadeyle eşleştirebilen bir Matcher nesnesi oluşturmak için kullanıldigi icin Patternde tuttum.

//^                 # string baslangici
//(?=.*[0-9])       # en az bir tane rakam
//(?=.*[a-z])       # en az bir tane kucuk harf
//(?=.*[A-Z])       # en az bir tane buyuk harf
//(?=.*[@#$%^&+=])  #  en az bir tane ozel karakter
//(?=\S+$)          # bosluksuz
//.{8,}             # en az 8 karaktere sahip
//$                 # string sonu

    public ControlFrame() {
        initComponents();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbtn_personel = new javax.swing.JRadioButton();
        rbtn_manager = new javax.swing.JRadioButton();
        password_area = new javax.swing.JPasswordField();
        lbl_warning = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        checkBox_agreement = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(152, 180, 194));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("CHOOSE YOUR POSITION AND ENTER THE CORRECT PASSWORD:");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder("SECURITY"));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 510, 60));

        buttonGroup1.add(rbtn_personel);
        rbtn_personel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rbtn_personel.setSelected(true);
        rbtn_personel.setText("Personel");
        jPanel1.add(rbtn_personel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, -1));

        buttonGroup1.add(rbtn_manager);
        rbtn_manager.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rbtn_manager.setText("Manager");
        jPanel1.add(rbtn_manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 100, -1));

        password_area.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        password_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_areaActionPerformed(evt);
            }
        });
        jPanel1.add(password_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 340, -1));

        lbl_warning.setBackground(new java.awt.Color(153, 0, 0));
        lbl_warning.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbl_warning.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lbl_warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 420, 30));

        btn_ok.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        btn_ok.setText("OK");
        btn_ok.setEnabled(false);
        btn_ok.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btn_okİtemStateChanged(evt);
            }
        });
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 91, -1));

        btn_cancel.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 98, -1));

        checkBox_agreement.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        checkBox_agreement.setForeground(new java.awt.Color(51, 0, 51));
        checkBox_agreement.setText("Accept Personel/Manager Agreement.");
        checkBox_agreement.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBox_agreementİtemStateChanged(evt);
            }
        });
        checkBox_agreement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_agreementActionPerformed(evt);
            }
        });
        jPanel1.add(checkBox_agreement, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 240, 37));

        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 166, 80, 30));

        jTextArea1.setBackground(new java.awt.Color(217, 114, 114));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Confidentiality and Protection of Personal Data Policy (“Policy”), of Fatih Sultan Mehmet Foundation University (“University”), which has the title of data controller within the scope of Law No. 6698 on Protection of Personal Data (“Law”); the methods of obtaining personal data and the legal reasons for obtaining personal data, the categories of persons and personal data categories that are the subject of personal data processing, the purposes of processing personal data of the University, to whom and for what purposes they are transferred, technical and It specifies in detail the administrative measures, the retention periods of personal data, whether profiling and segmentation is carried out, the rights of the person concerned and how these rights will be exercised.");
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 560, 130));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed

        String password = password_area.getText();
        String p_password = "fsmvuPRSNL@";
        String m_password = "2021fsmvuMNGR@";

        if (rbtn_personel.isSelected() && p_pattern.matcher(password).matches() && password.equals(p_password)) { //.matcher metodu ile onceden tanimadigim p_patterni karsilastiriyorum
            JOptionPane.showMessageDialog(rootPane, "Password is correct for Personel"); //dogru olma ve kullanicinin Personel butonu secmesi durumunda yeni bir frame actiriyorum
            PersonelFrame frame = new PersonelFrame();
            frame.setVisible(true);
            this.dispose();
        }
        if (rbtn_personel.isSelected() && !p_pattern.matcher(password).matches()) { //.matcher metodu ile uyusmadigi durumlarda ise hata mesaji verdiriyorum
            lbl_warning.setText("!!! Password should be like: aZ@...( at least 8 character)");
        }
        if (rbtn_manager.isSelected() && m_pattern.matcher(password).matches() && password.equals(m_password)) { //ayni seyleri manager secmesi durumunda da uyguluyorum
            JOptionPane.showMessageDialog(rootPane, "Password is correct for Manager");
            ManagerFrame frame = new ManagerFrame();
            frame.setVisible(true);
            this.dispose();
        }
        if (rbtn_manager.isSelected() && !m_pattern.matcher(password).matches()) {
            lbl_warning.setText("!!! Password should be like: 0aZ@...(at least 10 character)");

        }

    }//GEN-LAST:event_btn_okActionPerformed

    private void password_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_areaActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "ARE YOU SURE?", "HEY!", JOptionPane.YES_NO_OPTION); //kullanici programdan cikmak istediginde 
        if (option == 0) { //int type donduren JOptionPane'i kullaniciya gosterip yes/no cevabina gore ilgili framelere yonlendiriyorum
            this.dispose();
            LoginFrame lgn = new LoginFrame();
            lgn.setVisible(true);
            this.dispose();
        } else if (option == 1) {
            return;
        }
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_okİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btn_okİtemStateChanged

    }//GEN-LAST:event_btn_okİtemStateChanged

    private void checkBox_agreementİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBox_agreementİtemStateChanged
        btn_ok.setEnabled(checkBox_agreement.isSelected()); //agreement kabul etmeyen kullanicilarin OK tusuna basmasini engelledim
    }//GEN-LAST:event_checkBox_agreementİtemStateChanged

    private void checkBox_agreementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_agreementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBox_agreementActionPerformed

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
            java.util.logging.Logger.getLogger(ControlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_ok;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBox_agreement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_warning;
    private javax.swing.JPasswordField password_area;
    private javax.swing.JRadioButton rbtn_manager;
    private javax.swing.JRadioButton rbtn_personel;
    // End of variables declaration//GEN-END:variables
}

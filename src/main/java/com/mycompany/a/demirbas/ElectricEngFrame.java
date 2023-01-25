package com.mycompany.a.demirbas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class ElectricEngFrame extends javax.swing.JFrame {

    DefaultTableModel tbl_table_model;

    public ElectricEngFrame() {
        initComponents();
        tbl_table_model = new DefaultTableModel();
        tbl_table_model.setColumnIdentifiers(new Object[]{"ID", "NAME", "MODEL", "PRICE", "STOCK"});
        tbl_electricEng.setModel(tbl_table_model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_electricEng = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txt_name = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_model = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_showAllStuffs = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        lbl_image = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        menuItem_photos = new javax.swing.JMenuItem();
        menuItem_save = new javax.swing.JMenuItem();
        menu_edit = new javax.swing.JMenu();
        menuItem_clear = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Department of Electric Electronic Engineering", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("STOCK SITUATION"));
        jScrollPane1.setToolTipText("");

        tbl_electricEng.setBorder(null);
        tbl_electricEng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_electricEng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_electricEngMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_electricEng);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 79, 617, 173));

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("NAME:");

        jLabel3.setText("MODEL:");

        jLabel4.setText("PRICE:");

        jLabel5.setText("AMOUNT:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id)
                            .addComponent(txt_model)
                            .addComponent(txt_price)
                            .addComponent(txt_amount))))
                .addGap(324, 324, 324))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 292, -1, -1));

        btn_add.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 534, 294, -1));

        btn_delete.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.setEnabled(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 143, 138, 49));

        btn_showAllStuffs.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_showAllStuffs.setText("Show All Stuffs");
        btn_showAllStuffs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showAllStuffsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_showAllStuffs, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 79, 138, 46));

        btn_update.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.setEnabled(false);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 534, 278, -1));
        jPanel1.add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 60, 525, 520));

        menu_file.setText("File");

        menuItem_photos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItem_photos.setIcon(new javax.swing.ImageIcon("C:\\Users\\w10\\Documents\\NetBeansProjects\\A-DEMIRBAS\\src\\main\\java\\loginImages\\galery.png")); // NOI18N
        menuItem_photos.setText("Photos");
        menuItem_photos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_photosActionPerformed(evt);
            }
        });
        menu_file.add(menuItem_photos);

        menuItem_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItem_save.setIcon(new javax.swing.ImageIcon("C:\\Users\\w10\\Documents\\NetBeansProjects\\A-DEMIRBAS\\src\\main\\java\\loginImages\\save.png")); // NOI18N
        menuItem_save.setText("Save");
        menuItem_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_saveActionPerformed(evt);
            }
        });
        menu_file.add(menuItem_save);

        jMenuBar1.add(menu_file);

        menu_edit.setText("Edit");

        menuItem_clear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItem_clear.setText("Clear");
        menuItem_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_clearActionPerformed(evt);
            }
        });
        menu_edit.add(menuItem_clear);

        jMenuBar1.add(menu_edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        Item item = new Item();
        item.id = Integer.parseInt(txt_id.getText());
        item.name = txt_name.getText();
        item.model = txt_model.getText();
        item.price = Integer.parseInt(txt_price.getText());
        item.amount = Integer.parseInt(txt_amount.getText());
        DemirbasDB.UpdateItem(item);
        Clear();

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_showAllStuffsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showAllStuffsActionPerformed

        DemirbasDB.ShowAllforElectricEng(tbl_table_model);
    }//GEN-LAST:event_btn_showAllStuffsActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        if (tbl_electricEng.getSelectedRow() >= 0) {
            int id = (int) tbl_electricEng.getValueAt(tbl_electricEng.getSelectedRow(), 0);
            DemirbasDB.DeleteByID(id);
            tbl_table_model.removeRow(tbl_electricEng.getSelectedRow());
            btn_delete.setEnabled(false);
        } else {
            return;
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        String id = "300" + txt_id.getText();
        int id2 = Integer.parseInt(id);
        String name = txt_name.getText();
        String model = txt_model.getText();
        int price = Integer.parseInt(txt_price.getText());
        int amount = Integer.parseInt(txt_amount.getText());

        DemirbasDB.AddItem(id2, name, model, price, amount);
        Clear();
    }//GEN-LAST:event_btn_addActionPerformed

    private void tbl_electricEngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_electricEngMouseClicked
        if (tbl_electricEng.getSelectedRow() >= 0) {
            int id = (int) tbl_electricEng.getValueAt(tbl_electricEng.getSelectedRow(), 0);
            //    Personel selectedPerson = CompanyDB_Manager.GetByID(id);

            Item item = DemirbasDB.GetByID(id);
            txt_id.setText(item.id + "");
            txt_name.setText(item.name);
            txt_model.setText(item.model);
            txt_amount.setText(item.amount + "");
            txt_price.setText(item.price + "");

            btn_update.setEnabled(true);
            btn_delete.setEnabled(true);

        }
    }//GEN-LAST:event_tbl_electricEngMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void menuItem_photosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_photosActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Open", "jpg", "png");
        fileChooser.setFileFilter(imageFilter);
        fileChooser.setMultiSelectionEnabled(false);

        int x = fileChooser.showDialog(this, "Show File");
        if (x == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            lbl_image.setIcon(new ImageIcon(file.getAbsolutePath()));
        }
    }//GEN-LAST:event_menuItem_photosActionPerformed

    private void menuItem_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_saveActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showSaveDialog(this);
        File file = fileChooser.getSelectedFile();
        try {

            FileWriter fw = new FileWriter(file);
            String sentence = txt_id.getText() + " " + txt_name.getText() + " "
            + txt_model.getText() + " " + txt_price.getText() + " " + txt_amount.getText();
            fw.write(sentence);
            fw.close();

        } catch (IOException ex) {
        }
    }//GEN-LAST:event_menuItem_saveActionPerformed

    private void menuItem_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_clearActionPerformed
        Clear();
    }//GEN-LAST:event_menuItem_clearActionPerformed
    public void Clear() {

        txt_id.setText("");
        txt_name.setText("");
        txt_model.setText("");
        txt_amount.setText("");
        txt_price.setText("");

    }

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
            java.util.logging.Logger.getLogger(ElectricEngFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElectricEngFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElectricEngFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElectricEngFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElectricEngFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_showAllStuffs;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JMenuItem menuItem_clear;
    private javax.swing.JMenuItem menuItem_photos;
    private javax.swing.JMenuItem menuItem_save;
    private javax.swing.JMenu menu_edit;
    private javax.swing.JMenu menu_file;
    private javax.swing.JTable tbl_electricEng;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_model;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    // End of variables declaration//GEN-END:variables
}

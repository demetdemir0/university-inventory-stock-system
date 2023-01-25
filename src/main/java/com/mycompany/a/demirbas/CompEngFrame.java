package com.mycompany.a.demirbas;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FileChooserUI;
import javax.swing.table.DefaultTableModel;

public class CompEngFrame extends javax.swing.JFrame {

    DefaultTableModel tbl_table_model;

    public CompEngFrame() {
        initComponents();
        tbl_table_model = new DefaultTableModel();
        tbl_table_model.setColumnIdentifiers(new Object[]{"ID", "NAME", "MODEL", "PRICE", "STOCK"});//bu modelin kolonlarina
        //tek tek isim verdim(veritabanindaki kolon basliklari ile ayni olacak sekilde)
        tbl_compEng.setModel(tbl_table_model); //bu table modeli de framede tanimladigim tbl_table_personel'e set ettim

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_compEng = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_compEng = new javax.swing.JTable();
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
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        menuItem_photos = new javax.swing.JMenuItem();
        menuItem_save = new javax.swing.JMenuItem();
        menu_edit = new javax.swing.JMenu();
        menuItem_clear = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_compEng.setBackground(new java.awt.Color(255, 255, 255));
        pnl_compEng.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Department of Computer Engineering", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        pnl_compEng.setMinimumSize(new java.awt.Dimension(800, 800));
        pnl_compEng.setPreferredSize(new java.awt.Dimension(800, 800));
        pnl_compEng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_compEngMouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("STOCK SITUATION"));
        jScrollPane1.setToolTipText("");

        tbl_compEng.setBorder(null);
        tbl_compEng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_compEng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_compEngMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_compEng);

        jPanel2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("NAME:");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("MODEL:");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("PRICE:");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
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
                        .addComponent(txt_name))
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

        btn_add.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.setEnabled(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_showAllStuffs.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_showAllStuffs.setText("Show All Stuffs");
        btn_showAllStuffs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showAllStuffsActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.setEnabled(false);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_compEngLayout = new javax.swing.GroupLayout(pnl_compEng);
        pnl_compEng.setLayout(pnl_compEngLayout);
        pnl_compEngLayout.setHorizontalGroup(
            pnl_compEngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_compEngLayout.createSequentialGroup()
                .addGroup(pnl_compEngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_compEngLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_compEngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_compEngLayout.createSequentialGroup()
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 312, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(pnl_compEngLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnl_compEngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_showAllStuffs, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );
        pnl_compEngLayout.setVerticalGroup(
            pnl_compEngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_compEngLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnl_compEngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_compEngLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_showAllStuffs, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_compEngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_compEng, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_compEng, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_compEngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_compEngMouseClicked
         btn_update.setEnabled(false); 
            btn_delete.setEnabled(false);
    }//GEN-LAST:event_pnl_compEngMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        Item item = new Item(); //Item objesi olusturup id,name.. bilgilerini jtextfieldlardan aldim
        item.id = Integer.parseInt(txt_id.getText());
        item.name = txt_name.getText();
        item.model = txt_model.getText();
        item.price = Integer.parseInt(txt_price.getText());
        item.amount = Integer.parseInt(txt_amount.getText());
        DemirbasDB.UpdateItem(item); //bu itemi UpdateItema parametre olarak gonderdim
     

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_showAllStuffsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showAllStuffsActionPerformed

        DemirbasDB.ShowAllforCompEng(tbl_table_model); //Manager istediginde computer engineering'deki tum malzemeleri gorebilmelidir, 
        //ShowAllforCompEng metoduyla tbl_table_modeli parametre olarak gonderip btn_ShowAll'a basinca bunlari gorebilecektir
    }//GEN-LAST:event_btn_showAllStuffsActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        if (tbl_compEng.getSelectedRow() >= 0) { //secilen satirin 0dan buyuesit olmasi halinde
            int id = (int) tbl_compEng.getValueAt(tbl_compEng.getSelectedRow(), 0); //bu satiri degikene atadim
            DemirbasDB.DeleteByID(id); //bu degiskeni de parametre olarak gonderdim
            tbl_table_model.removeRow(tbl_compEng.getSelectedRow()); //secilen itemi tablodan da sildim
            btn_delete.setEnabled(false);//delete butonunuun enable durumunu false yaptim
        } else {
            return;
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        String id = "192" + txt_id.getText(); //girilen id ne olursa olsun basina 192 ekledim cunku bilg muh deki tum urunler 192 ile baslar
        int id2 = Integer.parseInt(id);//geri kalan deegerleri de textfieldlardan aldim
        String name = txt_name.getText();
        String model = txt_model.getText();
        int price = Integer.parseInt(txt_price.getText());
        int amount = Integer.parseInt(txt_amount.getText());

        DemirbasDB.AddItem(id2, name, model, price, amount); //AddItem metodunu cagirdim
      
    }//GEN-LAST:event_btn_addActionPerformed

    private void tbl_compEngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_compEngMouseClicked
        if (tbl_compEng.getSelectedRow() >= 0) { //kullanicinn tablodan sectigi satir 0dan buyuk ve esit ise
            int id = (int) tbl_compEng.getValueAt(tbl_compEng.getSelectedRow(), 0); //bu degeri integer id icinde tuttum
           

            Item item = DemirbasDB.GetByID(id); //Item tipi obje olusturup, DemirbasDB sinifindaki GetById metoduna
            //parametre olarak tanimladigim id'yi atadim
            txt_id.setText(item.id + "");//txt_id textfield'ina item objesinin id'sini set ettim, digerleri de ayni sekilde
            txt_name.setText(item.name);
            txt_model.setText(item.model);
            txt_amount.setText(item.amount + "");
            txt_price.setText(item.price + "");

            btn_update.setEnabled(true); //update ve delete butonlari ulasilabilir oldu.
            btn_delete.setEnabled(true);

        }

    }//GEN-LAST:event_tbl_compEngMouseClicked

    private void menuItem_photosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_photosActionPerformed
        JFileChooser fileChooser = new JFileChooser(); //FileChooser nesnesi olusturdun
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("OPEN", "jpg", "png"); //Belirli bir uzantı kümesini kullanarak
        //filtre uygulayan bir FileFilter uygulaması olan FileNameExtensionFilter'dan nesne olusturdum
        fileChooser.setFileFilter(imageFilter); //bunu fileChoosera filtre olarak atadim
        fileChooser.setMultiSelectionEnabled(false);//Dosya seçiciyi birden çok dosya seçimine izin vermedim

        int x = fileChooser.showDialog(this, "Show File"); //Özel bir onay düğmesi ile özel bir dosya seçici iletişim kutusu açan
        //showDialog metodunu int degiskende tuttum
        if (x == JFileChooser.APPROVE_OPTION) { //donus degeri evet ise
            File file = fileChooser.getSelectedFile(); //secilen file acilir
            jLabel6.setIcon(new ImageIcon(file.getAbsolutePath())); //dosya acilir ve label'a set edilir
        }


    }//GEN-LAST:event_menuItem_photosActionPerformed

    private void menuItem_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_saveActionPerformed

        JFileChooser fileChooser = new JFileChooser(); //FileChooser nesnesi olusturdun
        fileChooser.showSaveDialog(this);//iletişim kutusunu açtim.
        File file = fileChooser.getSelectedFile(); //secilen dosyayi file icinde tuttum
        try {

            FileWriter fw = new FileWriter(file);//Karakter dosyaları yazmak için FileWriter nesnesi olusturdum.
            String sentence = txt_id.getText() + " " + txt_name.getText() + " "
                    + txt_model.getText() + " " + txt_price.getText() + " " + txt_amount.getText(); //yazmak istedigim cumleyi String degiskende tuttum
            fw.write(sentence);//bu nesneye cumleyi atadim
            fw.close();//dosyayi kapattim

        } catch (IOException ex) {
        }


    }//GEN-LAST:event_menuItem_saveActionPerformed

    private void menuItem_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_clearActionPerformed
        Clear(); //kullanici clear dediginde ekrani bosalttim
    }//GEN-LAST:event_menuItem_clearActionPerformed
    public void Clear() {
//Clear metodu olusturp tum textFieldlari temizledim
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
            java.util.logging.Logger.getLogger(CompEngFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompEngFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompEngFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompEngFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompEngFrame().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuItem_clear;
    private javax.swing.JMenuItem menuItem_photos;
    private javax.swing.JMenuItem menuItem_save;
    private javax.swing.JMenu menu_edit;
    private javax.swing.JMenu menu_file;
    private javax.swing.JPanel pnl_compEng;
    private javax.swing.JTable tbl_compEng;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_model;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    // End of variables declaration//GEN-END:variables
}

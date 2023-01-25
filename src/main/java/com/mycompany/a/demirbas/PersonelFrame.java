package com.mycompany.a.demirbas;

import javax.swing.table.DefaultTableModel;

public class PersonelFrame extends javax.swing.JFrame {

    DefaultTableModel tbl_table_model; //DefaultTableModel olusturdum

    public PersonelFrame() {
        initComponents();
        tbl_table_model = new DefaultTableModel();
        tbl_table_model.setColumnIdentifiers(new Object[]{"ID", "NAME", "MODEL", "PRICE", "STOCK"}); //bu modelin kolonlarina tek tek isim verdim(veritabanindaki kolon basliklari ile ayni olacak sekilde)
        tbl_table_personel.setModel(tbl_table_model); //bu table modeli de framede tanimladigim tbl_table_personel'e set ettim
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nameForPersonel = new javax.swing.JTextField();
        btn_personelSearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_table_personel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jSplitPane1.setBackground(new java.awt.Color(0, 0, 0));
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setBackground(new java.awt.Color(152, 180, 194));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PERSONEL FRAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N
        jPanel2.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Enter Name of property:");

        txt_nameForPersonel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        btn_personelSearch.setBackground(new java.awt.Color(255, 255, 255));
        btn_personelSearch.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_personelSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\w10\\Documents\\NetBeansProjects\\A-DEMIRBAS\\src\\main\\java\\loginImages\\search.png")); // NOI18N
        btn_personelSearch.setText("SEARCH");
        btn_personelSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personelSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nameForPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_personelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_personelSearch)
                    .addComponent(txt_nameForPersonel))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(152, 180, 194));
        jPanel3.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        btn_back.setBackground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon("C:\\Users\\w10\\Documents\\NetBeansProjects\\A-DEMIRBAS\\src\\main\\java\\loginImages\\indir.jpg")); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel3.add(btn_back);

        jScrollPane2.setBackground(new java.awt.Color(152, 180, 194));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROPERTIES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N
        jScrollPane2.setForeground(new java.awt.Color(204, 204, 204));

        tbl_table_personel.setBackground(new java.awt.Color(152, 180, 194));
        tbl_table_personel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tbl_table_personel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_table_personel);

        jPanel3.add(jScrollPane2);

        jSplitPane1.setRightComponent(jPanel3);

        jPanel1.add(jSplitPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_personelSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personelSearchActionPerformed
        String name = txt_nameForPersonel.getText(); //kullanicinin girmis oldugu property adini String bir degiskende tuttum
        DemirbasDB.SearchByName(name, tbl_table_model); // bu degiskeni ve olusturdugum tableModeli SearchByName'e metoduna parametre olarak gonderdim


    }//GEN-LAST:event_btn_personelSearchActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        ControlFrame frame = new ControlFrame(); //geri butonuna basinca bir onceki sayfaya yonlendirdim
        frame.setVisible(true); //bu sayfayi gorunur yaptim
        this.dispose(); //personel framini kapattim

    }//GEN-LAST:event_btn_backActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonelFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_personelSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tbl_table_personel;
    private javax.swing.JTextField txt_nameForPersonel;
    // End of variables declaration//GEN-END:variables
}

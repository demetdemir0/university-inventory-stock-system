/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.a.demirbas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author w10
 */
public class DemirbasDB {

    private static final String connectionString = "jdbc:derby://localhost:1527/DemirbasDB;user=sa;password=as"; //baglanti olusturacagim adresi String degiskende tuttum

    public static ResultSet SearchByName(String name, DefaultTableModel tbl_table_model) { //isimle arama yapip Resultset ile sonuc gonderebilecegim bir metot yazdim
        ResultSet rs = null; //basta resultseti ve conn'u null tanimladim
        Connection conn = null;
        tbl_table_model.setRowCount(0);//tbl_table_modelin de satirlarini 0 yaptim
        try {
            conn = DriverManager.getConnection(connectionString); //onceden tanimladigim connectionu conn icine attim
            java.sql.Statement stmt = conn.createStatement(); //bu connecitondan bir Statement olusturdum
            String query = "SELECT * FROM TBL_FIXTURE WHERE NAME like '%" + name + "%'"; //SELECT komutunu String queryde tuttum. NAME ile karsilastirmak icin 
            //Kullanicinin girecegi name ile sorgu olusturdum
            rs = stmt.executeQuery(query);  //bu sorgunun sonucunu rs icinde tuttum
            while (rs.next()) { //eger dogru ise tablemodelde olusturacagim row(satirlara),
                int id = rs.getInt("ID");
                String name2 = rs.getString("NAME");
                String model = rs.getString("MODEL");
                int price = rs.getInt("PRICE");
                int stock = rs.getInt("STOCK");
                tbl_table_model.addRow(new Object[]{id, name2, model, price, stock});//id,name,model,price,ve stock olarak bu verileri yazdirdim
            }
            conn.close(); //connectionu guvenlik acigi olmamasi adina kapattim

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());

        }
        return rs;

    }

    public static ResultSet ShowAllforCompEng(DefaultTableModel tbl_table_model) {
        ResultSet rs = null;
        Connection conn = null;
        tbl_table_model.setRowCount(0);
        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();//bu connecitondan bir Statement olusturdum
            String query = "SELECT * FROM TBL_FIXTURE WHERE CAST(ID AS CHAR(20)) LIKE '" + 192 + "%'"; //Computer Engineering bolumunde tum malzemeler 
            //192 ile baslar. bunu databaseden secmek icin SELECT sorgusunu kullandim ve String query'e atadim.
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("ID");//bu sorgunun sonucunu rs icinde tuttum
                String name = rs.getString("NAME");
                String model = rs.getString("MODEL");
                int price = rs.getInt("PRICE");
                int stock = rs.getInt("STOCK");
                tbl_table_model.addRow(new Object[]{id, name, model, price, stock});//eger dogru ise tablemodelde olusturacagim row(satirlara),
                //id,name,model,price,ve stock olarak bu verileri yazdirdim
            }
            conn.close();//connectionu guvenlik acigi olmamasi adina kapattim

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());

        }
        return rs;

    }

    public static ResultSet ShowAllforElectricEng(DefaultTableModel tbl_table_model) {
        ResultSet rs = null;
        Connection conn = null;
        tbl_table_model.setRowCount(0);
        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();//bu connecitondan bir Statement olusturdum
            String query = "SELECT * FROM TBL_FIXTURE WHERE CAST(ID AS CHAR(20)) LIKE '" + 300 + "%'"; //start with 300
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                String model = rs.getString("MODEL");
                int price = rs.getInt("PRICE");
                int stock = rs.getInt("STOCK");
                tbl_table_model.addRow(new Object[]{id, name, model, price, stock});
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());

        }
        return rs;

    }

    public static ResultSet ShowAllforBiomediclEng(DefaultTableModel tbl_table_model) {
        ResultSet rs = null;
        Connection conn = null;
        tbl_table_model.setRowCount(0);
        try {
            conn = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = conn.createStatement();//bu connecitondan bir Statement olusturdum
            String query = "SELECT * FROM TBL_FIXTURE WHERE CAST(ID AS CHAR(20)) LIKE '" + 200 + "%'"; //start with 200
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                String model = rs.getString("MODEL");
                int price = rs.getInt("PRICE");
                int stock = rs.getInt("STOCK");
                tbl_table_model.addRow(new Object[]{id, name, model, price, stock});
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());

        }
        return rs;

    }

    public static boolean DeleteByID(int id) { //boolean sonuc dondurup secilen urunu silecek bir metot yazdim
        boolean rvalue = false; 
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionString); //connectiona adresi atadim
            java.sql.Statement stmt = conn.createStatement(); //bu connecitondan bir Statement olusturdum
            String query = "DELETE FROM TBL_FIXTURE WHERE ID=" + id; //DELETE sorgusu ile TBL_FIXTURE icindeki kullanicinin gonderdigi id ile silme islemini queryde tuttum
            int rowEfected = stmt.executeUpdate(query); //SQL deyiminden etkilenen satır sayısını temsil eden bir tamsayıyi rowefected'ta tuttum
            if (rowEfected > 0) { //>0 oldugu durumda rvalue true dondurup, databaseden silme islemini yaptirdim
                rvalue = true;
            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());

        }
        return rvalue;

    }

    public static boolean AddItem(int id, String name, String model, int price, int stock) { //kullanicinin property eklemesi icin
        //AddItem adinda boolean sonuc donduren icinde id,name,model... parametre olarak alabilen metot olusturdum
        boolean rvalue = true;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionString); //connectiona adresi atadim
            java.sql.Statement stmt = conn.createStatement();//bu connecitondan bir Statement olusturdum
            String query = "SELECT COUNT(*) FROM TBL_FIXTURE";//SELECT COUNT(*) FROM +database ismi ile sorgu olusturdum
            ResultSet rs = stmt.executeQuery(query);//bu sorguyu Resultset icinde tuttum
            rs.next(); //
            query = "INSERT INTO TBL_FIXTURE VALUES(" + id + ",'" + name + "','" + model + "'," + price + ", " + stock + ")"; //INSERT komutuyla
            //valuelari tek tek databasedeki ilgili yerlere doldurdum
            stmt.executeUpdate(query); //executeUptate ile tamamladim
            conn.close();

        } catch (SQLException ex) {
            rvalue = false;
            System.out.println("error: " + ex.getMessage());

        }
        return rvalue;

    }

    public static Item GetByID(int id) { //secilen row'u ekranda ilgili yerlere yazdirmak icin Item sinifindan int degisken alan bir 
        //metot olusturdum
        ResultSet rs = null; //basta hepsini null tanimladim
        Connection conn = null;
        Item item = null;

        try {
            conn = DriverManager.getConnection(connectionString); //connectionu sagladim
            java.sql.Statement stmt = conn.createStatement();//bu connecitondan bir Statement olusturdum
            String query = "SELECT * FROM TBL_FIXTURE WHERE ID=" + id; //SELECT komutuyla databaseden id sectim
            rs = stmt.executeQuery(query); //bu sorgunun sonucunu rs icinde tuttum
            if (rs.next()) { //eger uyum saglaniyorsa ki saglanacaktir, item objesi olusturup id,name... gibi degiskenleri rs sonucuna set ettim
                item = new Item();
                item.id = rs.getInt("ID");
                item.name = rs.getString("NAME");
                item.model = rs.getString("MODEL");
                item.price = rs.getInt("PRICE");
                item.amount = rs.getInt("STOCK");

            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());

        }
        return item;

    }

    public static void UpdateItem(Item item) { //update islemini yapmak icin Parametre olarak Item alan bir degisken tuttum
        try {
            int id = item.id; //bu itemin bilgilerini gerekli degiskenlerde tuttum
            String name = item.name;
            String model = item.model;
            int price = item.price;
            int amount = item.amount;

            Connection conn = DriverManager.getConnection(connectionString); //connectionu sagladim
            java.sql.Statement stmt = conn.createStatement(); //bu connecitondan bir Statement olusturdum
            String query = "UPDATE TBL_FIXTURE SET NAME='" + name + "', MODEL='" + model + "',PRICE=" + price + ",STOCK=" + amount + "WHERE ID=" + id;
           //UPDATE komutu ile TBL_FIXTURE dan NAME,MODEL,PRICE... gibi degerlerime onceden tuttugum degiskenleri atadim
            stmt.executeUpdate(query);////SQL sorgusunu statementta update ettim
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}

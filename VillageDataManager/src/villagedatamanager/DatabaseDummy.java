/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villagedatamanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author AdminIGS
 */
public class DatabaseDummy {
        public Connection con = null;
        
        public DatabaseDummy() {
            createDatabase();
        }
        public void createDatabase(){
            File file = new File("VillageDataManager.db");
            if (file.exists()) //here's how to check
            {
            } 
            else 
            {

                try {
                    createConnecction();
                    java.sql.Statement stat = con.createStatement();
                    stat.executeUpdate("CREATE TABLE orang(nama varchar(150), ID int(10) PRIMARY KEY,norumah int(10), alamat varchar(250), notelp varchar(60));");
                    stat.executeUpdate("CREATE TABLE rumah(namapemilik varchar(150), norumah int(10) PRIMARY KEY, alamat varchar(250),notelp varchar(60) not NULL, jmlpenghuni  int(10));");
                    closeConnection();
                } catch (SQLException ex) {
                }
            }
        }
        public void createConnecction() {
            try {
            //Class.forName("com.mysql.jdbc.Driver");
            // con = DriverManager.getConnection("jdbc:mysql://localhost/vilage", "root", "root");
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:VillageDataManager.db");

            } catch (ClassNotFoundException | SQLException ex) {
            }
        }
        public void closeConnection() throws SQLException {
        con.close();
        con = null;
        }
        public List<Orang> getTableOrang() throws SQLException{
            //System.out.print(orang.get(0).getNama());
            createConnecction();
            java.sql.Statement stm = con.createStatement();
            String sql = "Select * From orang;";
            ResultSet res = stm.executeQuery(sql);
            List<Orang> personList = new ArrayList<>();
            while (res.next()) {
                Orang pers = new Orang(res.getString("nama"), res.getInt("ID"), res.getInt("norumah"), res.getString("alamat"), res.getString("notelp")
                );

                personList.add(pers);
            }
            closeConnection();
            return personList;
        }
        
        public List<Rumah> getTableRumah() throws SQLException{
            createConnecction();
            java.sql.Statement stm = con.createStatement();
            String sql = "Select * From rumah;";
            ResultSet res = stm.executeQuery(sql);
            List<Rumah> homeList = new ArrayList<>();
            while (res.next()) {
                Rumah home = new Rumah(res.getString("namapemilik"), res.getInt("norumah"), res.getString("alamat"), res.getString("notelp"), res.getInt("jmlpenghuni")
                );

                homeList.add(home);
            }
            closeConnection();
            return homeList;
        }
        
        public void tambahOrang(int id, int norumah, String notelp, String alamat, String nama) throws SQLException{
            createConnecction();
            String sql = "INSERT INTO orang VALUES('" + nama + "','" + id + "','" + norumah + "','"
                    + "" + alamat + "','" + notelp + "');";

            Statement st = (Statement) con.createStatement();
            st.executeUpdate(sql);
            closeConnection();
        }
        
        public void tambahRumah(int norumah, String notelp, String alamat, String namapemilik, int jmlhuni) throws SQLException{
            createConnecction();
            String sql = "INSERT INTO rumah VALUES('" + namapemilik + "','" + norumah + "','" + alamat + "','"
                    + "" + notelp + "','" + jmlhuni + "');";

            Statement st = (Statement) con.createStatement();
            st.executeUpdate(sql);
            closeConnection();
        }
        public Orang cariOrangId(int searchnum) throws SQLException
        {
            Orang prsn = null;
            createConnecction();
            String sql = "select * from orang where ID='" + searchnum + "'";
            Connection connection = con;
            java.sql.Statement stm = (java.sql.Statement) connection.createStatement();
            ResultSet res = stm.executeQuery(sql);
            if (res.next()) {
                prsn = new Orang(res.getString("nama"), res.getInt("ID"), res.getInt("norumah"), res.getString("alamat"), res.getString("notelp")
                );
                
            }
            closeConnection();
            return prsn;
        }
        public List<Orang> cariOrangMobile(String searchmob) throws SQLException
        {
            createConnecction();
            String sql = "select * from orang where notelp='" + searchmob + "'";
            List<Orang> listorang= new ArrayList<>(); 
            Connection connection = con;
            java.sql.Statement stm = (java.sql.Statement) connection.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                Orang prsn = new Orang(res.getString("nama"), res.getInt("ID"), res.getInt("norumah"), res.getString("alamat"), res.getString("notelp")
                );
                listorang.add(prsn);
            }
            closeConnection();
            return listorang;
        }
        public List<Orang> cariOrangNoRumah(int searchnum) throws SQLException
        {
            createConnecction();
            String sql = "select * from orang where norumah='" + searchnum + "'";
            List<Orang> listorang= new ArrayList<>(); 
            Connection connection = con;
            java.sql.Statement stm = (java.sql.Statement) connection.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                Orang prsn = new Orang(res.getString("nama"), res.getInt("ID"), res.getInt("norumah"), res.getString("alamat"), res.getString("notelp")
                );
                listorang.add(prsn);
            }
            closeConnection();
            return listorang;
        }
        public List<Orang> cariOrangNama(String searchname) throws SQLException
        {
            createConnecction();
            String sql = "select * from orang where nama='" + searchname + "'";
            List<Orang> listorang= new ArrayList<>(); 
            Connection connection = con;
            java.sql.Statement stm = (java.sql.Statement) connection.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                Orang prsn = new Orang(res.getString("nama"), res.getInt("ID"), res.getInt("norumah"), res.getString("alamat"), res.getString("notelp")
                );
                listorang.add(prsn);
            }
            closeConnection();
            System.out.println(listorang.size());
            return listorang;
             
        }
        public Rumah cariRumahNomor(int searcharg) throws SQLException
        {
            Rumah home = null;
            createConnecction();
            String sql = "select * from rumah where norumah='" + searcharg + "'";
            System.out.print(sql);
            Connection connection = con;
            java.sql.Statement stm = (java.sql.Statement) connection.createStatement();
            ResultSet res = stm.executeQuery(sql);
            if (res.next()) {
                home = new Rumah(res.getString("namapemilik"), res.getInt("norumah"), res.getString("alamat"), res.getString("notelp"), res.getInt("jmlpenghuni")
                );
                
            }
            closeConnection();
            return home;
        }
        public List<Rumah> cariRumahPemilik(String searcharg) throws SQLException
        {
            createConnecction();
            String sql = "select * from rumah where namapemilik='" + searcharg + "'";
            Connection connection = con;
            java.sql.Statement stm = (java.sql.Statement) connection.createStatement();
            ResultSet res = stm.executeQuery(sql);
            List<Rumah> homeList = new ArrayList<>();
            while (res.next()) {
                Rumah home = new Rumah(res.getString("namapemilik"), res.getInt("norumah"), res.getString("alamat"), res.getString("notelp"), res.getInt("jmlpenghuni")
                );
                
                homeList.add(home);
                
            }
            closeConnection();
            return homeList;
        }
        public void editOrang(int id, String name, String telp, int homenum, String alamat, int oldid)
        {
            Statement st = null;
            createConnecction();
            String sql = "UPDATE orang SET nama= '" + name + "',"
                + " ID='" + id + "', norumah='" + homenum + "', "
                + "alamat='" + alamat + "', notelp='" + telp + "' WHERE ID='" + oldid + "';";
            System.out.print(sql + "\n");
            System.out.print(oldid);
            try{
            st = (Statement) con.createStatement();
            }catch(Exception ex){
                System.out.print("statement failure\n");
            }
            try{
            st.executeUpdate(sql);
            }catch(Exception ex){
                System.out.print("query failure\n");
            }
            try{
            closeConnection();
            }catch(Exception ex){
                
            }
        }
        public void deleteOrang(int id) throws SQLException
        {
            createConnecction();
            String sql = "DELETE FROM orang WHERE ID='" + id + "';";
            Statement st = (Statement) con.createStatement();
            st.executeUpdate(sql);
            closeConnection();
        }
        public void deleteRumah(int id) throws SQLException
        {
            createConnecction();
            String sql = "DELETE FROM rumah WHERE norumah='" + id + "';";
            Statement st = (Statement) con.createStatement();
            st.executeUpdate(sql);
            closeConnection();
        }
        public void editRumah(String name, int homenum, String alamat, String telp, int resid, int oldnum) throws SQLException
        {
            createConnecction();
            String sql = "UPDATE rumah SET namapemilik= '" + name + "',"
                + " norumah='" + homenum + "', alamat='" + alamat + "', "
                + "notelp='" + telp + "', jmlpenghuni='" + resid +"'   WHERE norumah='" + oldnum + "';";

            Statement st = (Statement) con.createStatement();
            st.executeUpdate(sql);
            closeConnection();
        }
}

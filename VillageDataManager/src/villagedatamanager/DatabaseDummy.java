/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villagedatamanager;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author AdminIGS
 */
public class DatabaseDummy {
        List<Orang> orang = new ArrayList<Orang>();
        List<Rumah> rumah = new ArrayList<Rumah>();
        
        public DatabaseDummy() {
            orang.add(new Orang("Ramdan", 42, 70, "Lab IGS", "12"));
            rumah.add(new Rumah("Ramdan", 70, "Lab IGS", "12", 2));
        }
        
        public List<Orang> getTableOrang() {
            //System.out.print(orang.get(0).getNama());
            return orang;
        }
        
        public List<Rumah> getTableRumah() {
            return rumah;
        }
        
        public void tambahOrang(int id, int norumah, String notelp, String alamat, String nama) {
            orang.add(new Orang(nama, id, norumah, alamat, notelp));
        }
        
        public void tambahRumah(int norumah, String notelp, String alamat, String namapemilik, int jmlhuni) {
            rumah.add(new Rumah(namapemilik, norumah, alamat, notelp, jmlhuni));
        }
        public Orang cariOrangId(int searchnum)
        {
            for (Orang orang1 : orang) {
                if(orang1.getID() == searchnum){
                    return orang1;
                }
            }
            return null;
        }
        public Orang cariOrangMobile(String searchmob)
        {
            for (Orang orang1 : orang) {
                if(orang1.getNoTelp().equals(searchmob)){
                    return orang1;
                }
            }
            return null;
        }
        public Orang cariOrangNoRumah(int searchnum)
        {
            for (Orang orang1 : orang) {
                if(orang1.getNoRumah() == searchnum){
                    return orang1;
                }
            }
            return null;
        }
        public Orang cariOrangNama(String searchname)
        {
            for (Orang orang1 : orang) {
                if(orang1.getNama().equals(searchname)){
                    return orang1;
                }
            }
            return null;
        }
        public Rumah cariRumahNomor(int searcharg)
        {
            for (Rumah rumah1 : rumah) {
                if(rumah1.getNoRumah() == searcharg){
                    return rumah1;
                }
            }
            return null;
        }
        public Rumah cariRumahPemilik(String searcharg)
        {
            System.out.print("searching");
            for (Rumah rumah1 : rumah) {
                if(rumah1.getNama().equals(searcharg)){
                    System.out.print(rumah1.getNama());
                    return rumah1;
                }
            }
            return null;
        }
        public void editOrang(int id, String name, String telp, int homenum, String alamat)
        {
            for (Orang orang1 : orang) {
                if(orang1.getID() == id){
                    System.out.print("editing");
                    orang1.setAlamat(alamat);
                    orang1.setNama(name);
                    orang1.setNoRumah(homenum);
                    orang1.setNoTelp(telp);
                }
            }
        }
        public void deleteOrang(int id)
        {
            System.out.print("deleting");
        }
        public void deleteRumah(int id)
        {
            System.out.print("deleting");
        }
        public void editRumah(String name, int homenum, String alamat, String telp, int resid)
        {
            for (Rumah rumah1 : rumah) {
                if(rumah1.getNoRumah() == homenum)
                {
                    rumah1.setAlamat(alamat);
                    rumah1.setJmlPenghuni(resid);
                    rumah1.setNama(name);
                    rumah1.setNoTelp(telp);
                }
            }
        }
}

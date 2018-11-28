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
            orang.add(new Orang("Ramdan", 42, 70, "Lab IGS", 12));
            rumah.add(new Rumah("Ramdan", 70, "Lab IGS", 12, 2));
        }
        
        public List<Orang> getTableOrang() {
            //System.out.print(orang.get(0).getNama());
            return orang;
        }
        
        public List<Rumah> getTableRumah() {
            return rumah;
        }
        
        public void tambahOrang(int id, int norumah, int notelp, String alamat, String nama) {
            orang.add(new Orang(nama, id, norumah, alamat, notelp));
        }
        
        public void tambahRumah(int norumah, int notelp, String alamat, String namapemilik, int jmlhuni) {
            rumah.add(new Rumah(namapemilik, norumah, alamat, notelp, jmlhuni));
        }
}

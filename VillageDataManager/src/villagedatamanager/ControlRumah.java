/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villagedatamanager;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP 14 - BS001TX
 */

public class ControlRumah {
    PopUpSuksesTambah popupsuksestambah;
    FormTambahRumahReal faddhome;
    private static DatabaseDummy databasedummy;
    ViewAllTableRumah viewalltable;
    
    public ControlRumah() {
        databasedummy = new DatabaseDummy();
        
        
    }
    
    public void tambahRumah(int norumah, int notelp, String alamat, String namapemilik, int jmlhuni)
    {
        popupsuksestambah = new PopUpSuksesTambah();
        JOptionPane.showMessageDialog(popupsuksestambah, "Berhasil ditambahkan");
        System.out.print(namapemilik + " " + norumah);
        databasedummy.tambahRumah(norumah, notelp, alamat, namapemilik, jmlhuni);
    }
    public void tampilkanSemuaRumah()
    {
        viewalltable = new ViewAllTableRumah(this);
        viewalltable.setVisible(true);
    }
    public void cariRumahNomor()
    {
    }
    public void cariRumahPemilik()
    {
    }
    public void editRumah()
    {
    }
    public void deleteRumah()
    {
    }
    public void createForm()
    {
        faddhome = new FormTambahRumahReal(this);
        System.out.println("Open Form");
        faddhome.setVisible(true);
    
    }
    public void createMessage()
    {
    }
    public void tampilkanHasilPencarian()
    {
    }
    
    public List<Rumah> loadData() {
        return databasedummy.getTableRumah();
    }
}

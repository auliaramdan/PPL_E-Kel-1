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
    PopUpMessage popupmessage;
    FormTambahRumahReal faddhome;
    private static DatabaseDummy databasedummy;
    ViewAllTableRumah viewalltable;
    MenuSearchRumah menusearch;
    ViewSearchHouseByOwner vsowner;
    FormEditRumah feditrmh;
    PopUpYesNo popupdel;
    
    public ControlRumah() {
        databasedummy = new DatabaseDummy();
        
        
    }
    
    public void tambahRumah(int norumah, String notelp, String alamat, String namapemilik, int jmlhuni)
    {
        popupmessage = new PopUpMessage();
        JOptionPane.showMessageDialog(popupmessage, "Berhasil ditambahkan");
        System.out.print(namapemilik + " " + norumah);
        databasedummy.tambahRumah(norumah, notelp, alamat, namapemilik, jmlhuni);
    }
    public void tampilkanSemuaRumah()
    {
        viewalltable = new ViewAllTableRumah(this);
        viewalltable.setVisible(true);
    }
    public Rumah cariRumahNomor(int searcharg)
    {
        return databasedummy.cariRumahNomor(searcharg);
    }
    public Rumah cariRumahPemilik(String searcharg)
    {
        System.out.print("in control");
        return databasedummy.cariRumahPemilik(searcharg);
    }
    public void createFormCariRumahNomor()
    {
        this.feditrmh = new FormEditRumah(this);
        this.feditrmh.setVisible(true);
    }
    public void createFormCariRumahPemilik()
    {
        this.vsowner = new ViewSearchHouseByOwner(this);
        this.vsowner.setVisible(true);
        
    }
    public void editRumah(String name, int homenum, String alamat, String telp, int penghuni)
    {
        databasedummy.editRumah(name, homenum, alamat, telp, penghuni);
    }
    public void deleteRumah(int id)
    {
        popupdel = new PopUpYesNo(this, id);
        popupdel.setVisible(true);
    }
    public void deletedataRumah(int id)
    {
        databasedummy.deleteRumah(id);
        this.feditrmh.clear();
    }
    public void showMenuSearchRumah()
    {
        this.menusearch = new MenuSearchRumah(this);
        this.menusearch.setVisible(true);
    }
    public void createForm()
    {
        faddhome = new FormTambahRumahReal(this);
        System.out.println("Open Form");
        faddhome.setVisible(true);
    
    }
    public void createMessage(String msg)
    {
        this.popupmessage = new PopUpMessage();
        JOptionPane.showMessageDialog(popupmessage, msg);
    }
    
    public List<Rumah> loadData() {
        return databasedummy.getTableRumah();
    }
}

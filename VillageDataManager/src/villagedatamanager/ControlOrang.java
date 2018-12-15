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
public class ControlOrang {
    
    FormTambahOrang faddperson;
    PopUpMessage popupmessage;
    private static DatabaseDummy databasedummy;
    ViewAllTable viewalltable;
    MenuSearchOrang msearchorg;
    ViewSearchPersonMobile vsmobile;
    ViewSearchPersonName vsname;
    ViewSearchPersonHouseNum vshnum;
    FormEditOrang feditorang;
    PopUpYesNo popupdel;
    
    
    public ControlOrang() {
        System.out.print("Constructed");
        databasedummy = new DatabaseDummy();
        viewalltable = new ViewAllTable(this);
    }
    
    public void tambahOrang(int id, int norumah, String notelp, String alamat, String nama)
    {
        popupmessage = new PopUpMessage();
        
        System.out.print(id + " " + norumah);
        databasedummy.tambahOrang(id, norumah, notelp, alamat, nama);
        JOptionPane.showMessageDialog(popupmessage, "Berhasil ditambahkan");
    }
    public void tampilkanSemuaOrang()
    {        
        viewalltable.setVisible(true);
    }
    public Orang cariOrangID(int searcharg)
    {
        return databasedummy.cariOrangId(searcharg);
    }
    public Orang cariOrangNama(String searcharg)
    {
        return databasedummy.cariOrangNama(searcharg);
    }
    public Orang cariOrangNoTelp(String searcharg)
    {
        return databasedummy.cariOrangMobile(searcharg);
    }
    public Orang cariOrangRumah(int searcharg)
    {
        return databasedummy.cariOrangNoRumah(searcharg);
    }
    public void createFormSearchID()
    {
        this.feditorang = new FormEditOrang(this);
        this.feditorang.setVisible(true);
    }
    public void createFormSearchMobile()
    {
        this.vsmobile = new ViewSearchPersonMobile(this);
        this.vsmobile.setVisible(true);
    }
    public void createFormSearchName() //Pakai B Indonesia
    {
        this.vsname = new ViewSearchPersonName(this);
        this.vsname.setVisible(true);
    }
    public void createFormSearchHome()
    {
        this.vshnum = new ViewSearchPersonHouseNum(this);
        this.vshnum.setVisible(true);
    }
    public void editOrang(int id, String name, String telp, int homenum, String alamat)
    {
        databasedummy.editOrang(id, name, telp, homenum, alamat);
    }
    public void deleteOrang(int id)
    {
        popupdel = new PopUpYesNo(this, id);
        popupdel.setVisible(true);
    }
    public void deleteDataOrang(int id)
    {
        databasedummy.deleteOrang(id);
        this.feditorang.clear();
    }
    public void tambahOrang()
    {
        //new form tambah orang
        System.out.println("Open Form");
        faddperson = new FormTambahOrang(this);
        faddperson.setVisible(true);
    }
    public void createMessage(String msg)
    {
        this.popupmessage = new PopUpMessage();
        JOptionPane.showMessageDialog(popupmessage, msg);
    }
    public List<Orang> loadData() {
        return databasedummy.getTableOrang();
    }
    public void showSearchMenu()
    {
        this.msearchorg = new MenuSearchOrang(this);
        this.msearchorg.setVisible(true);
    }
    
}

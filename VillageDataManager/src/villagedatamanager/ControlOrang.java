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
    PopUpSuksesTambah popupsuksestambah;
    private static DatabaseDummy databasedummy;
    ViewAllTable viewalltable;
    MenuSearchOrang msearchorg;
    ViewSearchPersonMobile vsmobile;
    ViewSearchPersonName vsname;
    ViewSearchPersonHouseNum vshnum;
    
    public ControlOrang() {
        System.out.print("Constructed");
        databasedummy = new DatabaseDummy();
        viewalltable = new ViewAllTable(this);
    }
    
    public void tambahOrang(int id, int norumah, String notelp, String alamat, String nama)
    {
        popupsuksestambah = new PopUpSuksesTambah();
        JOptionPane.showMessageDialog(popupsuksestambah, "Berhasil ditambahkan");
        System.out.print(id + " " + norumah);
        databasedummy.tambahOrang(id, norumah, notelp, alamat, nama);
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
    public void cariOrangRumah()
    {
    }
    public void createFormSearchID()
    {
    }
    public void createFormSearchMobile()
    {
        this.vsmobile = new ViewSearchPersonMobile(this);
        this.vsmobile.setVisible(true);
    }
    public void createFormSearchName()
    {
        this.vsname = new ViewSearchPersonName(this);
        this.vsname.setVisible(true);
    }
    public void createFormSearchHome()
    {
       // this.vshnum = new ViewSearchPersonHouseNum(this);
        this.vshnum.setVisible(true);
    }
    public void editOrang()
    {
    }
    public void deleteOrang()
    {
    }
    public void createForm()
    {
        //new form tambah orang
        System.out.println("Open Form");
        faddperson = new FormTambahOrang(this);
        faddperson.setVisible(true);
    }
    public void createMessage()
    {
        this.popupsuksestambah = new PopUpSuksesTambah();
    }
    public void tampilkanHasilPencarian()
    {
    }
    public void destroyMessage(PopUpSuksesTambah a)
    {
        a.dispose();
        this.faddperson.empty();
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

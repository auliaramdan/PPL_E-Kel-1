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
    DatabaseDummy databasedummy;
    ViewAllTable viewalltable;
    
    public ControlOrang() {
        System.out.print("Constructed");
        databasedummy = new DatabaseDummy();
        viewalltable = new ViewAllTable(this);
    }
    
    public void tambahOrang(int id, int norumah, int notelp, String alamat, String nama)
    {
        popupsuksestambah = new PopUpSuksesTambah();
        JOptionPane.showMessageDialog(popupsuksestambah, "Berhasil ditambahkan");
        System.out.print(id + " " + norumah);
    }
    public void tampilkanSemuaOrang()
    {        
        viewalltable.setVisible(true);
    }
    public void cariOrangID()
    {
    }
    public void cariOrangNama()
    {
    }
    public void cariOrangNoTelp()
    {
    }
    public void cariOrangRumah()
    {
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
        return databasedummy.getTable();
    }
    
}

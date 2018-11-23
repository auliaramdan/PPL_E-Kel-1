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
    List orang = new ArrayList();
    
    public void tambahOrang(int id, int norumah, int notelp, String alamat, String nama)
    {
        popupsuksestambah = new PopUpSuksesTambah();
        JOptionPane.showMessageDialog(popupsuksestambah, "Berhasil ditambahkan");
        System.out.print(id + " " + norumah);
    }
    public void tampilkanSemuaOrang()
    {
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
    public void createForm(int type)
    {
        //1 form tambah orang
        
        if(type == 1)
        {
            //new form tambah orang
            System.out.println("Open Form");
            faddperson = new FormTambahOrang(this);
            faddperson.setVisible(true);
        }
        
        
        
        
        
        
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
}

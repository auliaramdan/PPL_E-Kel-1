/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villagedatamanager;

/**
 *
 * @author HP 14 - BS001TX
 */
public class ControlOrang {
    
    FormTambahOrang faddperson;
    PopUpSuksesTambah popupsuksestambah;
    
    public void tambahOrang(int id, int norumah, int notelp, String alamat, String nama)
    {
        this.createMessage();
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
            faddperson = new FormTambahOrang();
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villagedatamanager;
import javax.swing.JOptionPane;
/**
 *
 * @author HP 14 - BS001TX
 */

public class ControlRumah {
    PopUpSuksesTambah popupsuksestambah;
    FormTambahRumahReal faddhome;
    public void tambahRumah(int norumah, int notelp, String alamat, String namapemilik, int jmlhuni)
    {
        popupsuksestambah = new PopUpSuksesTambah();
        JOptionPane.showMessageDialog(popupsuksestambah, "Berhasil ditambahkan");
        System.out.print(namapemilik + " " + norumah);
    }
    public void tampilkanSemuaRumah()
    {
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
    public void createForm(int type)
    {
        if(type == 4) {
            System.out.println("Open Form");
            faddhome = new FormTambahRumahReal(this);
            faddhome.setVisible(true);
    }
    }
    public void createMessage()
    {
    }
    public void tampilkanHasilPencarian()
    {
    }
}

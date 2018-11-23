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
public class Orang {
    
    public Orang(String namaPass, int idPass, int norumahPass, String alamatPass, int  notelpPass) {
        this.nama = namaPass;
        this.ID = idPass;
        this.norumah = norumahPass;
        this.alamat = alamatPass;
        this.notelp = notelpPass;
    }
    private String nama;
    private int ID;
    private int norumah;
    private String alamat;
    private int notelp;
}

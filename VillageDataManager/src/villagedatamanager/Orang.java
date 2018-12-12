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
    
    public Orang(String namaPass, int idPass, int norumahPass, String alamatPass, String  notelpPass) {
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
    private String notelp;
    
    public String getNama() {
     return nama;   
    }
    
    public int getID() {
     return ID;   
    }
    
    public int getNoRumah() {
     return norumah;   
    }
    
    public String getAlamat() {
     return alamat;   
    }
    
    public String getNoTelp() {
     return notelp;   
    }
    public void setNama(String arg) {
        this.nama = arg;
    }
    
    public void setID(int arg) {
        this.ID = arg;
    }
    
    public void setNoRumah(int arg) {
        this.norumah = arg;
    }
    
    public void setAlamat(String arg) {
        this.alamat = arg;
    }
    
    public void setNoTelp(String arg) {
        this.notelp = arg;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villagedatamanager;

/**
 *
 * @author AdminIGS
 */
public class Rumah {
    
    public Rumah(String namaPass, int norumahPass, String alamatPass, String  notelpPass, int jmlpenghuniPass) {
        this.namapemilik = namaPass;
        this.norumah = norumahPass;
        this.alamat = alamatPass;
        this.notelp = notelpPass;
        this.jmlpenghuni = jmlpenghuniPass;
    }
    private String namapemilik;
    private int norumah;
    private String alamat;
    private String notelp;
    private int jmlpenghuni;
    
    public String getNama() {
     return namapemilik;   
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
    
    public int getJmlPenghuni() {
     return jmlpenghuni;   
    }
    public void setNama(String arg) {
        this.namapemilik = arg;
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
    
    public void setJmlPenghuni(int arg) {
        this.jmlpenghuni = arg;
    }
}

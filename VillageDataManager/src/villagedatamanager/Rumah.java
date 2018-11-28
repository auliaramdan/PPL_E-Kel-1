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
    
    public Rumah(String namaPass, int norumahPass, String alamatPass, int  notelpPass, int jmlpenghuniPass) {
        this.namapemilik = namaPass;
        this.norumah = norumahPass;
        this.alamat = alamatPass;
        this.notelp = notelpPass;
        this.jmlpenghuni = jmlpenghuniPass;
    }
    private String namapemilik;
    private int norumah;
    private String alamat;
    private int notelp;
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
    
    public int getNoTelp() {
     return notelp;   
    }
    
    public int getJmlPenghuni() {
     return jmlpenghuni;   
    }
}

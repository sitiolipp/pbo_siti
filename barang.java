/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class barang {
    private String kode, nama, merk;
    private int jumlah, harga;
    
    public String getkode() {
        return kode;
    }
    
    public void setkode (String kode) {
        this.kode = kode;
    }
    public String getnama () {
        return nama;
    }
    public void setnama (String nama) {
        this.nama = nama;
    }
    public String getmerk() {
        return merk;
    }
    public void setmerk (String merk) {
        this.merk = merk;
    }
    public int getjumlah () {
        return jumlah;
    }
    public void setjumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public int getharga () {
        return harga;
    }
    public void setharga (int harga) {
        this.harga = harga;
    }
}

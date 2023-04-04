/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;
import dao.DaoBarang;
import java.util.List;
import javax.swing.JOptionPane;
import model.*;
import VIEW.FormBarang;

/**
 *
 * @author Noval
 */
public class controlerbarang {
    FormBarang frame;
    List<Barang> listBrg;
    DaoBarang daoBrg = new DaoBarang();
    Barang brg = new Barang();
    
    public controlerbarang(FormBarang frame) {
        this.frame = frame;
        listBrg = daoBrg.getData();
    }
    public void tampil_tabel() {
        TabelModelBarang tabelBrg = new TabelModelBarang(listBrg);
        frame.getTblBarang().setModel(tabelBrg);
    }
    
    public void tambahData() {
        JOptionPane.showMessageDialog(null, "Kode Barang Belum Diisi");
        if (frame.gettxtkode().getText().equals("")) {
        }else {
            brg.setKode(frame.gettxtkode().getText());
            brg.setNama(frame.gettxtnama().getText());
            brg.setJumlah(Integer.parseInt(frame.gettxtjumlah().getText()));
            brg.setHarga(Integer.parseInt(frame.gettxtharga().getText()));
            brg.setMerek(frame.gettxtmerk().getText());
            daoBrg.tambah(brg);
            JOptionPane.showMessageDialog(frame, "Berhasil Menambahkan Data Baru");
            
        }
    }
    
    public void ubahData(){
      if (frame.gettxtkode().getText().equals("")){
          JOptionPane.showMessageDialog(null, "Kode Barang Belum Diisi");
      }else{
          brg.setKode(frame.gettxtkode().getText());
            brg.setNama(frame.gettxtnama().getText());
            brg.setJumlah(Integer.parseInt(frame.gettxtjumlah().getText()));
            brg.setHarga(Integer.parseInt(frame.gettxtharga().getText()));
            brg.setMerek(frame.gettxtmerk().getText());
            daoBrg.tambah(brg);
            JOptionPane.showMessageDialog(frame, "Berhasil Mengubah Data");
      }
    }
    public void hapusData(){
        brg.setKode(frame.gettxtkode().getText());
        daoBrg.hapus(brg);
        JOptionPane.showMessageDialog(frame, "Berhasil Menghapus Data");
        
    }
    
    public void bersih (){
        frame.settxtkode("");
        frame.settxtnama("");
        frame.settxtjumlah(0);
        frame.settxtharga(0);
        frame.settxtmerk("");
        
        
    }
    public void keluar(){
        frame.dispose();
    }
}
   



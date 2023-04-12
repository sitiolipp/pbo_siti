/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.daoPegawai;
import java.util.List;
import model.Pegawai;
import model.TabelModelPegawai;
import view.formpegawai;

/**
 *
 * @author Noval
 */
public class controllerPegawai {
    formpegawai frame;
    List<Pegawai> listBrg;
    daoPegawai daoPegawai = new daoPegawai();
    Pegawai pegawai= new Pegawai();
    
    public controllerPegawai(formpegawai frame) {
        this.frame = frame;
    }
    
    public void tampil_label() {
        TabelModelPegawai tabelPegwai = new TabelModelPegawai(daoPegawai.getData());
//            frame.getTblPegawai().setModel(tabelPegawai);
    }
}

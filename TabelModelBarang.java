/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author USER
 */
public class TabelModelBarang  extends AbstractTableModel{
    
    List<barang> listbrg;
    
    public TabelModelBarang(List<barang> listbrg ) {
        this.listbrg = listbrg;
    }

    @Override
    public int getRowCount() {
        return listbrg.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
    return switch (column) {
        case 0 -> listbrg.get(row).getkode();
        case 1 -> listbrg.get(row).getnama();
        case 2 -> listbrg.get(row).getjumlah();
        case 3 -> listbrg.get(row).getharga();
        case 4 -> listbrg.get(row).getmerk();
        default -> null;
    };
    }
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "KODE BARANG";
            case 1 -> "NAMA BARANG";
            case 2 -> "JUMLAH";
            case 3 -> "HARGA";
            case 4 -> "MERK";
            default -> null;
        };
    }

    
}


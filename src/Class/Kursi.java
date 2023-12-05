/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Kursi {
    private String jadwal;
    private ArrayList<String> terjual;

    public Kursi(String jadwal){
        this.jadwal = jadwal;
        this.terjual = new ArrayList<>();
    }
    
    public void pilihKursi(String id){
        String pilih [] = id.split(" ");
        for (String kata : pilih) {
            terjual.add(kata);
        }
    }

    public String getJadwal() {
        return jadwal;
    }

    public ArrayList<String> getTerjual() {
        return terjual;
    }
    
}

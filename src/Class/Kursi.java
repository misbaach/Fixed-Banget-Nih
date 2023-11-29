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
    private ArrayList<String> sedia;
    private ArrayList<String> terjual;

    public Kursi(String jadwal){
        this.jadwal = jadwal;
        this.sedia = new ArrayList<>();
        this.terjual = new ArrayList<>();
        isiSedia();
    }
    
    public void isiSedia(){
       for(int i = 65; i <= 68; i++){
           for(int j = 1; j <= 8; j++){
               char huruf = (char) i;
               sedia.add(huruf + "" + j);
           }
       } 
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
    
    public void beli(){
        sedia.removeAll(terjual);
    }

    public ArrayList<String> getTerjual() {
        return terjual;
    }
    
}

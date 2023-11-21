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
    public ArrayList<String> sedia;
    public ArrayList<String> terjual;
    public int harga;

    public Kursi(int harga){
        this.harga = harga;
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
    
    public void beli(){
        sedia.removeAll(terjual);
    }

    public int getHarga() {
        return harga;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ASUS
 */
public class Kursi {
    public Studio studio;
    public int id;
    public int harga;

    public Kursi(int id, int harga, Studio studio){
        this.id = id;
        this.harga = harga;
        this.studio = studio;
    }

    public int getId() {
        return id;
    }

    public Studio getStudio() {
        return studio;
    }

    public int getHarga() {
        return harga;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author DAVA RAJIF C
 */
public class Transaksi {
    public Film film;
    public int totalHarga;
    public Kursi kursi;
    
    public Transaksi(Film film, int totalHarga, Kursi kursi){
        this.film = film;
        this.totalHarga = totalHarga;
        this.kursi = kursi;
    }

    public Film getFilm() {
        return film;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public Kursi getKursi() {
        return kursi;
    }
}

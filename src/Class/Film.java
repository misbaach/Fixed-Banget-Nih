/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author DAVA RAJIF C
 */
public class Film {
    String nama;
    String sinopsis;
    String gambar;
    String jadwal;
    public Studio[] studio;

    public Film(String nama, String sinopsis, String gambar, String jadwal){
        this.nama = nama;
        this.sinopsis = sinopsis;
        this.gambar = gambar;
        this.jadwal = jadwal;
    }
    public String getNama() {
        return nama;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getGambar() {
        return gambar;
    }

    public String getJadwal() {
        return jadwal;
    }
    
    
}

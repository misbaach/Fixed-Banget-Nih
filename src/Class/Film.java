  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author DAVA RAJIF C
 */
public class Film {
    private String nama;
    private String genre;
    private String durasi;
    private String sinopsis;
    private String gambar;
    private Trailer trailer;
    private Studio studio[];
    private int jumlahStudio;

    public Film(String nama, String genre, String durasi, String sinopsis, String gambar){
        this.nama = nama;
        this.genre = genre;
        this.durasi = durasi;
        this.sinopsis = sinopsis;
        this.gambar = gambar;
        this.studio = new Studio[3]; 
        this.jumlahStudio = 0;
    }
    
    public void setFilm(String genre, String durasi, String sinopsis, String gambar){
        this.genre = genre;
        this.durasi = durasi;
        this.sinopsis = sinopsis;
        this.gambar = gambar;
    }
    
    public void setStudio(String nama, String lokasi){
        if(jumlahStudio < 3){
            studio[jumlahStudio] = new Studio(nama, lokasi);
            jumlahStudio++;
        }
    }

    public void setTrailer(String link, String tumbnail) {
        trailer = new Trailer(link, tumbnail);
    }
    
    public void setJadwal(String namaStudio, String Jadwal){
        for(int i = 0; i < 3; i++){
            if(studio[i].getNama().equalsIgnoreCase(namaStudio)){
                studio[i].tambahJadwal(Jadwal);
            }
        }
    }
    
    public String getNama() {
        return nama;
    }

    public int getJumlahStudio() {
        return jumlahStudio;
    }
    
    public String getSinopsis() {
        return sinopsis;
    }

    public String getGambar() {
        return gambar;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public String getGenre() {
        return genre;
    }

    public String getDurasi() {
        return durasi;
    }

    public Studio getStudio(String namaStudio) {
        for(int i = 0; i < jumlahStudio; i++){
            if(studio[i].getNama().equals(namaStudio)){
                return studio[i];
            }
        }
        return null;
    }
    
    
    public ArrayList<String> getJadwalFilm(String namaFilm, String namaStudio) {
        // Loop melalui setiap studio
        for (int i = 0; i < jumlahStudio; i++) {
            // Loop melalui setiap jadwal dalam studio
            if(studio[i].getNama().equals(namaStudio)){
                return studio[i].getJadwal();
            }
        }
        return null;
    }
}

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
public class DaftarFilm {
    public ArrayList<Film> film;
    public int jumlahFilm;
    
    public DaftarFilm(){
        film = new ArrayList<>();
        jumlahFilm = 0;
    }
    
    public void tambahFilm(String nama, String genre, String durasi, String sinopsis, String gambar){
        if(jumlahFilm < 3){
            Film filmBaru = new Film(nama, genre, durasi, sinopsis, gambar);
            film.add(filmBaru);
            jumlahFilm++;
        }
    }
    
    public Film pilih(String nama){
        for(Film cek : film){
            if(cek.getNama().equals(nama) || cek.getGambar().equals(nama)){
                return cek;
            }
        }
        return null;
    }
    
    public void hapusFilm(String nama){
        Film cek = pilih(nama);
        if(cek != null){
            film.remove(cek);
            jumlahFilm--;
        }
    }
    
    public void editFilm(String nama, String genre, String durasi, String sinopsis, String gambar){
        Film cek = pilih(nama);
        if(cek != null){
            int index = film.indexOf(cek);
            Film filmBaru = new Film(nama, genre, durasi, sinopsis, gambar);
            film.set(index, filmBaru);
        }
    }

    public ArrayList<Film> getFilm() {
        return film;
    }

    public int getJumlahFilm() {
        return jumlahFilm;
    }
}

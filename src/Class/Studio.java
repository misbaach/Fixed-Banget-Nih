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
public class Studio {

    private int harga;
    private String nama;
    private String tempat;
    private ArrayList<String> jadwal;
    private int jumlahJadwal;
    private ArrayList<Kursi> kursi;

    public Studio(String nama, String tempat) {
        this.nama = nama;
        this.tempat = tempat;
        this.jadwal = new ArrayList<>();
        this.kursi = new ArrayList<>();
        this.jumlahJadwal = 0;
    }

     public void tambahJadwal(String jadwal) {
        if (this.jadwal.size() < 12) {
            this.jadwal.add(jadwal);
            kursi.add(new Kursi(jadwal));
            jumlahJadwal++;
        }
    }

    public void hapusJadwal(String jadwal) {
        int index = this.jadwal.indexOf(jadwal);
        if (index != -1) {
            this.jadwal.remove(index);
            kursi.remove(index);
            jumlahJadwal--;
        }
    }
    
     public boolean cekJadwal(String jadwal) {
        return this.jadwal.contains(jadwal);
    }

    public void beliKursi(String jadwalFilm, String id) {
        getKursi(jadwalFilm).pilihKursi(id);
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public Kursi getKursi(String jadwal) {
        for (int i = 0; i < jumlahJadwal; i++) {
            if (kursi.get(i).getJadwal().equals(jadwal)) {
                return kursi.get(i);
            }
        }
        return null;
    }

    public String getNama() {
        return nama;
    }

    public String getTempat() {
        return tempat;
    }

    public ArrayList<String> getJadwal() {
        return jadwal;
    }

    public int getJumlahJadwal() {
        return jumlahJadwal;
    }

    public int getHarga() {
        return harga;
    }
}

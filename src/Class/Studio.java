/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ASUS
 */
public class Studio {

    public int harga;
    public String nama;
    public String tempat;
    public String jadwal[];
    public int jumlahJadwal;
    public Kursi kursi[];

    public Studio(String nama, String tempat) {
        this.nama = nama;
        this.tempat = tempat;
        this.jadwal = new String[12];
        this.kursi = new Kursi[12];
        this.jumlahJadwal = 0;
    }

    public void tambahJadwal(String jadwal) {
        if (jumlahJadwal < 12) {
            this.jadwal[jumlahJadwal] = jadwal;
            kursi[jumlahJadwal] = new Kursi(jadwal);
            jumlahJadwal++;
        }
    }

    public void beliKursi(String jadwalFilm, String id) {
        getKursi(jadwalFilm).pilihKursi(id);
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Kursi getKursi(String jadwal) {
        for (int i = 0; i < jumlahJadwal; i++) {
            if (kursi[i].getJadwal().equals(jadwal)) {
                return kursi[i];
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

    public String[] getJadwal() {
        return jadwal;
    }

    public int getJumlahJadwal() {
        return jumlahJadwal;
    }

    public int getHarga() {
        return harga;
    }
}

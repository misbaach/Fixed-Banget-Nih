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
    public String nama;
    public String tempat;
    public String jadwal[];
    public int jumlahJadwal;
    public Kursi kursi;
    
    public Studio(String nama, String tempat){
        this.nama = nama;
        this.tempat = tempat;
        this.jadwal = new String[24];
        this.jumlahJadwal = 0;
    }
    
    public void hargaKursi(int harga){
        kursi = new Kursi(harga);
    }
    
    
    public void tambahJadwal(String jadwal){
        if(jumlahJadwal < 24){
            this.jadwal[jumlahJadwal] = jadwal;
            jumlahJadwal++;
        }
    }

    public String getNama() {
        return nama;
    }

    public String getTempat() {
        return tempat;
    }
}

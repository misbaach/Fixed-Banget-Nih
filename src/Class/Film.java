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
    public String nama;
    public String genre;
    public String durasi;
    public String sinopsis;
    public String gambar;
    public Studio studio[];
    public int jumlahStudio;

    public Film(String nama, String genre, String durasi, String sinopsis, String gambar){
        this.nama = nama;
        this.genre = genre;
        this.durasi = durasi;
        this.sinopsis = sinopsis;
        this.gambar = gambar;
        this.studio = new Studio[3]; 
        this.jumlahStudio = 0;
    }
    
    public void setStudio(String nama, String lokasi){
        if(jumlahStudio < 3){
            studio[jumlahStudio] = new Studio(nama, lokasi);
            jumlahStudio++;
        }
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

    public String getSinopsis() {
        return sinopsis;
    }

    public String getGambar() {
        return gambar;
    }
    
    public String getJadwalFilm(String namaFilm) {
        // Loop melalui setiap studio
        for (int i = 0; i < jumlahStudio; i++) {
            // Loop melalui setiap jadwal dalam studio
            for (int j = 0; j < studio[i].jumlahJadwal; j++) {
                // Jika jadwal tidak kosong dan mengandung nama film
                if (studio[i].jadwal[j] != null && studio[i].jadwal[j].contains(namaFilm)) {
                    return studio[i].jadwal[j];
                }
            }
        }
        return "Jadwal tidak ditemukan";
    }
}

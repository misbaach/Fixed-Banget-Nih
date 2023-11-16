/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author DAVA RAJIF C
 */
public class Nota {
    public Transaksi transaksi;
    public User user;
    
    public Nota(Transaksi transaksi, User user){
        this.transaksi = transaksi;
        this.user = user;
    }

    public Transaksi getTransaksi() {
        return transaksi;
    }

    public User getUser() {
        return user;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ASUS
 */
public class User extends Login{
    public int saldo;
    
    public User(String username, String password){
        super(username, password);
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
    public void tambahSaldo(int setor){
        saldo += setor;
    }
    public void kurangSaldo(int tarik){
        saldo -= tarik;
    }
}

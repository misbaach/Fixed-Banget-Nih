/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Sulthan Daffa
 */
public class Admin extends Login{
    public String kode;
    
    public Admin(String username, String password){
        super(username, password);
        kode = "ajsjdha,cmxchgdsjdhb";
    }

    public String getKode() {
        return kode;
    }
}

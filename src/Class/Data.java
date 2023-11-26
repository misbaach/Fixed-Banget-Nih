/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ASUS
 */
public final class Data {
    public Login user[];
    public Login admin[];
    public int jumlahUser;
    public int jumlahAdmin;
    
    public Data(){
        user = new User[10];
        admin = new Admin[2];
        jumlahUser = 0;
        jumlahAdmin = 0;
        tambahAdmin("admin", "admin");
        tambahUser("user","user");
    }

    public Login[] getUser() {
        return user;
    }

    public Login[] getAdmin() {
        return admin;
    }

    public int getJumlahUser() {
        return jumlahUser;
    }

    public int getJumlahAdmin() {
        return jumlahAdmin;
    }
    
    public void tambahAdmin(String username, String password){
        if(jumlahAdmin < 2){
            admin[jumlahAdmin] = new Admin(username, password);
            jumlahAdmin++;
        }
    }
    
    public void tambahUser(String username, String password){
        if(jumlahUser < 10){
            user[jumlahUser] = new User(username, password);
            if (user[jumlahUser] instanceof User userInstance) {
                userInstance.setSaldo(0);
            }
            jumlahUser++;
            
        }
    }
    
    public boolean checkAdmin(String username) {

        for (int i = 0; i < jumlahAdmin; i++) {
            if (username.equals(admin[i].username)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean checkUser(String username) {
        for (int j = 0; j < jumlahUser; j++) {
            if (username.equals(user[j].username)) {
                return true;
            }
        }
        return false;
    }
}

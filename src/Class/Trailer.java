/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ASUS
 */
public class Trailer {
    public String link;
    public String tumbnail;
    
    public Trailer(String link, String tumbnail){
        this.link = link;
        this.tumbnail = tumbnail;
    }

    public String getLink() {
        return link;
    }

    public String getTumbnail() {
        return tumbnail;
    }
    
}

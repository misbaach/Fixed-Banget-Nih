/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project;

import Class.DaftarFilm;
import Class.Film;
import java.net.URL;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class LandingPageView extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    protected DaftarFilm daftarFilm;
    protected String namaFilm;

    public LandingPageView() {
        initComponents();
        daftarFilm = new DaftarFilm();
        filmAwal();
        tampilGambar();
    }

    public LandingPageView(DaftarFilm daftarFilm) {
        initComponents();
        this.daftarFilm = daftarFilm;
        tampilGambar();
    }
    
    private void setFilmAwal(){
        daftarFilm.tambahFilm("Diambang Kematian", "Horror", "97 menit", 
                "Hidup seorang perempuan muda bernama Nadia berada di ambang kematian. "
                        + "Hal ini bisa terjadi karena Nadia ternyata menjadi tumbal "
                        + "dari pesugihan yang dilakukan oleh ayahnya sendiri. "
                        + "Pesugihan tersebut ternyata meminta tumbal setiap 10 tahun sekali. ",
                "Diambang Kematian (3).jpg");
        daftarFilm.tambahFilm("Titanic", "Romance", "i97 menit",
                "Pada tahun 1996, seorang pemburu harta karun bernama Brock Lovett "
                        + "beserta timnya menjelajahi bangkai kapal RMS Titanic untuk "
                        + "mencari sebuah kalung berlian berharga yang diyakini terkubur "
                        + "di dasar laut bersama bangkai kapal tersebut.", "Titanic (2).jpg");
        daftarFilm.tambahFilm("Susuk", "Horror", "102 menit", 
                "Laras ingin berhenti dari pekerjaannya sebagai PSK dan memperbaiki "
                        + "hubungan dengan adiknya, Ayu. Namun, sebuah kecelakaan membuat "
                        + "Laras ditolak oleh kematian dan terus terjebak dalam sakaratul "
                        + "maut. Tubuh Laras terus hidup, tapi badannya mulai membusuk "
                        + "seperti mayat. ", "Susuk (1).jpg"); 
    }

    private void filmAwal() {
        setFilmAwal();
        aturStudio(0);
        aturStudio(1);
        aturStudio(2);
        setHargaTiket();
        setJadwalTayang(0, "CGV", "XXI", "iMAX");
        setJadwalTayang(1, "XXI", "iMAX", "CGV");
        setJadwalTayang(2, "iMAX", "CGV", "XXI");
        setTrailerFilm();
    }

    private void aturStudio(int index) {
        daftarFilm.getFilm().get(index).setStudio("CGV", "Surabaya");
        daftarFilm.getFilm().get(index).setStudio("XXI", "Surabaya");
        daftarFilm.getFilm().get(index).setStudio("iMAX", "Surabaya");
    }
    
    private void setTrailerFilm(){
        daftarFilm.getFilm().get(0).setTrailer("https://www.youtube.com/watch?v=CNWdWAK0rOQ",
                "diambangkematiantrailer.png");
        daftarFilm.getFilm().get(1).setTrailer("https://www.youtube.com/watch?v=lP6-9XeEbPc", 
                "titanicTrailer.png");
        daftarFilm.getFilm().get(2).setTrailer("https://www.youtube.com/watch?v=6sJRZepIGsk", 
                "susukTrailer.png");
    }
    
    private void setHargaTiket(){
        daftarFilm.getFilm().get(0).getStudio("CGV").setHarga(20000);
        daftarFilm.getFilm().get(0).getStudio("XXI").setHarga(30000);
        daftarFilm.getFilm().get(0).getStudio("iMAX").setHarga(25000);
        daftarFilm.getFilm().get(1).getStudio("CGV").setHarga(25000);
        daftarFilm.getFilm().get(1).getStudio("XXI").setHarga(35000);
        daftarFilm.getFilm().get(1).getStudio("iMAX").setHarga(20000);
        daftarFilm.getFilm().get(2).getStudio("CGV").setHarga(25000);
        daftarFilm.getFilm().get(2).getStudio("XXI").setHarga(30000);
        daftarFilm.getFilm().get(2).getStudio("iMAX").setHarga(30000);
    }
    
    private void setJadwalTayang(int index, String studio1, String studio2, String studio3){
        LocalDate today = LocalDate.now();
        daftarFilm.getFilm().get(index).setJadwal(studio1, today + " 12.00");
        daftarFilm.getFilm().get(index).setJadwal(studio1, today.plusDays(1) + " 13.30");
        daftarFilm.getFilm().get(index).setJadwal(studio1, today.plusDays(2) + " 13.30");
        daftarFilm.getFilm().get(index).setJadwal(studio2, today + " 10.30");
        daftarFilm.getFilm().get(index).setJadwal(studio2, today.plusDays(1) + " 10.30");
        daftarFilm.getFilm().get(index).setJadwal(studio3, today.plusDays(1) + " 12.00");
        daftarFilm.getFilm().get(index).setJadwal(studio3, today.plusDays(2) + " 10.30");
    }

    private void tampilGambar() {
        int ke = 1;
        for (Film gambar : daftarFilm.getFilm()) {
            String nama = gambar.getGambar();
            URL imageURL = getClass().getResource("/Images/" + nama);
            if (imageURL != null) {
                ImageIcon icon = new ImageIcon(imageURL);
                pilihLabel(ke, icon, nama);
            }else{
                pilihLabel(ke, null, nama);
            }
            ke++;
        }
    }

    private void pindah(java.awt.event.MouseEvent evt) {
        JLabel label = (JLabel) evt.getSource();
        String nama = label.getText();
        String username = usernameTxt.getText();
        if (evt.getClickCount() == 2) {
            ViewPage pindahPage;
            pindahPage = new ViewPage(daftarFilm, nama, username);
            pindahPage.setVisible(true);
            this.dispose();
        } else {
            this.namaFilm = nama;
        }
    }

    private void pilihLabel(int ke, ImageIcon icon, String nama) {
        switch (ke) {
            case 1 -> {
                gambar1.setIcon(icon);
                gambar1.setText(nama);
            }
            case 2 -> {
                gambar2.setIcon(icon);
                gambar2.setText(nama);
            }
            case 3 -> {
                gambar3.setIcon(icon);
                gambar3.setText(nama);
            }
            default -> {
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        gambar1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        gambar2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        gambar3 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        usernameTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(54, 48, 98));
        jLabel1.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        jLabel1.setText("TIX-ID");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setText("NOW SHOWING");

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(228, 305));

        gambar1.setForeground(new java.awt.Color(51, 51, 51));
        gambar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gambar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(gambar1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gambar1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(228, 305));

        gambar2.setForeground(new java.awt.Color(51, 51, 51));
        gambar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gambar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(gambar2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(gambar2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setPreferredSize(new java.awt.Dimension(228, 305));

        gambar3.setForeground(new java.awt.Color(51, 51, 51));
        gambar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gambar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gambar3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(gambar3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(gambar3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)))
        );

        logout.setText("logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        usernameTxt.setText("username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(18, 18, 18)
                .addComponent(usernameTxt)
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logout)
                            .addComponent(usernameTxt))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gambar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gambar1MouseClicked
        // TODO add your handling code here:
        pindah(evt);
    }//GEN-LAST:event_gambar1MouseClicked

    private void gambar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gambar2MouseClicked
        // TODO add your handling code here:
        pindah(evt);
    }//GEN-LAST:event_gambar2MouseClicked

    private void gambar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gambar3MouseClicked
        pindah(evt);
    }//GEN-LAST:event_gambar3MouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        if (daftarFilm == null) {
            daftarFilm.tambahFilm(" ", "", "", "", "");
        }
        LoginPage loginPage = new LoginPage(daftarFilm);
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LandingPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandingPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandingPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandingPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPageView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gambar1;
    private javax.swing.JLabel gambar2;
    private javax.swing.JLabel gambar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton logout;
    protected javax.swing.JLabel usernameTxt;
    // End of variables declaration//GEN-END:variables
}

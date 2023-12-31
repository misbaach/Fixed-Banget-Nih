/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project;

import Class.Film;
import Class.SetButton;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JToggleButton;

/**
 *
 * @author ASUS
 */
public class FormJadwal extends javax.swing.JFrame implements SetButton{

    /**
     * Creates new form FormJadwal
     */
    private Film film;
    private LocalDate today = LocalDate.now();

    public FormJadwal(Film film) {
        initComponents();
        this.film = film;
        tampilInfo();
        pilihButton();
        setLocationRelativeTo(null);
    }

    private JToggleButton[] daftarBtn(String sektor) {
        JToggleButton[] buttons;

        if (sektor.equals(today.toString())) {
            buttons = new JToggleButton[]{pilih1, pilih2, pilih3, pilih4};
        } else if (sektor.equals(today.plusDays(1).toString())) {
            buttons = new JToggleButton[]{pilih5, pilih6, pilih7, pilih8};
        } else if (sektor.equals(today.plusDays(2).toString())) {
            buttons = new JToggleButton[]{pilih9, pilih10, pilih11, pilih12};
        } else {
            buttons = new JToggleButton[0];
        }
        return buttons;
    }

    public void disableButton() {
        for (int i = 0; i < 3; i++) {
            JToggleButton[] buttons = daftarBtn(today.plusDays(i).toString());
            for (JToggleButton button : buttons) {
                button.setSelected(false);
            }
        }
    }

    public void pilihButton() {
        ArrayList<String> jadwalFilmArray = film.getJadwalFilm(film.getNama(), (String) pilihBioskop.getSelectedItem());
        for (String jadwalFilm : jadwalFilmArray) {
            if (jadwalFilm != null) {
                String[] jadwal = jadwalFilm.split(" ");
                for (int i = 0; i < 3; i++) {
                    JToggleButton[] buttons = daftarBtn(today.plusDays(i).toString());
                    for (JToggleButton button : buttons) {
                        if (jadwal[0].equals(today.plusDays(i).toString()) && jadwal[1].contains(button.getText())) {
                            button.setSelected(true);
                        }
                    }
                }
            }
        }
    }

    private void tampilInfo() {
        inputHarga.setText(Integer.toString(film.getStudio((String) pilihBioskop.getSelectedItem()).getHarga()));
        inputLokasi.setText(film.getStudio((String) pilihBioskop.getSelectedItem()).getTempat());
        hariIniTxt.setText(today.toString());
        besokTxt.setText(today.plusDays(1).toString());
        lusaTxt.setText(today.plusDays(2).toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pilihBioskop = new javax.swing.JComboBox<>();
        hariIniTxt = new javax.swing.JLabel();
        pilih1 = new javax.swing.JToggleButton();
        pilih2 = new javax.swing.JToggleButton();
        pilih3 = new javax.swing.JToggleButton();
        pilih4 = new javax.swing.JToggleButton();
        besokTxt = new javax.swing.JLabel();
        pilih5 = new javax.swing.JToggleButton();
        pilih6 = new javax.swing.JToggleButton();
        pilih7 = new javax.swing.JToggleButton();
        pilih8 = new javax.swing.JToggleButton();
        lusaTxt = new javax.swing.JLabel();
        pilih9 = new javax.swing.JToggleButton();
        pilih10 = new javax.swing.JToggleButton();
        pilih11 = new javax.swing.JToggleButton();
        pilih12 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        inputLokasi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputHarga = new javax.swing.JTextField();
        simpanBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Jadwal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pilihBioskop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pilihBioskop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CGV", "XXI", "iMAX" }));
        pilihBioskop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pilihBioskopItemStateChanged(evt);
            }
        });

        hariIniTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hariIniTxt.setText("Hari ini");

        pilih1.setText("10.30");

        pilih2.setText("12.00");

        pilih3.setText("13.30");

        pilih4.setText("15.00");

        besokTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        besokTxt.setText("Besok");

        pilih5.setText("10.30");

        pilih6.setText("12.00");

        pilih7.setText("13.30");

        pilih8.setText("15.00");

        lusaTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lusaTxt.setText("Lusa");

        pilih9.setText("10.30");

        pilih10.setText("12.00");

        pilih11.setText("13.30");

        pilih12.setText("15.00");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Lokasi");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Harga");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pilihBioskop, 0, 376, Short.MAX_VALUE)
                    .addComponent(inputLokasi)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hariIniTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(pilih1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pilih2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pilih3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(pilih4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(besokTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(pilih5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pilih6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pilih7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(pilih8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lusaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(pilih9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pilih10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pilih11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(pilih12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(inputHarga))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pilihBioskop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(hariIniTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilih1)
                    .addComponent(pilih2)
                    .addComponent(pilih3)
                    .addComponent(pilih4))
                .addGap(18, 18, 18)
                .addComponent(besokTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilih5)
                    .addComponent(pilih6)
                    .addComponent(pilih7)
                    .addComponent(pilih8))
                .addGap(18, 18, 18)
                .addComponent(lusaTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilih9)
                    .addComponent(pilih10)
                    .addComponent(pilih11)
                    .addComponent(pilih12))
                .addGap(17, 17, 17))
        );

        simpanBtn.setBackground(new java.awt.Color(233, 184, 36));
        simpanBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        simpanBtn.setText("Simpan");
        simpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(simpanBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simpanBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihBioskopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pilihBioskopItemStateChanged
        // TODO add your handling code here:
        disableButton();
        tampilInfo();
        pilihButton();
    }//GEN-LAST:event_pilihBioskopItemStateChanged

    
    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
        // TODO add your handling code here:
        film.getStudio((String) pilihBioskop.getSelectedItem()).setHarga(Integer.parseInt(inputHarga.getText()));
        film.getStudio((String) pilihBioskop.getSelectedItem()).setTempat(inputLokasi.getText());
        for (int i = 0; i < 3; i++) {
            JToggleButton[] buttons = daftarBtn(today.plusDays(i).toString());
            for (JToggleButton button : buttons) {
                String jadwal = today.plusDays(i).toString() + " " + button.getText();
                if (button.isSelected()) {
                    if (!film.getStudio((String) pilihBioskop.getSelectedItem()).cekJadwal(jadwal)) {
                        film.getStudio((String) pilihBioskop.getSelectedItem()).tambahJadwal(jadwal);
                    }
                } else {
                    film.getStudio((String) pilihBioskop.getSelectedItem()).hapusJadwal(jadwal);
                }
            }
        }
        this.dispose();
    }//GEN-LAST:event_simpanBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel besokTxt;
    private javax.swing.JLabel hariIniTxt;
    private javax.swing.JTextField inputHarga;
    private javax.swing.JTextField inputLokasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lusaTxt;
    private javax.swing.JToggleButton pilih1;
    private javax.swing.JToggleButton pilih10;
    private javax.swing.JToggleButton pilih11;
    private javax.swing.JToggleButton pilih12;
    private javax.swing.JToggleButton pilih2;
    private javax.swing.JToggleButton pilih3;
    private javax.swing.JToggleButton pilih4;
    private javax.swing.JToggleButton pilih5;
    private javax.swing.JToggleButton pilih6;
    private javax.swing.JToggleButton pilih7;
    private javax.swing.JToggleButton pilih8;
    private javax.swing.JToggleButton pilih9;
    private javax.swing.JComboBox<String> pilihBioskop;
    private javax.swing.JButton simpanBtn;
    // End of variables declaration//GEN-END:variables
}

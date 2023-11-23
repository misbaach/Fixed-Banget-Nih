/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project;

import Class.Film;
import Class.Kursi;
import java.util.ArrayList;
import javax.swing.JToggleButton;

/**
 *
 * @author Misbach
 */
public class DaftarKursi extends javax.swing.JFrame {

    Film film;
    Kursi kursi;

    public DaftarKursi() {
        initComponents();
        this.film = film;
        this.kursi = new Kursi(25000);
        disableTerjual();
    }

    String kursiDipilih = "";

    private int pilihan() {
        String[] kursiArray = kursiDipilih.trim().split(" ");
        return kursiArray.length;
    }

    private JToggleButton[] daftarBtn() {
        JToggleButton[] allToggleButtons = {
            btnA1, btnA2, btnA3, btnA4, btnA5, btnA6, btnA7, btnA8,
            btnB1, btnB2, btnB3, btnB4, btnB5, btnB6, btnB7, btnB8,
            btnC1, btnC2, btnC3, btnC4, btnC5, btnC6, btnC7, btnC8,
            btnD1, btnD2, btnD3, btnD4, btnD5, btnD6, btnD7, btnD8
        };
        return allToggleButtons;
    }

    private void book(String kursi) {
        if (kursi != null && !kursi.isEmpty()) {
            if (kursiDipilih.contains(kursi)) {
                kursiDipilih = kursiDipilih.replace(kursi + " ", "");
            } else {
                if (pilihan() < 4) {
                    kursiDipilih += kursi + " ";
                }
            }
            muncul.setText(kursiDipilih.trim());
            tampilkanHarga();

            int pilihanmu = pilihan();
            for (JToggleButton button : daftarBtn()) {
                if (!kursiDipilih.contains(button.getActionCommand())) {
                    button.setEnabled(pilihanmu < 4);
                }
            }
        }
    }

    private void tampilkanHarga() {
        int hargaTotal;
        if (kursiDipilih.trim().isEmpty()) {
            hargaTotal = 0;
        } else {
            hargaTotal = kursi.harga * kursiDipilih.trim().split(" ").length;
        }
        String harga = String.valueOf(hargaTotal);
        hartot.setText(harga);
    }

    private void disableTerjual() {
        ArrayList<String> terjual = kursi.getTerjual();
        for (JToggleButton button : daftarBtn()) {
            if (terjual.contains(button.getText())) {
                button.setEnabled(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnA1 = new javax.swing.JToggleButton();
        btnA2 = new javax.swing.JToggleButton();
        btnA3 = new javax.swing.JToggleButton();
        btnA4 = new javax.swing.JToggleButton();
        btnA5 = new javax.swing.JToggleButton();
        btnA6 = new javax.swing.JToggleButton();
        btnA8 = new javax.swing.JToggleButton();
        btnB1 = new javax.swing.JToggleButton();
        btnB2 = new javax.swing.JToggleButton();
        btnB3 = new javax.swing.JToggleButton();
        btnB4 = new javax.swing.JToggleButton();
        btnB5 = new javax.swing.JToggleButton();
        btnB6 = new javax.swing.JToggleButton();
        btnB7 = new javax.swing.JToggleButton();
        btnB8 = new javax.swing.JToggleButton();
        btnC1 = new javax.swing.JToggleButton();
        btnC2 = new javax.swing.JToggleButton();
        btnC3 = new javax.swing.JToggleButton();
        btnC4 = new javax.swing.JToggleButton();
        btnC5 = new javax.swing.JToggleButton();
        btnC6 = new javax.swing.JToggleButton();
        btnC7 = new javax.swing.JToggleButton();
        btnC8 = new javax.swing.JToggleButton();
        btnD1 = new javax.swing.JToggleButton();
        btnD2 = new javax.swing.JToggleButton();
        btnD3 = new javax.swing.JToggleButton();
        btnD4 = new javax.swing.JToggleButton();
        btnD5 = new javax.swing.JToggleButton();
        btnD6 = new javax.swing.JToggleButton();
        btnD7 = new javax.swing.JToggleButton();
        btnD8 = new javax.swing.JToggleButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnA7 = new javax.swing.JToggleButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBayar = new javax.swing.JButton();
        hartot = new javax.swing.JTextField();
        muncul = new javax.swing.JTextField();

        jToggleButton9.setText("A1");

        jToggleButton10.setText("A1");

        jToggleButton11.setText("A1");

        jToggleButton12.setText("A1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(54, 48, 98));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Pilih Tempat Duduk");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Tersedia");

        jPanel3.setBackground(new java.awt.Color(19, 32, 67));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jLabel3.setText("Terjual");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btnA1.setBackground(new java.awt.Color(19, 32, 67));
        btnA1.setForeground(new java.awt.Color(255, 255, 255));
        btnA1.setText("A1");
        btnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA1ActionPerformed(evt);
            }
        });

        btnA2.setBackground(new java.awt.Color(19, 32, 67));
        btnA2.setForeground(new java.awt.Color(255, 255, 255));
        btnA2.setText("A2");
        btnA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA2ActionPerformed(evt);
            }
        });

        btnA3.setBackground(new java.awt.Color(19, 32, 67));
        btnA3.setForeground(new java.awt.Color(255, 255, 255));
        btnA3.setText("A3");
        btnA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA3ActionPerformed(evt);
            }
        });

        btnA4.setBackground(new java.awt.Color(19, 32, 67));
        btnA4.setForeground(new java.awt.Color(255, 255, 255));
        btnA4.setText("A4");
        btnA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA4ActionPerformed(evt);
            }
        });

        btnA5.setBackground(new java.awt.Color(19, 32, 67));
        btnA5.setForeground(new java.awt.Color(255, 255, 255));
        btnA5.setText("A5");
        btnA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA5ActionPerformed(evt);
            }
        });

        btnA6.setBackground(new java.awt.Color(19, 32, 67));
        btnA6.setForeground(new java.awt.Color(255, 255, 255));
        btnA6.setText("A6");
        btnA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA6ActionPerformed(evt);
            }
        });

        btnA8.setBackground(new java.awt.Color(19, 32, 67));
        btnA8.setForeground(new java.awt.Color(255, 255, 255));
        btnA8.setText("A8");
        btnA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA8ActionPerformed(evt);
            }
        });

        btnB1.setBackground(new java.awt.Color(19, 32, 67));
        btnB1.setForeground(new java.awt.Color(255, 255, 255));
        btnB1.setText("B1");
        btnB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB1ActionPerformed(evt);
            }
        });

        btnB2.setBackground(new java.awt.Color(19, 32, 67));
        btnB2.setForeground(new java.awt.Color(255, 255, 255));
        btnB2.setText("B2");
        btnB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB2ActionPerformed(evt);
            }
        });

        btnB3.setBackground(new java.awt.Color(19, 32, 67));
        btnB3.setForeground(new java.awt.Color(255, 255, 255));
        btnB3.setText("B3");
        btnB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB3ActionPerformed(evt);
            }
        });

        btnB4.setBackground(new java.awt.Color(19, 32, 67));
        btnB4.setForeground(new java.awt.Color(255, 255, 255));
        btnB4.setText("B4");
        btnB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB4ActionPerformed(evt);
            }
        });

        btnB5.setBackground(new java.awt.Color(19, 32, 67));
        btnB5.setForeground(new java.awt.Color(255, 255, 255));
        btnB5.setText("B5");
        btnB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB5ActionPerformed(evt);
            }
        });

        btnB6.setBackground(new java.awt.Color(19, 32, 67));
        btnB6.setForeground(new java.awt.Color(255, 255, 255));
        btnB6.setText("B6");
        btnB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB6ActionPerformed(evt);
            }
        });

        btnB7.setBackground(new java.awt.Color(19, 32, 67));
        btnB7.setForeground(new java.awt.Color(255, 255, 255));
        btnB7.setText("B7");
        btnB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB7ActionPerformed(evt);
            }
        });

        btnB8.setBackground(new java.awt.Color(19, 32, 67));
        btnB8.setForeground(new java.awt.Color(255, 255, 255));
        btnB8.setText("B8");
        btnB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB8ActionPerformed(evt);
            }
        });

        btnC1.setBackground(new java.awt.Color(19, 32, 67));
        btnC1.setForeground(new java.awt.Color(255, 255, 255));
        btnC1.setText("C1");
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        btnC2.setBackground(new java.awt.Color(19, 32, 67));
        btnC2.setForeground(new java.awt.Color(255, 255, 255));
        btnC2.setText("C2");
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });

        btnC3.setBackground(new java.awt.Color(19, 32, 67));
        btnC3.setForeground(new java.awt.Color(255, 255, 255));
        btnC3.setText("C3");
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });

        btnC4.setBackground(new java.awt.Color(19, 32, 67));
        btnC4.setForeground(new java.awt.Color(255, 255, 255));
        btnC4.setText("C4");
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });

        btnC5.setBackground(new java.awt.Color(19, 32, 67));
        btnC5.setForeground(new java.awt.Color(255, 255, 255));
        btnC5.setText("C5");
        btnC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC5ActionPerformed(evt);
            }
        });

        btnC6.setBackground(new java.awt.Color(19, 32, 67));
        btnC6.setForeground(new java.awt.Color(255, 255, 255));
        btnC6.setText("C6");
        btnC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC6ActionPerformed(evt);
            }
        });

        btnC7.setBackground(new java.awt.Color(19, 32, 67));
        btnC7.setForeground(new java.awt.Color(255, 255, 255));
        btnC7.setText("C7");
        btnC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC7ActionPerformed(evt);
            }
        });

        btnC8.setBackground(new java.awt.Color(19, 32, 67));
        btnC8.setForeground(new java.awt.Color(255, 255, 255));
        btnC8.setText("C8");
        btnC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC8ActionPerformed(evt);
            }
        });

        btnD1.setBackground(new java.awt.Color(19, 32, 67));
        btnD1.setForeground(new java.awt.Color(255, 255, 255));
        btnD1.setText("D1");
        btnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD1ActionPerformed(evt);
            }
        });

        btnD2.setBackground(new java.awt.Color(19, 32, 67));
        btnD2.setForeground(new java.awt.Color(255, 255, 255));
        btnD2.setText("D2");
        btnD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD2ActionPerformed(evt);
            }
        });

        btnD3.setBackground(new java.awt.Color(19, 32, 67));
        btnD3.setForeground(new java.awt.Color(255, 255, 255));
        btnD3.setText("D3");
        btnD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD3ActionPerformed(evt);
            }
        });

        btnD4.setBackground(new java.awt.Color(19, 32, 67));
        btnD4.setForeground(new java.awt.Color(255, 255, 255));
        btnD4.setText("D4");
        btnD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD4ActionPerformed(evt);
            }
        });

        btnD5.setBackground(new java.awt.Color(19, 32, 67));
        btnD5.setForeground(new java.awt.Color(255, 255, 255));
        btnD5.setText("D5");
        btnD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD5ActionPerformed(evt);
            }
        });

        btnD6.setBackground(new java.awt.Color(19, 32, 67));
        btnD6.setForeground(new java.awt.Color(255, 255, 255));
        btnD6.setText("D6");
        btnD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD6ActionPerformed(evt);
            }
        });

        btnD7.setBackground(new java.awt.Color(19, 32, 67));
        btnD7.setForeground(new java.awt.Color(255, 255, 255));
        btnD7.setText("D7");
        btnD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD7ActionPerformed(evt);
            }
        });

        btnD8.setBackground(new java.awt.Color(19, 32, 67));
        btnD8.setForeground(new java.awt.Color(255, 255, 255));
        btnD8.setText("D8");
        btnD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD8ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel5.setText("LAYAR BIOSKOP");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(143, 143, 143))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnA7.setBackground(new java.awt.Color(19, 32, 67));
        btnA7.setForeground(new java.awt.Color(255, 255, 255));
        btnA7.setText("A7");
        btnA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnA1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnA2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnA3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnA4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btnA5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnA6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnA7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnA8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnB5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnB6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnB7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnB8))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnC5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC8))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnD1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD8)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA1)
                    .addComponent(btnA2)
                    .addComponent(btnA3)
                    .addComponent(btnA4)
                    .addComponent(btnA5)
                    .addComponent(btnA6)
                    .addComponent(btnA8)
                    .addComponent(btnA7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnB1)
                    .addComponent(btnB2)
                    .addComponent(btnB3)
                    .addComponent(btnB4)
                    .addComponent(btnB5)
                    .addComponent(btnB6)
                    .addComponent(btnB7)
                    .addComponent(btnB8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC1)
                    .addComponent(btnC2)
                    .addComponent(btnC3)
                    .addComponent(btnC4)
                    .addComponent(btnC5)
                    .addComponent(btnC6)
                    .addComponent(btnC7)
                    .addComponent(btnC8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnD1)
                    .addComponent(btnD2)
                    .addComponent(btnD3)
                    .addComponent(btnD4)
                    .addComponent(btnD5)
                    .addComponent(btnD6)
                    .addComponent(btnD7)
                    .addComponent(btnD8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel6.setText("RINGKASAN ORDER");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(119, 119, 119))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("TOTAL HARGA");

        jLabel8.setText("TEMPAT DUDUK");

        btnBayar.setBackground(new java.awt.Color(19, 32, 67));
        btnBayar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("BAYAR");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        hartot.setEditable(false);
        hartot.setBackground(new java.awt.Color(255, 255, 255));
        hartot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hartot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hartot.setBorder(null);

        muncul.setEditable(false);
        muncul.setBackground(new java.awt.Color(255, 255, 255));
        muncul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        muncul.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        muncul.setBorder(null);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(62, 62, 62))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(hartot, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(muncul, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hartot, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muncul, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBayar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD3ActionPerformed
        book("D3");
    }//GEN-LAST:event_btnD3ActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        TransaksiPage bayar = new TransaksiPage(film);
        bayar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB6ActionPerformed
        book("B6");
    }//GEN-LAST:event_btnB6ActionPerformed

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed
        book("A1");
        tampilkanHarga();

    }//GEN-LAST:event_btnA1ActionPerformed

    private void btnA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA2ActionPerformed
        book("A2");
        tampilkanHarga();

    }//GEN-LAST:event_btnA2ActionPerformed

    private void btnA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA3ActionPerformed
        book("A3");

    }//GEN-LAST:event_btnA3ActionPerformed

    private void btnA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA4ActionPerformed
        book("A4");

    }//GEN-LAST:event_btnA4ActionPerformed

    private void btnA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA6ActionPerformed
        book("A6");

    }//GEN-LAST:event_btnA6ActionPerformed

    private void btnA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA8ActionPerformed
        book("A8");

    }//GEN-LAST:event_btnA8ActionPerformed

    private void btnB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB1ActionPerformed
        book("B1");
    }//GEN-LAST:event_btnB1ActionPerformed

    private void btnB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB2ActionPerformed
        book("B2");
    }//GEN-LAST:event_btnB2ActionPerformed

    private void btnB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB3ActionPerformed
        book("B3");
    }//GEN-LAST:event_btnB3ActionPerformed

    private void btnB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB4ActionPerformed
        book("B4");
    }//GEN-LAST:event_btnB4ActionPerformed

    private void btnB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB5ActionPerformed
        book("B5");
    }//GEN-LAST:event_btnB5ActionPerformed

    private void btnB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB7ActionPerformed
        book("B7");
    }//GEN-LAST:event_btnB7ActionPerformed

    private void btnB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB8ActionPerformed
        book("B8");
    }//GEN-LAST:event_btnB8ActionPerformed

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        book("C1");
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        book("C2");
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        book("C3");
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        book("C4");
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        book("C5");
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC6ActionPerformed
        book("C6");
    }//GEN-LAST:event_btnC6ActionPerformed

    private void btnC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC7ActionPerformed
        book("C7");
    }//GEN-LAST:event_btnC7ActionPerformed

    private void btnC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC8ActionPerformed
        book("C8");
    }//GEN-LAST:event_btnC8ActionPerformed

    private void btnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD1ActionPerformed
        book("D1");
    }//GEN-LAST:event_btnD1ActionPerformed

    private void btnD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD2ActionPerformed
        book("D2");
    }//GEN-LAST:event_btnD2ActionPerformed

    private void btnD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD4ActionPerformed
        book("D4");
    }//GEN-LAST:event_btnD4ActionPerformed

    private void btnD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD5ActionPerformed
        book("D5");;
    }//GEN-LAST:event_btnD5ActionPerformed

    private void btnD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD6ActionPerformed
        book("D6");
    }//GEN-LAST:event_btnD6ActionPerformed

    private void btnD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD7ActionPerformed
        book("D7");
    }//GEN-LAST:event_btnD7ActionPerformed

    private void btnD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD8ActionPerformed
        book("D8");
    }//GEN-LAST:event_btnD8ActionPerformed

    private void btnA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA5ActionPerformed
        book("A5");
    }//GEN-LAST:event_btnA5ActionPerformed

    private void btnA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA7ActionPerformed
        book("A7");
    }//GEN-LAST:event_btnA7ActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarKursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarKursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarKursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarKursi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarKursi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnA1;
    private javax.swing.JToggleButton btnA2;
    private javax.swing.JToggleButton btnA3;
    private javax.swing.JToggleButton btnA4;
    private javax.swing.JToggleButton btnA5;
    private javax.swing.JToggleButton btnA6;
    private javax.swing.JToggleButton btnA7;
    private javax.swing.JToggleButton btnA8;
    private javax.swing.JToggleButton btnB1;
    private javax.swing.JToggleButton btnB2;
    private javax.swing.JToggleButton btnB3;
    private javax.swing.JToggleButton btnB4;
    private javax.swing.JToggleButton btnB5;
    private javax.swing.JToggleButton btnB6;
    private javax.swing.JToggleButton btnB7;
    private javax.swing.JToggleButton btnB8;
    private javax.swing.JButton btnBayar;
    private javax.swing.JToggleButton btnC1;
    private javax.swing.JToggleButton btnC2;
    private javax.swing.JToggleButton btnC3;
    private javax.swing.JToggleButton btnC4;
    private javax.swing.JToggleButton btnC5;
    private javax.swing.JToggleButton btnC6;
    private javax.swing.JToggleButton btnC7;
    private javax.swing.JToggleButton btnC8;
    private javax.swing.JToggleButton btnD1;
    private javax.swing.JToggleButton btnD2;
    private javax.swing.JToggleButton btnD3;
    private javax.swing.JToggleButton btnD4;
    private javax.swing.JToggleButton btnD5;
    private javax.swing.JToggleButton btnD6;
    private javax.swing.JToggleButton btnD7;
    private javax.swing.JToggleButton btnD8;
    private javax.swing.JTextField hartot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JTextField muncul;
    // End of variables declaration//GEN-END:variables
}

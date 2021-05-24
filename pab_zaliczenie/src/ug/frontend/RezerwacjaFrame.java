/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ug.frontend;

import java.util.ArrayList;
import javax.swing.JFrame;
import ug.backend.BazaDanych;
import ug.backend.Rezerwacja;

/**
 *
 * @author Konrad
 */
public class RezerwacjaFrame extends javax.swing.JFrame {
    private BazaDanych bazaDanych;
    private ArrayList rezerwacje;
    private Rezerwacja rezerwacja;
    private int indeks;
    /**
     * Creates new form RezerwacjaFrame
     */
    public RezerwacjaFrame() {
        initComponents();
        bazaDanych= new BazaDanych();
        rezerwacje=bazaDanych.wszystkieRezerwacje();
        indeks=0;      
        pokazRezerwacje(indeks);
        bPoprzedni_r.setEnabled(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
    }
    private void pokazRezerwacje(int indeks) {
        if(!rezerwacje.isEmpty()){
            rezerwacja=(Rezerwacja)rezerwacje.get(indeks);
            tId_r.setText(String.valueOf(rezerwacja.getId_r()));
            tId_koncertu_r.setText(String.valueOf(rezerwacja.getId_koncertu_r()));
            tEmail_r.setText(rezerwacja.getEmail_r());
            tBilety_r.setText(String.valueOf(rezerwacja.getBilety_r()));
            
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

        tId_r = new javax.swing.JTextField();
        tId_koncertu_r = new javax.swing.JTextField();
        tEmail_r = new javax.swing.JTextField();
        tBilety_r = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tId_Szukaj_r = new javax.swing.JTextField();
        bSzukaj_r = new javax.swing.JButton();
        bUsun_r = new javax.swing.JButton();
        bZmien_r = new javax.swing.JButton();
        bPoprzedni_r = new javax.swing.JButton();
        bNastepny_r = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tId_Usun_r = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Rezerwacji");

        jLabel2.setText("ID Koncertu");

        jLabel3.setText("Email");

        jLabel4.setText("Liczba biletów");

        bSzukaj_r.setText("Szukaj");
        bSzukaj_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSzukaj_rActionPerformed(evt);
            }
        });

        bUsun_r.setText("Usuń");
        bUsun_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsun_rActionPerformed(evt);
            }
        });

        bZmien_r.setText("Zmień");
        bZmien_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZmien_rActionPerformed(evt);
            }
        });

        bPoprzedni_r.setText("Poprzedni");
        bPoprzedni_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPoprzedni_rActionPerformed(evt);
            }
        });

        bNastepny_r.setText("Następny");
        bNastepny_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNastepny_rActionPerformed(evt);
            }
        });

        jLabel5.setText("Szukanie po ID Rezerwacji");

        jLabel6.setText("Usuwanie po ID Rezerwacji");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tBilety_r, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(tEmail_r, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tId_koncertu_r, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tId_r, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bSzukaj_r)
                                    .addComponent(bUsun_r)
                                    .addComponent(bZmien_r)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bPoprzedni_r)
                                        .addGap(18, 18, 18)
                                        .addComponent(bNastepny_r)))
                                .addGap(0, 136, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tId_Szukaj_r)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tId_Usun_r)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tId_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bZmien_r))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tId_koncertu_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bUsun_r)
                    .addComponent(tId_Usun_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tEmail_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tId_Szukaj_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSzukaj_r))
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tBilety_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPoprzedni_r)
                    .addComponent(bNastepny_r))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSzukaj_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSzukaj_rActionPerformed
        // TODO add your handling code here:
        for(int indeks=0; indeks<rezerwacje.size(); indeks++){ 
            rezerwacja=(Rezerwacja)rezerwacje.get(indeks);
            rezerwacja.getId_r();
                if(tId_Szukaj_r.getText().equals(rezerwacja.getId_r())){    
                    pokazRezerwacje(indeks);
              
                }
        }         
    }//GEN-LAST:event_bSzukaj_rActionPerformed

    private void bPoprzedni_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPoprzedni_rActionPerformed
        // TODO add your handling code here:
        if(indeks>0) {
            indeks-=1;
            this.pokazRezerwacje(indeks);
        
            if(indeks==0) {
                bPoprzedni_r.setEnabled(false);
            }else{
                bNastepny_r.setEnabled(true);
            }            
        }
    }//GEN-LAST:event_bPoprzedni_rActionPerformed

    private void bNastepny_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNastepny_rActionPerformed
        // TODO add your handling code here:
        if(indeks<rezerwacje.size()-1){
            indeks+=1;
            rezerwacje = bazaDanych.wszystkieRezerwacje();
            this.pokazRezerwacje(indeks);
        
            if(indeks==rezerwacje.size()-1) {
                bNastepny_r.setEnabled(false);
            }else{
                bPoprzedni_r.setEnabled(true);
            }
        }
    }//GEN-LAST:event_bNastepny_rActionPerformed

    private void bUsun_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsun_rActionPerformed
        // TODO add your handling code here:
        bazaDanych.usun(tId_Usun_r.getText());
        rezerwacje = bazaDanych.wszystkieRezerwacje();
    }//GEN-LAST:event_bUsun_rActionPerformed

    private void bZmien_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZmien_rActionPerformed
        // TODO add your handling code here:
        bazaDanych.zmien(tId_r.getText(), Integer.parseInt(tId_koncertu_r.getText()),
                tEmail_r.getText(), Integer.parseInt(tBilety_r.getText()));
        rezerwacje = bazaDanych.wszystkieRezerwacje();
    }//GEN-LAST:event_bZmien_rActionPerformed

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
            java.util.logging.Logger.getLogger(RezerwacjaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RezerwacjaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RezerwacjaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RezerwacjaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RezerwacjaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bNastepny_r;
    private javax.swing.JButton bPoprzedni_r;
    private javax.swing.JButton bSzukaj_r;
    private javax.swing.JButton bUsun_r;
    private javax.swing.JButton bZmien_r;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tBilety_r;
    private javax.swing.JTextField tEmail_r;
    private javax.swing.JTextField tId_Szukaj_r;
    private javax.swing.JTextField tId_Usun_r;
    private javax.swing.JTextField tId_koncertu_r;
    private javax.swing.JTextField tId_r;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ug.backend;



/**
 *
 * @author Konrad
 */
public class Koncert {
   private int id_k;
   private String zespol_k, miejsce_k, czas_k;
   private int bilety_k; 

    public int getId_k() {
        return id_k;
    }

    public void setId_k(int id_k) {
        this.id_k = id_k;
    }

    public String getZespol_k() {
        return zespol_k;
    }

    public void setZespol_k(String zespol_k) {
        this.zespol_k = zespol_k;
    }

    public String getMiejsce_k() {
        return miejsce_k;
    }

    public void setMiejsce_k(String miejsce_k) {
        this.miejsce_k = miejsce_k;
    }

    public String getCzas_k() {
        return czas_k;
    }

    public void setCzas_k(String czas_k) {
        this.czas_k = czas_k;
    }

    public int getBilety_k() {
        return bilety_k;
    }

    public void setBilety_k(int bilety_k) {
        this.bilety_k = bilety_k;
    }

    
    public Koncert(int id_k, String zespol_k, String miejsce_k, String czas_k, int bilety_k) {
        this.id_k = id_k;
        this.zespol_k = zespol_k;
        this.miejsce_k = miejsce_k;
        this.czas_k = czas_k;
        this.bilety_k = bilety_k;
        
    }
}

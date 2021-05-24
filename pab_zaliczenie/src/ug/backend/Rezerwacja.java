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
public class Rezerwacja {
    private String id_r,  email_r;
    private int id_koncertu_r, bilety_r;
    
    public String getId_r() {
        return id_r;
    }

    public void setId_r(String id_r) {
        this.id_r = id_r;
    }

    public String getEmail_r() {
        return email_r;
    }

    public void setEmail_r(String email_r) {
        this.email_r = email_r;
    }

    public int getId_koncertu_r() {
        return id_koncertu_r;
    }

    public void setId_koncertu_r(int id_koncertu_r) {
        this.id_koncertu_r = id_koncertu_r;
    }

    public int getBilety_r() {
        return bilety_r;
    }

    public void setBilety_r(int bilety_r) {
        this.bilety_r = bilety_r;
    }

    public Rezerwacja(String id_r, int id_koncertu_r, String email_r, int bilety_r) {
        this.id_r = id_r;
        this.email_r = email_r;
        this.id_koncertu_r = id_koncertu_r;
        this.bilety_r = bilety_r;
    }
   
}

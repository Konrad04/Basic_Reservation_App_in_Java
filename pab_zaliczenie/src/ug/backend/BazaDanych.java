/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ug.backend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Konrad
 */
public class BazaDanych {
    
    
    public ArrayList<Koncert> wszystkieKoncerty(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection polaczenie=DriverManager.getConnection(
            "connection",
            "user","pwd"); 
            ArrayList<Koncert> koncerty = new ArrayList();
            PreparedStatement ps = polaczenie.prepareStatement("{call dbo.wszystkieKoncerty}");
            ResultSet rezultat=ps.executeQuery();
                while(rezultat.next()) {
                    koncerty.add(new Koncert(
                        rezultat.getInt("id_k"),
                        rezultat.getString("zespol_k"),
                        rezultat.getString("miejsce_k"),
                        rezultat.getString("czas_k"),
                        rezultat.getInt("bilety_k")
                        
                    ));
                }
                polaczenie.close();
                return koncerty;
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage(),
                "Błąd aplikacji",JOptionPane.ERROR_MESSAGE);
                    return null;
            }
    }
    
    
    public void zarezerwuj(String id_r, int id_koncertu_r, String email_r, int bilety_r, int bilety_k, int id_k) {
        try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection polaczenie=DriverManager.getConnection(
         "connection",
         "user","pwd"); 
        CallableStatement skladnia = polaczenie.prepareCall("{call dbo.zarezerwuj(?,?,?,?,?,?)}");
            skladnia.setString(1,id_r);
             skladnia.setInt(2,id_koncertu_r);
            skladnia.setString(3,email_r);
            skladnia.setInt(4,bilety_r);
            skladnia.setInt(5, bilety_k);
            skladnia.setInt(6, id_k);
            skladnia.execute();
            polaczenie.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),
            "Błąd aplikacji",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList<Rezerwacja> wszystkieRezerwacje(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection polaczenie=DriverManager.getConnection(
            "connection",
            "user","pwd"); 
            ArrayList<Rezerwacja> rezerwacje = new ArrayList();
            PreparedStatement ps = polaczenie.prepareStatement("{call dbo.wszystkieRezerwacje}");
            ResultSet rezultat=ps.executeQuery();
                while(rezultat.next()) {
                    rezerwacje.add(new Rezerwacja(
                        rezultat.getString("id_r"),
                        rezultat.getInt("id_koncertu_r"),
                        rezultat.getString("email_r"),
                        rezultat.getInt("bilety_r")
                                               
                    ));
                }
                //polaczenie.close();
                return rezerwacje;
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage(),
                "Błąd aplikacji",JOptionPane.ERROR_MESSAGE);
                    return null;
            }
    }
    
    public void zmien(String id_r, int id_koncertu_r, String email_r, int bilety_r) {
        try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection polaczenie=DriverManager.getConnection(
         "connection",
         "user","pwd"); 
        CallableStatement skladnia = polaczenie.prepareCall("{call dbo.zmienRezerwacje(?,?,?,?)}");
            skladnia.setString(1,id_r);
            skladnia.setInt(2,id_koncertu_r);
            skladnia.setString(3,email_r);
            skladnia.setInt(4,bilety_r);
            skladnia.execute();
            polaczenie.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),
            "Błąd aplikacji",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void usun(String id_r) {
        try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection polaczenie=DriverManager.getConnection(
         "connection",
         "user","pwd"); 
        CallableStatement skladnia = polaczenie.prepareCall("{call dbo.usunRezerwacje(?)}");
            skladnia.setString(1,id_r);
            skladnia.execute();
            polaczenie.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),
            "Błąd aplikacji",JOptionPane.ERROR_MESSAGE);
        }
    }
}

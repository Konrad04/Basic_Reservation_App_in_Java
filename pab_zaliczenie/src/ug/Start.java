/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ug;

import ug.frontend.StartFrame;

/**
 *
 * @author Konrad
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartFrame startFrame = new StartFrame(); 
        startFrame.setTitle("Start Rezerwacja koncertów");
        startFrame.setSize(800,600);
        startFrame.setVisible(true);
         
    }
    
}

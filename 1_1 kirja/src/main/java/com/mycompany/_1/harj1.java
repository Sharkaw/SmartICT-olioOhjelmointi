/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._1;

/**
 *
 * @author Suvi
 */
public class harj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // olio 1 malli
        Teos t = new Teos();
        t.setGenre("Kauhu");
        t.setSivumaara(100);
        System.out.print(t);
        
        //tai olio 2
        Teos t2 = new Teos("Suvi", "Fantasia", "123-5", 110, "Lainassa");
        System.out.print(t2);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitustyo;

import java.util.ArrayList;

/**
 *
 * @author Suvi Lindholm
 */
public class Kurssi {
   private int kurssi_id;
   private String nimi;
   private int opintopisteet;
   private String kuvaus;

    public int getKurssi_id() {
        return kurssi_id;
    }

    public void setKurssi_id(int kurssi_id) {
        this.kurssi_id = kurssi_id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getOpintopisteet() {
        return opintopisteet;
    }

    public void setOpintopisteet(int opintopisteet) {
        this.opintopisteet = opintopisteet;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }
   
   private ArrayList<Opiskelija> opiskelijaLista = new ArrayList<>();
   private ArrayList<Suoritus> suoritusLista = new ArrayList<>();
   
   public ArrayList<Suoritus> getKurssinSuoritukset(){
       return this.suoritusLista;
   }
   
   public ArrayList<Opiskelija> getKurssinOpiskelijat(){
       return this.opiskelijaLista;
   }

    @Override
    public String toString() {
        return "Kurssi{" + "kurssi_id=" + kurssi_id + ", nimi=" + nimi + 
                ", opintopisteet=" + opintopisteet + ", kuvaus=" + kuvaus + 
                ", opiskelijaLista=" + opiskelijaLista + ", suoritusLista=" 
                + suoritusLista + '}';
    }
    
}

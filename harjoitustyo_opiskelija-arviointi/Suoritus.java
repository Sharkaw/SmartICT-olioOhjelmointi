/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitustyo;

/**
 *
 * @author Suvi Lindholm
 */
public class Suoritus {
    private int opiskelija_id;
    private int kurssi_id;
    private int arvosana;
    private String suoritus_pvm;

    public int getOpiskelija_id() {
        return opiskelija_id;
    }

    public void setOpiskelija_id(int opiskelija_id) {
        this.opiskelija_id = opiskelija_id;
    }

    public int getKurssi_id() {
        return kurssi_id;
    }

    public void setKurssi_id(int kurssi_id) {
        this.kurssi_id = kurssi_id;
    }

    public int getArvosana() {
        return arvosana;
    }

    public void setArvosana(int arvosana) {
        this.arvosana = arvosana;
    }

    public String getSuoritus_pvm() {
        return suoritus_pvm;
    }

    public void setSuoritus_pvm(String suoritus_pvm) {
        this.suoritus_pvm = suoritus_pvm;
    }

    @Override
    public String toString() {
        return "Suoritus{" + "opiskelija_id=" + opiskelija_id + ", kurssi_id="
                + kurssi_id + ", arvosana=" + arvosana + ", suoritus_pvm=" + 
                suoritus_pvm + '}';
    }
    
}

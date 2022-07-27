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
public class Opiskelija {
    
    private int opiskelija_id;
    private String etunimi;
    private String sukunimi;
    private String lahiosoite;
    private String postitoimipaikka;
    private String postinro;
    private String email;
    private String puhelinnro;

    public int getOpiskelija_id() {
        return opiskelija_id;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getLahiosoite() {
        return lahiosoite;
    }

    public void setLahiosoite(String lahiosoite) {
        this.lahiosoite = lahiosoite;
    }

    public String getPostitoimipaikka() {
        return postitoimipaikka;
    }

    public void setPostitoimipaikka(String postitoimipaikka) {
        this.postitoimipaikka = postitoimipaikka;
    }

    public String getPostinro() {
        return postinro;
    }

    public void setPostinro(String postinro) {
        this.postinro = postinro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPuhelinnro() {
        return puhelinnro;
    }

    public void setPuhelinnro(String puhelinnro) {
        this.puhelinnro = puhelinnro;
    }

    public void setOpiskelija_id(int opiskelija_id) {
        this.opiskelija_id = opiskelija_id;
    }
    
    private ArrayList<Suoritus> suoritusLista = new ArrayList<>();
    
    public ArrayList<Suoritus> getOpiskelijanSuoritukset(){
        return suoritusLista;
    }

    @Override
    public String toString() {
        return "Opiskelija{" + "opiskelija_id=" + opiskelija_id + 
                ", etunimi=" + etunimi + ", sukunimi=" + sukunimi + 
                ", lahiosoite=" + lahiosoite + ", postitoimipaikka=" + 
                postitoimipaikka + ", postinro=" + postinro + ", email=" + 
                email + ", puhelinnro=" + puhelinnro + ", suoritusLista=" + 
                suoritusLista + '}';
    }
    
}

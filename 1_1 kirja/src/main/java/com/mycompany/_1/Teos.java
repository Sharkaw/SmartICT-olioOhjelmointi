
package com.mycompany._1;

/**
 *
 * @author Suvi
 */
public class Teos {
    //Tekijä, teoksen nimi, genre, ISBN, sivumäärä ja tila.
    //Tila-attribuutti kertoo, onko teos saatavilla, lainassa, hävinnyt tms.
    
    private String tekija;
    private String teoksenNimi;
    private String genre;
    private String isbn;
    private int sivumaara;
    private String tila;

    public Teos() {
    }

    public Teos(String tekija, String teoksenNimi, String genre, String isbn,
            int sivumaara, String tila) {
        this.tekija = tekija;
        this.teoksenNimi = teoksenNimi;
        this.genre = genre;
        this.isbn = isbn;
        this.sivumaara = sivumaara;
        this.tila = tila;
    }

    public String getTekija() {
        return tekija;
    }

    public void setTekija(String tekija) {
        this.tekija = tekija;
    }

    public String getTeoksenNimi() {
        return teoksenNimi;
    }

    public void setTeoksenNimi(String teoksenNimi) {
        this.teoksenNimi = teoksenNimi;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getSivumaara() {
        return sivumaara;
    }

    public void setSivumaara(int sivumaara) {
        this.sivumaara = sivumaara;
    }

    public String getTila() {
        return tila;
    }

    public void setTila(String tila) {
        this.tila = tila;
    }
   
    public String toString(){
        return "Teoksen tekija: " + this.getTekija() + "\n" +
                "Teoksen nimi: " + this.getTeoksenNimi() + "\n" +
    }
}

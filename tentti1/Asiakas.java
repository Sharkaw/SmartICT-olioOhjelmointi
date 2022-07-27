
package tentti1;

/**
 *
 * @author Suvi Lindholm
 */
public class Asiakas implements Comparable {
    protected String nimi;
    protected int asiakasnumero;
    protected String osoite;
    protected double ostosSumma;
    


    //Konstruktorit
    public Asiakas() {
    }

    public Asiakas(String nimi, int asiakasnumero, String osoite) {
        this.nimi = nimi;
        this.asiakasnumero = asiakasnumero;
        this.osoite = osoite;
    }
    
    public Asiakas(double ostosSumma) {
        this.ostosSumma = ostosSumma;
    }

    //Getterit ja Setterit
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getAsiakasnumero() {
        return asiakasnumero;
    }

    public void setAsiakasnumero(int asiakasnumero) {
        this.asiakasnumero = asiakasnumero;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public double getOstosSumma() {
        return ostosSumma;
    }

    public void setOstosSumma(double ostosSumma) {
        this.ostosSumma = ostosSumma;
    }
    
  
    
    //Metodit
    public void lisaaOstosSummaan(double lisays){
        this.ostosSumma = this.ostosSumma + lisays;
    
}
    
    //toString

    @Override
    public String toString() {
        return "Asiakas{" + "nimi= " + nimi + ", asiakasnumero= " +
                asiakasnumero + ", osoite=" + osoite + '}';
    }
    
    //Comparable
     public int compareTo(Object o){
        Asiakas olio = (Asiakas) o;
       if(this.getOstosSumma() > olio.getOstosSumma()){
           return 1;
       } 
       else if (this.getOstosSumma() < olio.getOstosSumma()){
           return -1;
       }
       return 0;
    }
    
}

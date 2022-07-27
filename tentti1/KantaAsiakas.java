
package tentti1;

/**
 *
 * @author Suvi Lindholm
 */
public class KantaAsiakas extends Asiakas{
    protected int syntVuosi;
    protected String email;
    //protected boolean kantaAsiakkuus = true;

    //Konstruktorit
    public KantaAsiakas() {
    }

    public KantaAsiakas(String nimi, int asiakasnumero, String osoite,
            int syntVuosi, String email) {
        this.nimi = nimi;
        this.asiakasnumero = asiakasnumero;
        this.osoite = osoite;
        this.syntVuosi = syntVuosi;
        this.email = email;
    }
    //Getterit ja setterit
    
    
    public int getSyntVuosi() {
        return syntVuosi;
    }

    public void setSyntVuosi(int syntVuosi) {
        this.syntVuosi = syntVuosi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    //ToString
    
    @Override
    public String toString() {
        return "KantaAsiakas{" + "nimi= " + nimi + ", asiakasnumero= " +
                asiakasnumero + ", osoite=" + osoite + "syntVuosi=" +
                syntVuosi + ", email=" + email + '}';
        
    }
    
    
  
    
    
    
}

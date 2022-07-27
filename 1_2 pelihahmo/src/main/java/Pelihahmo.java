/**
 *
 * @author Suvi
 */
public class Pelihahmo {
    String nimi;
    Hahmoluokka hahmoluokka = new Hahmoluokka();
    String sukupuoli;
    int ika;
    AseLuokka ase = new AseLuokka();

    public Pelihahmo() {
    }
    
    public Pelihahmo(String nimi, Hahmoluokka hahmoluokka, String sukupuoli,
            int ika, AseLuokka ase) {
        this.nimi = nimi;
        this.hahmoluokka = hahmoluokka;
        this.sukupuoli = sukupuoli;
        this.ika = ika;
        this.ase = ase;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public Hahmoluokka getHahmoluokka() {
        return hahmoluokka;
    }

    public void setHahmoluokka(Hahmoluokka hahmoluokka) {
        this.hahmoluokka = hahmoluokka;
    }

    public String getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(String sukupuoli) {
        this.sukupuoli = sukupuoli;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    public AseLuokka getAse() {
        return ase;
    }

    public void setAse(AseLuokka ase) {
        this.ase = ase;
    }
    
    
}

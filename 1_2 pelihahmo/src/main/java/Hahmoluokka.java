/**
 *
 * @author Suvi
 */
public class Hahmoluokka {
    String luokanNimi;
    int leveli;
    String erityisTaidot;

    public Hahmoluokka(String luokanNimi, int leveli, String erityisTaidot) {
        this.luokanNimi = luokanNimi;
        this.leveli = leveli;
        this.erityisTaidot = erityisTaidot;
    }

    public Hahmoluokka() {
    }

    public String getLuokanNimi() {
        return luokanNimi;
    }

    public void setLuokanNimi(String luokanNimi) {
        this.luokanNimi = luokanNimi;
    }

    public int getLeveli() {
        return leveli;
    }

    public void setLeveli(int leveli) {
        this.leveli = leveli;
    }

    public String getErityisTaidot() {
        return erityisTaidot;
    }

    public void setErityisTaidot(String erityisTaidot) {
        this.erityisTaidot = erityisTaidot;
    }
    
}

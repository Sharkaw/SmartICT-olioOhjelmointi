
/**
 *
 * @author Suvi
 */
public class AseLuokka {
    String ase;
    int vahinko;
    int bonus;

    public AseLuokka(String ase, int vahinko, int bonus) {
        this.ase = ase;
        this.vahinko = vahinko;
        this.bonus = bonus;
    }

    public AseLuokka() {
    }

    public String getAse() {
        return ase;
    }

    public void setAse(String ase) {
        this.ase = ase;
    }

    public int getVahinko() {
        return vahinko;
    }

    public void setVahinko(int vahinko) {
        this.vahinko = vahinko;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
}

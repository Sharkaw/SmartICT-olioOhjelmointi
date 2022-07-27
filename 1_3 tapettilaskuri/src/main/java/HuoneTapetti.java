/**
 *
 * @author Suvi
 */
public class HuoneTapetti {
    private HuoneMitat mitat;
    private double hinta;

    public HuoneTapetti() {
    }

    public HuoneTapetti(HuoneMitat mitat, double hinta) {
        this.mitat = mitat;
        this.hinta = hinta;
    }
    
    public double tapetinhinta() {
        double palautettavaHinta = (hinta * mitat.getKorkeus()* mitat.getLeveys());
        return palautettavaHinta;
    }

    public HuoneMitat getMitat() {
        return mitat;
    }

    public void setMitat(HuoneMitat mitat) {
        this.mitat = mitat;
    }

    public double getHinta() {
        return hinta;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }
    
}

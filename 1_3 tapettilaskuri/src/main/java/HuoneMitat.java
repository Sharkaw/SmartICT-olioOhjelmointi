
/**
 *
 * @author Suvi
 */
public class HuoneMitat {
    private int leveys;
    private int korkeus;

    //muodostimet
    public HuoneMitat() {
    }

    public HuoneMitat(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
    }
    
    
    //getterit ja setterit
    public int getLeveys() {
        return leveys;
    }

    public void setLeveys(int leveys) {
        this.leveys = leveys;
    }

    public int getKorkeus() {
        return korkeus;
    }

    public void setKorkeus(int korkeus) {
        this.korkeus = korkeus;
    }
    
}

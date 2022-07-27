
/**
 *
 * @author Suvi
 */
public class harj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HuoneMitat mitat = new HuoneMitat(10,10);
        HuoneTapetti tapetti = new HuoneTapetti(mitat, 10);
        System.out.print("Tapetin hinta on " + tapetti.tapetinhinta() + "\n");
    }
    
}

public class LaivatTesti {
    public static void main(String[] args) {
        Laiva silja = new Laiva("silja", "1950");
        RisteilyAlus grace = new RisteilyAlus(2000);
        Tankkeri europa = new Tankkeri(100500);

        System.out.println(silja.toString());
        System.out.println(grace.toString());
        System.out.println(europa.toString());
        
        //ei täysin valmis
    }
    
}

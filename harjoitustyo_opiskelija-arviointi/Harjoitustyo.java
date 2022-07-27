/*
 *Java documentointi jäi vielä vaiheeseen.
 */
package harjoitustyo;

/**
 *
 * @author Suvi Lindholm
 */
public class Harjoitustyo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Luodaan opiskelija-olio ja sen parametrit
         */
       Opiskelija suvi = new Opiskelija();
       suvi.setOpiskelija_id(1);
       suvi.setEmail("suvi@edu.fi");
       suvi.setEtunimi("Suvi");
       suvi.setSukunimi("Lindholm");
       suvi.setLahiosoite("Varvikkoinen 34");
       suvi.setPostinro("80100");
       suvi.setPostitoimipaikka("Joensuu");
       suvi.setPuhelinnro("0401234567");
       
       Opiskelija atte = new Opiskelija();
       atte.setOpiskelija_id(2);
       atte.setEtunimi("Atte");
       
        /**
         * Luodaan suoritukset ja yhdistetään suoritus opiskelijaan ja kurssiin
         */
       Suoritus ohjelmointiSuoritus = new Suoritus(); //suoritusten luominen
       ohjelmointiSuoritus.setOpiskelija_id(1);
       ohjelmointiSuoritus.setArvosana(5);
       ohjelmointiSuoritus.setSuoritus_pvm("2020.12.12");
      
       ohjelmointiSuoritus.setKurssi_id(1234);
       
       Suoritus ohjelmointiSuoritus2 = new Suoritus();
       ohjelmointiSuoritus2.setOpiskelija_id(2);
       ohjelmointiSuoritus.setArvosana(4);
       ohjelmointiSuoritus.setSuoritus_pvm("2020.12.13");
       
       ohjelmointiSuoritus2.setKurssi_id(1234);
      
        /**
         * Luodaan kurssi-olio ja sen parametrit
         */
       Kurssi ohjelmointi = new Kurssi();
       ohjelmointi.setKurssi_id(1234);
       ohjelmointi.setNimi("Ohjelmoinnin perusteet");
       ohjelmointi.setKuvaus("Opetellaan ohjelmointia.");
       ohjelmointi.setOpintopisteet(5);
       
        /**
         * Lisätään opiskelijat kurssille
         */
       ohjelmointi.getKurssinOpiskelijat().add(suvi);
       ohjelmointi.getKurssinOpiskelijat().add(atte);
       
        /**
         * Lisätään suoritukset
         */
       ohjelmointi.getKurssinSuoritukset().add(ohjelmointiSuoritus);
       ohjelmointi.getKurssinSuoritukset().add(ohjelmointiSuoritus2);    
    
       suvi.getOpiskelijanSuoritukset().add(ohjelmointiSuoritus);
       atte.getOpiskelijanSuoritukset().add(ohjelmointiSuoritus2);
       
       /**
         * Tietyn opiskelijan suoritusten tulostaminen
         */
       for(int i =0; i <= suvi.getOpiskelijanSuoritukset().size()-1; i++){
            System.out.println("Kurssi_id: " + 
                    suvi.getOpiskelijanSuoritukset().get(i));
        }
       
        /**
         * Tietyn kurssin tulostus
         */
       for(int i = 0; i <= ohjelmointi.getKurssinOpiskelijat().size()-1;i++){
         Opiskelija o = ohjelmointi.getKurssinOpiskelijat().get(i);
         for(int id =0; id <= ohjelmointi.getKurssinSuoritukset().size()-1; id++){
             Suoritus s = ohjelmointi.getKurssinSuoritukset().get(id);
             if (o.getOpiskelija_id() == s.getOpiskelija_id()){
                     System.out.println("Opiskelija: " + o.getOpiskelija_id() +
                             " arvosana: " + s.getArvosana());
             }        
        }
    }
}

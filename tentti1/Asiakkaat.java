
package tentti1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
/**
 *
 * @author Suvi Lindholm
 */
public class Asiakkaat {
    
    // Luodaan arraylista
    ArrayList<Asiakas> kaikki_asiakkaat = new ArrayList<>();
    
    //Metodi asiakkaan lisäämiselle
    public boolean lisaaAsiakas(Asiakas o){
        kaikki_asiakkaat.add(o);
        return true;
    }
    
    //Metodi asiakkaan etsimiselle
    public String getAsiakas(String etsi){
        for (int i =0; i<kaikki_asiakkaat.size(); i++){
            if(kaikki_asiakkaat.get(i).nimi.equals(etsi)){
                System.out.println(kaikki_asiakkaat.get(i));
            }
            else
                System.out.println("Asiakasta ei loydy!");
        }
    } //return??
    
    //Metodi kaikkien asiakkaiden tulostamiselle (ei vain kanta-asiakkaita)
    public void tulostaAsiakkaat(){
        
         /*for (int i =0; i<kaikki_asiakkaat.size(); i++){
            kaikki_asiakkaat.get(i).kantaAsiakkuus.equals(true);
            System.out.println(kaikki_asiakkaat.get(i).nimi.equals());
        }*/
         
        Collections.sort(kaikki_asiakkaat);
        
        ListIterator<Asiakas> iterator = kaikki_asiakkaat.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pankkiautomaatti;
import java.util.Scanner;
/**
 *
 * @author Suvi
 */
public class Pankkiautomaatti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner lukija = new Scanner(System.in);
        Saastotili[] tilit = new Saastotili[10];
        
        //Tilit taulukkoon
        for(int i = 0; i<10; i++){
            tilit[i] = new Saastotili();
        }
        
        // Kysy käyttäjältä tilinumero
        System.out.println("Syota tilinumero (1-10):");
        int tilinro = lukija.nextInt();
        
        if(tilinro >=1 && tilinro <= 10){
        //Tulosta valikko ja kysy valinta
            System.out.println("Valitse toiminto");
            System.out.println("1. Saldo");
            System.out.println("2. Nosto");
            System.out.println("3. Talletus");
            System.out.println("4. Poistu");
            int vastaus = lukija.nextInt();
        
            switch(vastaus){
                case '1': tilit[tilinro -1].getSaldo();
                case '2': tilit[tilinro -1].teeNosto();
                case '3': tilit[tilinro -1].teeTalletus();
                case '4': break;
            }
        }
        
        }
           //En saanut vielä toimimaan oikein loppuun asti 
       
    }
    
}

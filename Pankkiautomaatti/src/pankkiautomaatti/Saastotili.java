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
public class Saastotili {
    private double saldo = 100;
    

    public Saastotili() {
    }
    public Saastotili(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void teeNosto(){
        Scanner lukija = new Scanner(System.in);
        System.out.println("Paljonko haluat nostaa?");
        double vastaus = lukija.nextDouble();
        this.saldo = (saldo - vastaus);
        System.out.println("Uusi saldo on " + saldo);
      
    }
    
    public void teeTalletus(){
        Scanner lukija = new Scanner(System.in);
        System.out.println("Paljonko haluat tallettaa?");
        double vastaus = lukija.nextDouble();
        this.saldo = (saldo + vastaus);
        System.out.println("Uusi saldo on " + saldo);
        
    }
    
}

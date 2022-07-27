/**
 *
 * @author Suvi
 */
public class PelihahmoMain {

    public static void main(String[] args) {
        
        Pelihahmo hahmo1 = new Pelihahmo();
        hahmo1.nimi = "Samuil";
        hahmo1.hahmoluokka.luokanNimi = "Velho";
        hahmo1.hahmoluokka.leveli = 23;
        hahmo1.hahmoluokka.erityisTaidot = "Parannus";
        hahmo1.sukupuoli = "mies";
        hahmo1.ika = 160;
        hahmo1.ase.ase = "Sauva";
        hahmo1.ase.vahinko = -35;
        hahmo1.ase.bonus = 20;
        
        
        System.out.println("nimi: " + hahmo1.nimi +
        "\nhahmoluokka: " + hahmo1.hahmoluokka.luokanNimi +
        "\nlevel: " + hahmo1.hahmoluokka.leveli + 
        "\nerityistaidot: " + hahmo1.hahmoluokka.erityisTaidot + 
        "\nsukupuoli: " + hahmo1.sukupuoli + 
        "\nika: " + hahmo1.ika  + 
        "\nase: " + hahmo1.ase.ase  + 
        "\nvahinko: " + hahmo1.ase.vahinko + 
        "\nbonus: " + hahmo1.ase.bonus);
    }
    
}

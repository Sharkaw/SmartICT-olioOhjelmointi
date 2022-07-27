public class Laiva {
    private String nimi;
    private String rakennusvuosi;

//Oletus muodostin
    public Laiva(){
        this.nimi = "";
        this.rakennusvuosi = "";
    }

    //muodostin
    public Laiva(String nimi, String rakennusvuosi){
        this.nimi = nimi;
        this.rakennusvuosi = rakennusvuosi;
    }

    //Getterit
    String haeNimi(){
        return nimi;
    }

    String haeRakennusvuosi(){
        return rakennusvuosi;
    }

    //Setterit
    public void asetaNimi(String nimi) {
        this.nimi = nimi;
    }

    public void asetaRakennusvuosi(String rakennusvuosi) {
        this.rakennusvuosi = rakennusvuosi;
    }

    @Override
    public String toString() {
        
        return nimi + " " + "(" + rakennusvuosi + ")";
    }
    
}

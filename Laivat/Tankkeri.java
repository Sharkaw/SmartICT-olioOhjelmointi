public class Tankkeri extends Laiva {
    private int lasti;

    //muodostin
     public Tankkeri(int lasti){
        
        this.lasti = lasti;
    }
    
    //Setter
    public void asetaLasti(String lasti) {
        this.lasti = lasti;
    }
    
    //Getter
    String haeLasti(){
        return lasti;
    }
    
    @Override
    
    public String toString() {
        return nimi + " " + ", lastin maksimikoko on " + lasti;
    }
    
}

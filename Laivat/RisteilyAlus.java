

public class RisteilyAlus extends Laiva {
    private int matkustajaMaara;

    
    //muodostin
    public RisteilyAlus(int matkustajaMaara){
        
        this.matkustajaMaara = matkustajaMaara;
    }

    //Setter
    public void asetaMatkustajat(String matkustajaMaara) {
        this.matkustajaMaara = matkustajaMaara;
    }

    //Getter
    String haeMatkustajat(){
        return matkustajaMaara;
    }


    @Override
    public String toString() {
        
        return nimi + " " + ", matkustajamaara on " + matkustajaMaara;
    }
}

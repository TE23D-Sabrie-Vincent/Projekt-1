public class Beställning {

    private String KundNamn;
    private Hem bostad;
    private int antal;


    
    public Beställning(String KundNamn, Hem bostad, int antal){
        this.KundNamn = KundNamn;
        this.bostad = bostad;
        this.antal = antal;
    }

    public String getKundNamn(){
        return KundNamn;
    }

    public int getAntal(){
        return antal;
    }

    public int getTotalPris(){
        return bostad.beräknaHyra() * antal;
    }

    @Override
    public String toString(){
        return KundNamn + "  " + bostad.getNamn() + 
        " Antal: " + antal + 
        "Pris:" + getTotalPris() + "kr"; 
    }

}

// Representerar en beställning som görs av en kund.
// Kopplar samman kund, bostad och antal samt beräknar totalpris.
public class Beställning {

    private String KundNamn;
    private Hem bostad;
    private int antal;


    // Skapar en ny beställning
    public Beställning(String KundNamn, Hem bostad, int antal){
        this.KundNamn = KundNamn;
        this.bostad = bostad;
        this.antal = antal;
    }
    // Returnerar Kundnamn
    public String getKundNamn(){
        return KundNamn;
    }

    //Returnerar antal beställningar
    public int getAntal(){
        return antal;
    }

    // Returnerar det totala priset för beställningen
    public int getTotalPris(){
        return bostad.beräknaHyra() * antal;
    }

     // Returnerar en textrepresentation av beställningen så att det blir läsbart för användaren.
    @Override
    public String toString(){
        return KundNamn + "  " + bostad.getNamn() + 
        " Antal: " + antal + 
        "Pris: " + getTotalPris() + "kr"; 
    }

}

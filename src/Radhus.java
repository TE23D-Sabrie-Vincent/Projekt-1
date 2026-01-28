// Representerar en villa med tomstorlek.
public class Radhus extends Hem {

    private int tomt;

    // Skapar en Radhus med specifika egenskaper 
    public Radhus(String namn, String adress, int pris, int tomt){
        super(namn, adress, pris);
        this.tomt = tomt;
    }
    
    // Beräknar hyran baserat på tomtstorlek
    @Override 
    public int beräknaHyra(){
        return 4000 + (tomt * 5);
    }
}

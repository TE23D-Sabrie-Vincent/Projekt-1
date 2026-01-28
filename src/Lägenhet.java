// Representerar en lägenhet med storlek och antal våningar.
public class Lägenhet extends Hem {

    private int våning;
    private int storlek;

    // Skapar en lägenhet med specifika egenskaper 
    public Lägenhet(String namn, String adress, int pris, int våning, int storlek){
        super(namn, adress, pris);
        this.våning = våning;
        this.storlek = storlek;
    }

    // Beräknar hyran baserat på storlek och våningar
    @Override
    public int beräknaHyra() {
        return (storlek * 8 ) + (våning * 200);
    }
}

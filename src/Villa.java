// Representerar en villa med tomtstorlek och antal våningar.
public class Villa extends Hem {
        
    private int tomtstorlek;
    private int våningar;

    // Skapar en villa med specifika egenskaper 
    public Villa(String namn, String adress, int pris, int tomtstorlek, int våningar){
        super(namn, adress, pris);
        this.tomtstorlek = tomtstorlek;
        this.våningar = våningar;
    }

    // Beräknar hyran baserat på tomtstorlek och våningar
    @Override
    public int beräknaHyra(){
        return (tomtstorlek * 10) + (våningar * 1000);
    }
}

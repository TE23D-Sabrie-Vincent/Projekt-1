// Representerar en garage med bilplatser.
public class Garage extends Hem {

    private int bilplatser;

    // Skapar en garage med specefika egenskaper (i detta fall bilplatser)
    public Garage(String namn, String adress, int pris, int bilplatser) {
        super(namn, adress, pris);
        this.bilplatser = bilplatser;
    }

    // Beräknar hyran baserat på bilplatser
    @Override
    public int beräknaHyra() {
        return (bilplatser * 1500);
    }
}

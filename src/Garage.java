public class Garage extends Hem {

    private int bilplatser;

    public Garage(String namn, String adress, int pris, int bilplatser) {
        super(namn, adress, pris);
        this.bilplatser = bilplatser;
    }

    @Override
    public int beräknaHyra() {
        return (bilplatser * 1500);
    }
}

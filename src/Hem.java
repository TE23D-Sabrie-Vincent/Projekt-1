import java.util.ArrayList;

public class Hem {

    protected String namn;
    protected String adress;
    protected int pris;

    protected ArrayList<Beställning> beställningar;

    public Hem(String namn, String adress, int pris) {
        this.namn = namn;
        this.adress = adress;
        this.pris = pris;
        this.beställningar = new ArrayList<>();
    }

    public void läggBeställning(String kundNamn, int antal){
        Beställning beställ = new Beställning(kundNamn, antal);
        beställningar.add(beställ);
    }

    public int beräknaHyra(){
        return pris;
    }

    public String lisaBeställningar(){
        return "Antal beställningar: " + beställningar.size();
    }

    // public int getPris() {
    //     return pris;
    // }

    // @Override
    // public int beräknaHyra() {
    //     return antal * 500;
    // }

}

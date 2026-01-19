public class Lägenhet extends Hem {

    private int våning;
    private int storlek;


    public Lägenhet(String namn, String adress, int pris, int våning, int storlek){
        super(namn, adress, pris);
        this.våning = våning;
        this.storlek = storlek;
    }
}

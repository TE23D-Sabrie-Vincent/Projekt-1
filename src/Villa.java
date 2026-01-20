public class Villa extends Hem {
        
    private int tomtstorlek;
    private int våningar;

    public Villa(String namn, String adress, int pris, int tomtstorlek, int våningar){
        super(namn, adress, pris);
        this.tomtstorlek = tomtstorlek;
        this.våningar = våningar;
    }

    @Override
    public int beräknaHyra(){
        return (tomtstorlek * 10) + (våningar * 1000);
    }
}

public class Beställning {

    private String KundNamn;
    private int antal;

    public Beställning(String KundNamn, int antal){
        this.KundNamn = KundNamn;
        this.antal = antal;
    }

    public String getKundNamn(){
        return KundNamn;
    }

    public int getAntal(){
        return antal;
    }
}

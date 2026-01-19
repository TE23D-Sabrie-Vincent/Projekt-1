public class Kund {

    private String namn;

    public Kund(String namn){
        this.namn = namn;
    }

    public String getNamn(){
        return namn;
    }

    public String skapaBeställning(int antal){
        GUI gui = new GUI();
        return gui.läggBeställning(namn, antal);
    }

}

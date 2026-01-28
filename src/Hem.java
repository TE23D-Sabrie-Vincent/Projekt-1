// Basklass för alla typer av bostäder (parent klass).
// Innehåller gemensamma egenskaper och prislogik.
public class Hem {

    protected String namn;
    protected String adress;
    protected int pris;

    // Skapar ett hem med grundläggande information
    public Hem(String namn, String adress, int pris) {
        this.namn = namn;
        this.adress = adress;
        this.pris = pris;
    }

    // Beräknar hyran för bostaden (överskrivs i subklasser)
    public int beräknaHyra(){
        return pris;
    }

    // Returnerar bostadens namn
    public String getNamn() {
        return namn;
    }

}

public class GUI {
    public String läggBeställning(String kundNamn, int antal) {
        Beställning beställning = new Beställning(kundNamn, antal);
        Hem hem = new Hem(beställning.getAntal());
        int hyra = hem.beräknaHyra();

        return "Beställning klar för " + kundNamn +
                ". Total hyra: " + hyra + " kr";
    }

}

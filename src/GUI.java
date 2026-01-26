import java.util.ArrayList;
import java.util.Scanner;

public class GUI {
    // public String läggBeställning(String kundNamn, int antal) {
    // Beställning beställning = new Beställning(kundNamn, antal);
    // Hem hem = new Hem(beställning.getAntal());
    // int hyra = hem.beräknaHyra();

    // return "Beställning klar för " + kundNamn +
    // ". Total hyra: " + hyra + " kr";
    // }

    private Scanner scanner;
    private ArrayList<Hem> bostäder;
    private Hem valtHem;

    public GUI() {
        scanner = new Scanner(System.in);
        bostäder = new ArrayList<>();

        bostäder.add(new Villa("Villa i Freed", "Freed Gatan", 1500000, 800, 2));
        bostäder.add(new Radhus("Radhus eken", "Ekvägen 3", 20000, 40));
        bostäder.add(new Lägenhet("Lägenhet centrum", "Centrumvägen 18", 40000, 2, 50));
        bostäder.add(new Garage("Garage Nord", "Industrivägen 2", 10000, 3));
    }

    public void start() {
        boolean kör = true;

        while (kör) {
            System.out.println("1. Lägg beställning");
            System.out.println("2. Visa alla beställningar");
            System.out.println("3. Avsluta och lämna");

            try {
                int val = scanner.nextInt();
                scanner.nextLine();

                // Hem hem = bostäder.get(0);

                if (val == 1) {

                    System.out.println("Välj bostad: ");
                    for (int i = 0; i < bostäder.size(); i++) {
                        System.out.println(i + 1 + ". " + bostäder.get(i).getNamn());
                    }
                    int bostadsval = scanner.nextInt();
                    scanner.nextLine();

                    if (bostadsval < 1 || bostadsval > bostäder.size()) {
                        System.out.println("Ogiltigt val");
                        return;
                    }

                    valtHem = bostäder.get(bostadsval - 1);

                    System.out.println("kundnamn: ");
                    String namn = scanner.nextLine();

                    System.out.println("Antal: ");
                    int antal = scanner.nextInt();
                    scanner.nextLine();

                    valtHem.läggBeställning(namn, antal);
                    System.out.println("Beställning registrerad :D");

                } else if (val == 2) {
                    if (valtHem == null) {
                        System.out.println("Ingen bostad vald ännu");
                    } else {
                        System.out.println(valtHem.listaBeställningar());
                    }
                }

                else if (val == 3) {
                    kör = false;
                    System.out.println("Koden stängs ned");
                }

                else {
                    System.out.println("Skriv ett val 1-3");
                }

            } catch (Exception e) {
                System.out.println("Felaktig input");
                scanner.nextLine();
            }
        }

    }

}

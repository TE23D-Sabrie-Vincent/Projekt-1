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
    private Hem hem;

    public GUI() {
        scanner = new Scanner(System.in);
        hem = new Hem("Ditt hem blah bla blah", "Adress ohohahah", 5000);
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

                if (val == 1) {
                    System.out.println("kundnamn: ");
                    String namn = scanner.nextLine();

                    System.out.println("Antal: ");
                    int antal = scanner.nextInt();

                    hem.läggBeställning(namn, antal);
                    System.out.println("Beställning registrerad :D");

                } else if (val == 2) {
                    System.out.println(hem.lisaBeställningar());
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

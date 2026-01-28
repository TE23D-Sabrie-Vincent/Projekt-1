import java.util.ArrayList;
import java.util.Scanner;

    // Innehåller meny, inmatning, validering och presentation av resultat.
public class GUI {

    // Scanner för att läsa in användarens input
    private Scanner scanner = new Scanner(System.in);
    
    // Lista över tillgängliga bostäder som kan beställas
    private ArrayList<Hem> bostäder = new ArrayList<>();

    // Lista över alla gjorda beställningar, används för kunna visa alla beställningar som man lägger till i arrayen 
    private ArrayList<Beställning> beställningar = new ArrayList<>();
    private Hem valtHem;

    public GUI() {

        // Basically en konstruktor för att deklarera värden på variabler från varje child-klass extend från Hem.java
        bostäder.add(new Villa("Villa i Freed", "Freed Gatan", 1500000, 800, 2));
        bostäder.add(new Radhus("Radhus eken", "Ekvägen 3", 20000, 40));
        bostäder.add(new Lägenhet("Lägenhet centrum", "Centrumvägen 18", 40000, 2, 50));
        bostäder.add(new Garage("Garage Nord", "Industrivägen 2", 10000, 3));
    }

        // Startar programmets huvudloop och visar menyn, observera att det är void för att det ska inte returnera ett värde.
    public void start() {

        // Detta ska bestämma när loopen kör eller inte. Den börjar med true, men om man skriver 3 så avslutas koden med false.
        boolean kör = true;

        while (kör) {

            // Visar menyn som man ser i början
            System.out.println("1. Lägg beställning");
            System.out.println("2. Visa alla beställningar");
            System.out.println("3. Avsluta och lämna");
            System.out.println("4. Visa total vinst");


            try {
                int val = scanner.nextInt();
                scanner.nextLine();

                // Lägger till en ny beställning
                if (val == 1) {

                    // Visar valbara bostäder
                    System.out.println("Välj bostad: ");
                    for (int i = 0; i < bostäder.size(); i++) {
                        System.out.println(i + 1 + ". " + bostäder.get(i).getNamn());
                    }
                    int bostadsval = scanner.nextInt();
                    scanner.nextLine();

                    if (bostadsval < 1 || bostadsval > bostäder.size()) {
                        System.out.println("Ogiltigt val");
                        continue;
                    }

                    valtHem = bostäder.get(bostadsval - 1);

                     // Läser in kundens namn
                    System.out.println("kundnamn: ");
                    String namn = scanner.nextLine();

                     // Läser in antal beställningar
                    System.out.println("Antal: ");
                    int antal = scanner.nextInt();
                    scanner.nextLine();

                     // Skapar och lagrar beställningen
                    Beställning b = new Beställning(namn, valtHem, antal);
                    beställningar.add(b);
                    System.out.println("Beställning registrerad :D");

                } 
                // Skapar och lagrar beställningen
                else if (val == 2) {
                    if (beställningar.isEmpty()) {
                        System.out.println("Inga bostad vald ännu som kan visas");
                    } 
                    else 
                        {
                        for (Beställning b : beställningar) {
                            System.out.println(b);
                        }
                    }
                }

                // Avlsutar koden och deklarerar kör loopen false så att koden stängs ned
                else if (val == 3) {
                    kör = false;
                    System.out.println("Koden stängs ned");
                }

                // Visar total vinst
                else if (val == 4) {
                if (beställningar.isEmpty()) {
                    System.out.println("Inga pengar pga inga beställningar");
                }
                else{
                    int totalVinst = 0;

                    for (Beställning b : beställningar) {
                        totalVinst += b.getTotalPris();
                    }

                    System.out.println("Total vinst: " + totalVinst + " kr");
                }
            }

            // Fångar ogiltig input så att programmet inte kraschar
            } catch (Exception e) {
                System.out.println("Felaktig input, skriv 1-4");
                scanner.nextLine();
            }
            
        }

    }

}

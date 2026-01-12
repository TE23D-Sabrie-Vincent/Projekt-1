public class App {
    public static void main(String[] args) throws Exception {
        Kund kund = new Kund("Johan");
        String svar = kund.skapaBeställning(2);

        System.out.println(svar);
    }
}

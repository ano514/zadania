package zaklady;

public class Obdlznik {
    public static void main(String args[]) {
        double sirka = 5.6;
        double viska = 8.5;
        double obsah = sirka * viska;
        double obvod = 2 * (sirka + viska);
        System.out.println("Obsah je "+sirka+" * "+viska+" = "+obsah);
        System.out.println("Obvod je 2*("+sirka+" + "+viska+")"+" = "+obvod);

    }
}

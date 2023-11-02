package zadania;

import java.util.Random;
/*Program by sa dal rozšíriť o funkciu, ktorá by počítala celkovú úrodu na farme. Táto funkcia by sa dala implementovať nasledovne:
Očakávaný výstup:
Počet plodín: 50
Typ plodiny: ovocie
Úroda na jednu plodinu: 75.50 kg
Celková úroda: 3775 kg*/
public class farma_v2 {
    public static void main(String args[]) {
        Random r = new Random();
        int plodini = r.nextInt(100) + 1;
        double uroda_na_jednu_plodinu = r.nextDouble(100);
        double zaokruhleniena2 = Math.round(uroda_na_jednu_plodinu * 100.0) / 100.0;
        String[] typy = {"ovocie", "zelenina", "obilnina"};
        double celkova_uroda = zaokruhleniena2 * plodini;
        double zaokruhleniena22 = Math.round(celkova_uroda * 100.0) / 100.0;
        int poradie = r.nextInt(typy.length);
        System.out.println("Pocet plodin: " + plodini);
        System.out.println("Typ plodini: " + typy[poradie]);
        System.out.println("Úroda na jednu plodinu: " + zaokruhleniena2 + " kg");
        System.out.println("Celkova uroda: "+ zaokruhleniena22+" kg");
    }
}

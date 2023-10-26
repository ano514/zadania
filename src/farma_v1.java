import java.util.Random;

/*Zadanie1 - Farma v1 (základy -  údajové typy)
Napíšte program v jazyku Java, ktorý bude generovať náhodné údaje o úrode na farme. Program by mal generovať nasledujúce údaje:
Počet plodín: od 1 do 100
Typ plodiny: ovocie, zelenina alebo obilnina
Úroda na jednu plodinu: od 0 do 100 kg

Očakávaný výstup:
Počet plodín: 50
Typ plodiny: ovocie
Úroda na jednu plodinu: 75.50 kg

Možné pod úlohy a rozšírenia:
Program by sa dal rozšíriť o nasledujúce funkcie:
Možnosti generovania: Program by mohol ponúkať možnosti na výber typu plodiny a rozsahu úrody.
Správa chýb: Program by mal byť vybavený mechanizmom na správu chýb, napríklad ak sa vygeneruje počet plodín mimo rozsahu.
Grafické rozhranie: Program by mohol byť vybavený grafický rozhraním, ktoré by uľahčilo používanie.*/
public class farma_v1 {
    public static void main(String args[]) {
        Random r = new Random();
        int plodini = r.nextInt(100)+1;
        double uroda_na_jednu_plodinu = r.nextDouble(100);
        double zaokruhleniena2 = Math.round(uroda_na_jednu_plodinu * 100.0) / 100.0;
        String[] typy = {"ovocie","zelenina","obilnina"};
        int poradie = r.nextInt(typy.length);
        System.out.println("Pocet plodin: "+plodini);
        System.out.println("Typ plodini: "+typy[poradie]);
        System.out.println("Úroda na jednu plodinu: "+zaokruhleniena2+" kg");


    }
}

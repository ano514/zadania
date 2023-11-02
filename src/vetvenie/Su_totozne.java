package vetvenie;

import java.util.Scanner;

/*6. Napíšte program, ktorý načíta dve čísla s desatinnou čiarkou a otestuje, či
sú rovnaké až na tri desatinné miesta.
Testovacie údaje
Zadaj 1. číslo: 25.586
Zadaj 2. číslo: 25.589
Očakávaný výstup :
Sú odlišné*/
public class Su_totozne {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadaj 1. cislo na 3 desatine ciarky: ");
        double a = s.nextDouble();
        System.out.println("Zadaj 2. cislona na 3 desatine ciarky: ");
        double b = s.nextDouble();
        if (a==b){
            System.out.println("Su totozne");
        }
        else{
            System.out.println("Nie su totzne");
        }
    }
}

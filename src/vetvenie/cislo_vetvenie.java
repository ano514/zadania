package vetvenie;/*1. Napíšte program, tak aby ste získali od používateľa číslo a následne zistili
či je kladné alebo záporné.
Vstupné číslo testovacích údajov : 35
Očakávaný výstup :
Číslo je kladné*/
import java.util.Scanner;

public class cislo_vetvenie {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadajte cislo: ");
        int cislo=s.nextInt();
        if( cislo>=0){
            System.out.println("Cislo je kladne");
        }
        else{
            System.out.println("Cislo je zaporne");
        }
    }
}

package metody;

import java.util.Scanner;
/*2. Napíšte metódu na výpočet priemeru troch čísel.
Údaje testu:
Zadajte prvé číslo: 25
Zadajte druhé číslo: 45
Zadajte tretie číslo: 65
Očakávaný výstup:
Priemerná hodnota je 45.0*/
public class cisla2 {
    public static void  priemer(int cislo1,int cislo2,int cislo3){
        int priemer=(cislo1+cislo2+cislo3)/3;
        System.out.println("Priemerná hodnota je "+priemer);
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadajte prvé číslo:");
        int a = s.nextInt();
        System.out.println("Zadajte druhé číslo:");
        int b = s.nextInt();
        System.out.println("Zadajte tretie číslo:");
        int c = s.nextInt();
        priemer(a,b,c);
    }
}

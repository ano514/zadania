package vetvenie;

import java.util.Scanner;

/*4. Napíšte program, ktorý prečíta číslo s desatinnou čiarkou a výpiše "nula", ak
je číslo nula. V opačnom prípade výpise „pozitívne číslo“ alebo „negatívne
číslo“. Pridajte „malé“, ak je absolútna hodnota čísla menšia ako 1, alebo
„veľké“, ak je väčšia 1 000 000.
Testovacie dáta
Zadajte číslo: 25
Očakávaný výstup :
Vstupná hodnota: 25
Kladné číslo*/
public class ake_cislo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("zadajte cislo: ");
        double cislo=s.nextInt();
        System.out.println("Vstupna hodnota: "+cislo);
        if (cislo==0){
            System.out.println("nula");
        }
        else if(cislo>0){
            System.out.println("kladne cislo");
        }
        else if(cislo<0){
            System.out.println("zaporne cislo");

        }
        if(cislo<1){
            System.out.println("male");
        }
        else if(cislo>1000000){
            System.out.println("velke");
        }
    }
}

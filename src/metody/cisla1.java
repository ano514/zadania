package metody;

import java.util.Scanner;

/*1. Napíšte metódu na nájdenie najmenšieho čísla medzi tromi číslami.
Údaje testu:
Zadajte prvé číslo: 25
Zadajte druhé číslo: 37
Zadajte tretie číslo: 29
Očakávaný výstup:
Najmenšia hodnota je 25.0*/
public class cisla1 {
    public static void  najmensi(int cislo1,int cislo2,int cislo3){
        boolean a1=cislo1<cislo2;
        boolean a2=cislo1<cislo3;
        boolean a3=cislo2<cislo3;
        if (a1==true&&a2==true){
            System.out.println("Najmenšia hodnota je "+cislo1);
        }
        else if(a1==false&&a3==true){
            System.out.println("Najmenšia hodnota je "+cislo2);
        }
        else{
            System.out.println("Najmenšia hodnota je "+cislo3);
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadajte prvé číslo:");
        int a = s.nextInt();
        System.out.println("Zadajte druhé číslo:");
        int b = s.nextInt();
        System.out.println("Zadajte tretie číslo:");
        int c = s.nextInt();
        najmensi(a,b,c);
    }
}

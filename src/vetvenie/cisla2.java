package vetvenie;

import java.util.Scanner;

public class cisla2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadaj cislo: ");
        int cislo= s.nextInt();
        int sucet=0;
        System.out.println("Prvých n prirodzených čísel je: "+cislo);
        for(int i = 1;i<=cislo;i++){
            System.out.println(i);
            sucet=sucet+i;
        }
        System.out.println("Súčet prirodzených čísel až do n členov:");
        System.out.println(sucet);
    }
}

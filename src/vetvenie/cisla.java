package vetvenie;

import java.util.Scanner;

public class cisla {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("zadaj kolko a cim sa bude pocitat");
        int cislo=s.nextInt();
        for(int i=0;i<=cislo;i++){
            int sucet=cislo*i;
            System.out.println(cislo+" * "+i+" = "+sucet);
        }
    }
}

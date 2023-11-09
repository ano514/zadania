package vetvenie;

import java.util.Scanner;

public class cisla3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadaj 5 cisel");
        String cisla=s.next();
        int sucet=0;
        System.out.println("Zadané 5 čísla:");
        for (int i=0;i<=10;i++){
            if (i%2==0){
                System.out.println(cisla.substring(i));
                sucet += Integer.valueOf(cisla.substring(i));
            }
            System.out.println("Sucet je: "+sucet);
            System.out.println("Priemer je: "+(sucet/5));

        }
    }
}

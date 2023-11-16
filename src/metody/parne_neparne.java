package metody;

import java.util.Scanner;

public class parne_neparne {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("vloz cislo");
        int cislo=s.nextInt();
        parne_neparne2.Parne_alebo_nie(cislo);

    }



}


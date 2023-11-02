package zadania;

import java.util.Scanner;

public class automobily {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Znacka automobilu: ");
        String znacka = s.next();
        System.out.println("Model automobilu: ");
        String model= s.next();
        System.out.println("Spotreba litrov na 100km: ");
        int spotreba = s.nextInt();
    }
}

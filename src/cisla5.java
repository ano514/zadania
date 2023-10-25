import java.util.Scanner;

public class cisla5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zdajate prve cislo");
        int cislo1=in.nextInt();
        System.out.println("Zdajate druhe cislo");
        int cislo2=in.nextInt();
        System.out.println("Zdajate tretie cislo");
        int cislo3=in.nextInt();
        double vypocet=(cislo1+cislo2+cislo3)/3;
        System.out.println(vypocet);

    }
}

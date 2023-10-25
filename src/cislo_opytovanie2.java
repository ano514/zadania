import java.util.Scanner;

public class cislo_opytovanie2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zadaj prve cislo");
        int cislo1 = in.nextInt();
        System.out.println("Zadaj druhe cislo");
        int cislo2 = in.nextInt();
        int plus = cislo1 + cislo2;
        System.out.println(plus);
        int minus = cislo1 - cislo2;
        System.out.println(minus);
        int krat = cislo1 * cislo2;
        System.out.println(krat);
        int deleno = cislo1 / cislo2;
        System.out.println(deleno);
        int mod = cislo1 % cislo2;
        System.out.println(mod);
    }
}

import java.util.*;

public class cisla_opytanie {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zadaj prve cislo");
        int cislo1 = in.nextInt();
        System.out.println("Zadaj druhe cislo");
        int cislo2 = in.nextInt();
        int krat = cislo1*cislo2;
        System.out.println(krat);

    }
}

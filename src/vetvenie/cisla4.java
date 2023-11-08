package vetvenie;
/**/
import java.util.Scanner;

public class cisla4 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("zadaj cislo");
        int cislo=s.nextInt();
        for (int i=1;i<=cislo;i++){
            System.out.println("Cislo je :"+cislo+" Kocka "+cislo+" je :"+(cislo*cislo*cislo));
        }
    }
}

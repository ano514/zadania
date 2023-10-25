import java.util.Scanner;

public class nasobilka {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zadaj cislo");
        int cislo1 = in.nextInt();
        for (int i=1;i<=10;i++){
            int nasobok= cislo1 * i;
            String priklad=String.valueOf(cislo1)+"x"+String.valueOf(i)+"="+String.valueOf(nasobok);
            System.out.println(priklad);


        }
    }
}

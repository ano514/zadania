package vetvenie;

import java.util.Scanner;

public class cisla5 {
    public static void main(String args[]) {
        Scanner s =new Scanner(System.in);
        System.out.println("Zadaj neparne prirodzene cislo");
        int cislo=s.nextInt();
        int sucet=0;
        for(int i=1;i<=(cislo*2);i++){
            if(i%2!=0){
                sucet=sucet+(i);
                System.out.println(i);
            }
        }
        System.out.println("Sucet neprirodenich cisel az do "+cislo+" je: "+sucet);
    }
}

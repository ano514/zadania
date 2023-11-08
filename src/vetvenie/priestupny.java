package vetvenie;

import java.util.Scanner;

public class priestupny {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadaj Rok");
        int rok=s.nextInt();
        if(rok%4==0||rok%400==0){
            System.out.println("Rok "+rok+" je pirestupny");
        }
        else{
            System.out.println("Rok "+rok+" nie je pirestupny");
        }
    }
}

package zaklady;

import java.util.Scanner;

public class kruh {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zadaj polomer kruhu");
        double polomer = in.nextDouble();
        double obvod= 2* Math.PI * polomer;
        double obsah = Math.PI * (polomer * polomer) ;
        System.out.println("obvod = "+obvod);
        System.out.println("obsha = "+obsah);

    }
}

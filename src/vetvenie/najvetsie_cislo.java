package vetvenie;
/*3. Vezmite od používateľa tri čísla a vypíšte najväčšie číslo.
Testovacie údaje
Zadajte 1. číslo: 25
Zadajte 2. číslo: 78
Zadajte 3. číslo: 87
Očakávaný výstup :
Najväčšie číslo: 87*/

import java.util.Scanner;

public class najvetsie_cislo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("napiste 1. cislo: ");
        int a=s.nextInt();
        System.out.println("napiste 2. cislo: ");
        int b = s.nextInt();
        System.out.println("napiste 3. cislo: ");
        int c = s.nextInt();
        boolean a1= a<b;
        boolean a2 = a<c;
        boolean a3 = b<c;
        if (a1==false&&a2==false){
            System.out.println(a);
        }
        else if(a1==true&&a3==false){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }


    }
}

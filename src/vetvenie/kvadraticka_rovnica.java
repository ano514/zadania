package vetvenie;

import java.util.Scanner;

/*2. Napíšte program na riešenie kvadratických rovníc (použite if, else if a else).
Pomôcka: 𝑥1,2 = −𝑏±√𝐷
2𝑎 ; 𝐷 = 𝑏2 − 4𝑎𝑐
Vstup testovacích údajov
Vstup a: 1
Vstup b: 5
Vstup c: 1
Očakávaný výstup :
Korene sú -0,20871215252208009 a -4,7912878474779195*/
public class kvadraticka_rovnica {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Vstup a: ");
        int a = s.nextInt();
        System.out.println("Vstup b: ");
        int b = s.nextInt();
        System.out.println("Vstup c: ");
        int c = s.nextInt();
        double d = (b*b)-4*a*c;
        double x1= (-b+Math.sqrt(d))/2*a;
        double x2= (-b-Math.sqrt(d))/2*a;
        System.out.println("Korene su "+x1+" a "+x2);

    }
}

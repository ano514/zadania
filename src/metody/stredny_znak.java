package metody;

import java.util.Scanner;
/*3. Napíšte metódu na zobrazenie stredného znaku reťazca.
Poznámka:
a) Ak je dĺžka reťazca nepárna, bude tam jeden stredný znak.
b) Ak je dĺžka reťazca párna, budú tam dva stredné znaky.
Testovacie údaje:
Zadajte reťazec: 350
Očakávaný výstup:
Stredný znak v reťazci: 5*/
public class stredny_znak {
    public static void stredny(String retazec){
        if (retazec.length()%2==0){
            System.out.println("Stredný znak v reťazci:"+retazec.substring(retazec.length()/2-1,retazec.length()/2)+" a "+retazec.substring(retazec.length()/2,retazec.length()/2+1));
        }
        else{
            System.out.println("Stredný znak v reťazci:"+retazec.substring(retazec.length()/2,retazec.length()/2+1));
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadajte retazec: ");
        String retazec = s.next();
        stredny(retazec);

    }
}

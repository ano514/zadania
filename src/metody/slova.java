package metody;

import java.util.Scanner;

/*Napíšte metódu na počítanie všetkých slov v reťazci.
Testovacie údaje:
Zadajte reťazec: Kto nevie byť spokojný s málom, nebude spokojný nikdy.
Očakávaný výstup:
Počet slov v reťazci: 9*/
public class slova {
    public static void kolko_slov(String retazec){
        int slova=0;
        for (int i=0;i<retazec.length();i++){
            if (Character.toString(retazec.charAt(i)).equals(" ")){
                slova+=1;
            }
        }
        slova+=1;
        System.out.println("Počet slov v reťazci: "+slova);

    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadajte retazec: ");
        String retazec = s.nextLine();
        kolko_slov(retazec);
    }
}

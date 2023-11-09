package metody;

import java.util.Scanner;

/*4. Napíšte metódu na počítanie všetkých samohlások v reťazci.
Testovacie údaje:
Zadajte reťazec: Odvaha
Očakávaný výstup:
Počet samohlások v reťazci: 3*/
public class samohlaska {
    public static  void kolko(String retazec){
        String[] samohlasky={"a","A", "e","E", "i","I", "o","O", "u","U"};
        int kolko=0;
        for (int i=0;i<retazec.length();i++){
            for (int j =0;j<samohlasky.length;j++){
                if(Character.toString(retazec.charAt(i)).equals(samohlasky[j])){
                    kolko+=1;
                }
            }
        }
        System.out.println("Počet samohlások v reťazci: "+kolko);
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadajte retazec: ");
        String retazec = s.next();
        kolko(retazec);
    }
}

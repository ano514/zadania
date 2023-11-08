package vetvenie;
/*
8. Napíšte program, ktorý používateľovi poskytne jeden znak z
abecedy. Vypíšte samohlásku alebo spoluhlásku v závislosti od vstupu
používateľa. Ak používateľský vstup nie je písmeno (medzi a, z alebo A, Z),
alebo ide o reťazec s dĺžkou > 1, vypíšte chybové hlásenie.
Testovacie údaje
Zadajte písmeno abecedy: p
Očakávaný výstup :
Zadané písmeno je spoluhláskové*/
import java.util.Scanner;

public class abeceda {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String[] samohlasky={"a","A","e","E","i","I","o","O","u","U"};
        String[] abeceda = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        System.out.println("Zadaj pismeno: ");
        String pismeno=s.next();
        Boolean zhoda=false;
        Boolean pismenoaha=true;
        for (int i=0;i<=abeceda.length;i++){
            if(pismeno.equals(abeceda[i])){
                pismenoaha=true;
            }
            else {
                pismenoaha=false;
            }
        }
        if (pismeno.length()>1){
            System.out.println("Zadal si slovo nie pismeno");
        }

        else if(pismenoaha.equals(false)){
            System.out.println("Zadal si cislo nie pismeno");

        }
        else {
            for (int i = 0; i <= samohlasky.length; i++) {
                if (pismeno.equals(samohlasky[i])) {
                    zhoda = true;
                }
            }
            if (zhoda.equals(true)) {
                System.out.println("Zadane pismeno je samohlaska");
            } else {
                System.out.println("Zadane pismeno je spoluhlska");
            }
        }
        }


}

package vetvenie;
/*Očakávaný výstup :
Vstupná hodnota: 25
Kladné číslo
5. Napíšte program, ktorý načíta číslo od používateľa a vygeneruje celé číslo
medzi 1 a 7 a zobrazí názov dňa v týždni.
Testovacie údaje
Vstupné číslo: 3
Očakávaný výstup :
Streda*/
import java.util.Scanner;

public class generovanie_dna {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("1 do 7");
        System.out.println("zadaj cislo");
        int a=s.nextInt();
        if (a==1){
            System.out.println("pondelok");
        }
        else if(a==2){
            System.out.println("utorok");
        }
        else if(a==3){
            System.out.println("streda");
        }
        else if(a==4){
            System.out.println("stvrtok");
        }
        else if(a==5){
            System.out.println("piatok");
        }
        else if(a==6){
            System.out.println("sobota");
        }
        else if(a==7){
            System.out.println("nedela");
        }
    }
}

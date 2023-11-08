package vetvenie;

import java.util.Scanner;

/*7. Napíšte program na zistenie počtu dní v mesiaci.
Testovacie dáta
Zadaj číslo mesiaca: 2
Zadaj rok: 2022
Očakávaný výstup :
Február 2022 má 29 dní*/
public class mesiace {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Zadaj cislo mesiaca: ");
        int mesiac=s.nextInt();
        String[] mesiace={"Januar","Februar","Marec","April","Maj","Jun","Jul","August","September","Oktober","November","Decembre"};
        System.out.println("Zadaj rok: ");
        int rok = s.nextInt();
        int dni;
        if (mesiac==2){
            if(rok%4==0||rok%400==0){
                dni = 28;
            }
            else{
                dni=29;
            }
        }
        else if (mesiac==4||mesiac==6||mesiac==11||mesiac==9){
            dni=31;
        }
        else{
            dni=30;
        }
        System.out.println(mesiace[mesiac]+rok+" ma "+dni+" dni.");

    }
}

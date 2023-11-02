import java.util.Scanner;
import java.util.SplittableRandom;

/*Napíšte program v jazyku Java, ktorý bude simulovať rezerváciu izby v hoteli. Program by mal spĺňať nasledujúce požiadavky:
Užívateľ by mal byť schopný zadať údaje o rezervácii, vrátane typu izby, počtu izieb, dátumu príchodu a odchodu a počtu osôb.
Program by mal vypočítať celkovú cenu rezervácie.
Program by mal vytlačiť potvrdenie rezervácie.

Výstup:
Typ izby: jednolôžková
Počet izieb: 1
Dátum príchodu: 2023-10-12
Dátum odchodu: 2023-10-14
Počet osôb: 1
Celková cena: 150*/
public class hotel {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String[] typi={"Jednolozkovy","Dvojlozkovy","Dvojlozkovy luxusny","Trojlozkovy","Trojlozkovy luxusny"};
        System.out.println("Typy izbi su: Jednolozkovy, Dvojlozkovy, Dvojlozkovy luxusny, Trojlozkovy , Trojlozkovy luxusny");
        System.out.println("Napis typ izbi: ");
        String typ_izby=s.next();
        int cena_izby_na_jednu_osobu_a_jednu_noc = 0;
        int celkova_cena=0;
        if (typ_izby==typi[0]) {
            cena_izby_na_jednu_osobu_a_jednu_noc = 75;
        }
        else if (typ_izby==typi[1]) {
            cena_izby_na_jednu_osobu_a_jednu_noc = 90;
        }
        else if (typ_izby==typi[2]) {
            cena_izby_na_jednu_osobu_a_jednu_noc = 115;
        }
        else if (typ_izby==typi[3]) {
            cena_izby_na_jednu_osobu_a_jednu_noc = 100;
        }
        else if (typ_izby==typi[4]) {
            cena_izby_na_jednu_osobu_a_jednu_noc = 180;
        }

        System.out.println("Napis kolko osob: ");
        int osoby=s.nextInt();
        System.out.println("Dátum príchodu: ");
        String prichod=s.next();
        int mesiac_prichod = Integer.valueOf(prichod.substring(5,7));
        int den_prichod = Integer.valueOf(prichod.substring(8,10));
        System.out.println("Kolko izieb: ");
        int izby=s.nextInt();
        System.out.println("Dátum odchodu: ");
        String odchod=s.next();
        int mesiac_odchod= Integer.valueOf(odchod.substring(5,7));
        int den_odchod = Integer.valueOf(odchod.substring(8,10));
        if (mesiac_odchod==mesiac_prichod){
            int dni=den_odchod-den_prichod;
            celkova_cena=cena_izby_na_jednu_osobu_a_jednu_noc*dni;
            celkova_cena*=osoby;
            celkova_cena*=izby;


        }
        else if(mesiac_odchod!=mesiac_prichod){
            int mesiace_dni=0;
            int mesiace_dni1=0;
            if(mesiac_odchod==2 || mesiac_prichod==2){
                mesiace_dni1=29;
            }
            mesiace_dni=(mesiac_odchod-mesiac_prichod)*31+mesiace_dni1;
            int dni=(den_odchod-den_prichod)+mesiace_dni;
            celkova_cena=cena_izby_na_jednu_osobu_a_jednu_noc*dni;
            celkova_cena*=osoby;
            celkova_cena*=izby;
        }
        System.out.println("Typ izbi: "+typ_izby);
        System.out.println("Pocet izieb: "+izby);
        System.out.println("Datum prichodu: "+prichod);
        System.out.println("Datum odchodu: "+odchod);
        System.out.println("Pocet osob: "+osoby);
        System.out.println("Celkova cena: "+celkova_cena);
    }
}

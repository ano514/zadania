package poymorfizmus.upcasting;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Utvar t = new Utvar();
        Scanner s = new Scanner(System.in);
        System.out.println("1=trojholnik 2=Kruh 3=obdloznik");
        int i = s.nextInt();
        if (i==1){
            t = new Trojholnik();
            t.kreslit();
        } else if (i==2) {
            t= new Kruh();
            t.kreslit();

        } else if (i==3) {
            t= new obdĺžnik();
            t.kreslit();
        }

    }
}

package metody;

import java.util.Scanner;

public class geterySetery2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = 1;
        geterySetery obj = new geterySetery();
        geterySetery obj2 = new geterySetery();
        geterySetery obj3 = new geterySetery();
        System.out.println("vloz prve meno");
        String meno1=s.next();
        obj.setMeno(meno1);
        obj.setId(a);
        a+=1;
        obj.zobraz();


        System.out.println("vloz druhe meno");
        String meno2=s.next();
        obj2.setMeno(meno2);
        obj2.setId(a);
        a+=1;
        obj2.zobraz();

        System.out.println("vloz tretie meno");
        String meno3=s.next();
        obj3.setMeno(meno3);
        obj3.setId(a);
        obj3.zobraz();



    }
}

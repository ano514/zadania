package polia;

public class ZubatePole {
    public static void main(String args[]) {
        char[] zdroj_pole={'p','r','e','p','r','a','c','o','v','a','n','y'};
        char[] ciel_pole = new char[7];

        System.arraycopy(zdroj_pole,2,ciel_pole,0,7);

        System.out.println(String.valueOf(ciel_pole));
    }
}

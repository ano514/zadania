package poymorfizmus.upcasting;

public class Elektrobicykel extends Bicykel {
    void jazdit(){System.out.println("Jazdí do vzdialenosti 60km!");}
    int max_rychlost=60;

    public static void main(String[] args) {
        Bicykel b = new Elektrobicykel();
        b.jazdit();
        System.out.println(b.max_rychlost);
    }
}

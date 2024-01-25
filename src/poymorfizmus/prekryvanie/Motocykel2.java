package poymorfizmus.prekryvanie;

public class Motocykel2 extends Vozidlo1{
    void jazdit(){System.out.println("MOtocykel sa pohybujr bezpecne");}

    public static void main(String[] args) {
        Motocykel2 obj= new Motocykel2();
        obj.jazdit();
    }
}

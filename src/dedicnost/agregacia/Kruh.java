package dedicnost.agregacia;

public class Kruh {
    Agregacia op;
    double pi=3.14;
    double obsah(int polomer){
        op = new Agregacia();

        int mocnina= op.umocnenie(polomer);
        return pi*mocnina;
    }

    public static void main(String[] args) {
        Kruh k=new Kruh();
        double vyseldok=k.obsah(5);
        System.out.println(vyseldok);

    }
}

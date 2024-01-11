package dedicnost.jedlo;

public class Ovocie extends Rastlina{
    private String nazov;
    private String odroda;

    Ovocie(String jedlo, int kalorie, double tuk, String typ_rastlini, String nazov, String odroda) {
        super(jedlo, kalorie, tuk, typ_rastlini);
        this.nazov=nazov;
        this.odroda=odroda;
    }

    public void vipis2() {
        vipis1();
        System.out.println(nazov + " " + odroda);

    }
}

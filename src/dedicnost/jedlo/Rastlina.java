package dedicnost.jedlo;

public class Rastlina extends Jedlo {
    private String typ_rastlini;

    Rastlina(String jedlo, int kalorie, double tuk,String typ_rastlini) {
        super(jedlo, kalorie, tuk);
        this.typ_rastlini=typ_rastlini;
    }
    public void vipis1(){
        vipis();
        System.out.println(typ_rastlini);
    }
}

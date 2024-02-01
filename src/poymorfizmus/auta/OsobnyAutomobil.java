package poymorfizmus.auta;

public class OsobnyAutomobil extends Automobil{
    private int pocet_miest;
    private int pocet_dveri;
    OsobnyAutomobil(String znacka, String model, int rok_vyroby, String fraba,int pocet_miest,int pocet_dveri) {
        super(znacka, model, rok_vyroby, fraba);
        this.pocet_miest = pocet_miest;
        this.pocet_dveri = pocet_dveri;
    }

    @Override
    void vypis() {
        super.vypis();
        System.out.println(pocet_miest+"miest"+" "+pocet_dveri+"dveri");
    }
}

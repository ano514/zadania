package poymorfizmus.auta;

public class NakladnyAutomobil extends Automobil {
    private int nosnost;
    private int objem_nakladoveho_priestoru;

    NakladnyAutomobil(String znacka, String model, int rok_vyroby, String fraba, int nosnost, int objem_nakladoveho_priestoru) {
        super(znacka, model, rok_vyroby, fraba);
        this.nosnost = nosnost;
        this.objem_nakladoveho_priestoru = objem_nakladoveho_priestoru;
    }

    @Override
    void vypis() {
        super.vypis();
        System.out.println(nosnost+"kg"+" "+objem_nakladoveho_priestoru+"m3");
    }
}

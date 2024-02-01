package poymorfizmus.auta;

public class Automobil {
    private String znacka;
    private String model;
    private int rok_vyroby;
    private String fraba;
    Automobil(String znacka,String model,int rok_vyroby,String fraba){
        this.znacka = znacka;
        this.model = model;
        this.rok_vyroby = rok_vyroby;
        this.fraba = fraba;
    }
    void vypis(){
        System.out.print(znacka+" "+model+" "+rok_vyroby+" "+fraba+" ");
    }

}

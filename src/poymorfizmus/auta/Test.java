package poymorfizmus.auta;

public class Test {
    public static void main(String[] args) {
        Automobil garaz[] = new Automobil[5];
        Automobil citroen = new NakladnyAutomobil("Citroen","Jumper",2008,"Biela",200,1000);
        Automobil mercedes = new NakladnyAutomobil("Mercedes","Sprinter",2017,"Siva",500,800);
        Automobil skoda = new OsobnyAutomobil("Skoda","Octavia",2006,"Zlta",4,5);
        Automobil Lamborgini = new OsobnyAutomobil("Lamborgini","countach",1974,"Zlta",2,2);

        garaz[0]=citroen;
        garaz[1]=mercedes;
        garaz[2]=skoda;
        garaz[3]=Lamborgini;
        for(Automobil a:garaz){
            a.vypis();

        }





    }
}

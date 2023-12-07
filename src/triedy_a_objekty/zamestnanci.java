package triedy_a_objekty;

public class zamestnanci {
    public static void main(String[] args) {
        Zamestnanec zam= new Zamestnanec(1,"Martin",500.25);
        Zamestnanec zam2= new Zamestnanec(2,"Michal",1000.50);
        Zamestnanec zam3= new Zamestnanec(3,"Peter",0.01);
        zam.inicializacia(1,"Martin",500.25);
        zam2.inicializacia(2,"Michal",1000.50);
        zam3.inicializacia(3,"Peter",0.01);
        zam.vipis();
        zam2.vipis();
        zam3.vipis();
        Zamestnanec zam4= new Zamestnanec(4,"MartinM",555.25);
        Zamestnanec zam5= new Zamestnanec(5,"MichalT",3000.50);
        Zamestnanec zam6= new Zamestnanec(6,"PeterK",0.001);
        zam4.vipis();
        zam5.vipis();
        zam6.vipis();

    }
}

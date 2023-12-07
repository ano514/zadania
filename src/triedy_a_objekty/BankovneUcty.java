package triedy_a_objekty;

public class BankovneUcty {
    public static void main(String[] args) {
        BakovnyUcet ban1= new BakovnyUcet(0,"",0);
        BakovnyUcet ban2= new BakovnyUcet(501,"Michal",500);
        BakovnyUcet ban3= new BakovnyUcet(892,"David",10);
        ban1.naplnUcet(256,"Martin",50);
        ban1.kontrolujZostatok();
        ban2.kontrolujZostatok();
        ban3.kontrolujZostatok();
        ban1.vloz(100);
        ban2.vloz(0.5);
        ban3.vloz(5.23);
        ban1.kontrolujZostatok();
        ban2.kontrolujZostatok();
        ban3.kontrolujZostatok();
        ban1.vyber(500);
        ban2.vyber(30.5);
        ban3.vyber(10);
        ban1.kontrolujZostatok();
        ban2.kontrolujZostatok();
        ban3.kontrolujZostatok();
    }
}

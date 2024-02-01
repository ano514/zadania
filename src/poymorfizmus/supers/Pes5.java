package poymorfizmus.supers;

public class Pes5 extends Zviera5{
    void zerie() {System.out.println("žeria maso...");}
    void steka(){System.out.println("šteka....");}
    void zije(){
        super.zerie();
        steka();
    }
}

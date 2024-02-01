package poymorfizmus.supers;

public class Test2 {
    public static void main(String[] args) {
        Banka b = new Banka();
        Banka pb = new PostovaBanka();
        Banka tb = new TatraBanka();
        Banka jb = new JednaBanka();
        b.urok();
        pb.urok();
        tb.urok();
        jb.urok();
    }
}

package poymorfizmus.supers;

public class Test1 {
    public static void main(String[] args) {
        Banka b = new Banka();
        PostovaBanka pb= new PostovaBanka();
        JednaBanka jb= new JednaBanka();
        TatraBanka tb = new TatraBanka();
        b.urok();
        pb.urok();
        jb.urok();
        tb.urok();
    }
}

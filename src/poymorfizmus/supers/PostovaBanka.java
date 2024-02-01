package poymorfizmus.supers;

public class PostovaBanka extends Banka{
    double urokova_miera= 0.53;
    @Override
    void urok() {
        System.out.println(urokova_miera);

    }


}

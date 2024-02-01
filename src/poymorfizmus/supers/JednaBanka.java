package poymorfizmus.supers;

public class JednaBanka extends Banka{
    double urokova_miera=0.88;
    @Override
    void urok() {
        System.out.println(urokova_miera);

    }


}

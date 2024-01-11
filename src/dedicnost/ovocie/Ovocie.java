package dedicnost.ovocie;

public class Ovocie {
   private String nazov;
   private String farba;
   private int vaha;

    Ovocie(String naz,String far,int vah){
        nazov=naz;
        farba=far;
        vaha=vah;
    }

    public String getNazov() {
        return nazov;
    }

    public String getFarba() {
        return farba;
    }

    public int getVaha() {
        return vaha;
    }
}

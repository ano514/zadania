package dedicnost.jedlo;

public class Jedlo {
    private String jedlo;
    private int kalorie;
    private double tuk;

    Jedlo(String jedlo, int kalorie, double tuk){
        this.jedlo=jedlo;
        this.kalorie=kalorie;
        this.tuk=tuk;
    }
    public void vipis(){
        System.out.println("Jedlo"+" "+jedlo+"ma vlstnosti"+" "+kalorie+" "+tuk);
    }

}

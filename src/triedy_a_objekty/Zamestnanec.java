package triedy_a_objekty;

public class Zamestnanec {
    private int id;
    private String meno;
    private double výplata;

    public int getId() {
        return id;
    }

    public String getMeno() {
        return meno;
    }

    public double getVýplata() {
        return výplata;
    }

    public Zamestnanec(int i,String me,double vy){
        id = i;
        meno= me;
        výplata= vy;
    }

    public void vipis() {
        System.out.println(getId() + " " + getMeno() + " " + getVýplata()+" €");
    }

    public void inicializacia(int id,String meno,double výplata){
        this.id=id;
        this.meno=meno;
        this.výplata=výplata;

    }

}

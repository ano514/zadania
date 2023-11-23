package metody;

public class geterySetery {
    private int id;
    private String meno;

    public int getid(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getMeno(){
        return  meno;
    }
    public void setMeno(String meno){
        this.meno=meno;
    }
    public void zobraz(){
        System.out.println("ID: "+id);
        System.out.println("Meno študenta: "+meno);
    }

    public static void zobraz2(int cislo,String meno){
        System.out.println("ID: "+cislo);
        System.out.println("Meno študenta: "+meno);
    }
}

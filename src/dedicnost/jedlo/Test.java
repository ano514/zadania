package dedicnost.jedlo;

public class Test {
    public static void main(String[] args) {
        Jedlo j = new Jedlo("sir",2000,3.4);
        Ovocie o = new Ovocie("jablokovy kolac",55000,10.34,"ovocie","jablko","stromova");
        Rastlina r = new Rastlina("Ovocny punč",10000,2.5,"ovocie");
        ŽivocisniDruhPotraviny z= new ŽivocisniDruhPotraviny("Bavcova pecienka",500000,100,"Prasa");
        j.vipis();
        o.vipis2();
        r.vipis1();
        z.vipis1();
    }
}

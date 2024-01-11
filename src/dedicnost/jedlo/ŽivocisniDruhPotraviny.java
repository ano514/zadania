package dedicnost.jedlo;

public class ŽivocisniDruhPotraviny extends Jedlo{
    private String zabite_zviera;


    ŽivocisniDruhPotraviny(String jedlo, int kalorie, double tuk, String zabite_zviera) {
        super(jedlo, kalorie, tuk);
        this.zabite_zviera=zabite_zviera;
    }
    public void vipis1(){
        vipis();
        System.out.println(zabite_zviera);
    }
}

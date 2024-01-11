package dedicnost.ovocie;

public class Test {
    public static void main(String[] args) {
        Banan ban= new Banan("Banan","zlta",20,"zerele");
        Jablo jab= new Jablo("Cinske","zelene",21,50);
        Pomaranc pom= new Pomaranc("Pomaranc","oranzove",2,"Ameriky");
        System.out.println("Ovoce "+ban.getNazov()+" ma farbu "+ban.getFarba()+" ma vahu "+ban.getVaha()+" a je "+ban.getZrelost());
        System.out.println("Ovoce "+jab.getNazov()+" ma farbu "+jab.getFarba()+" ma vahu "+jab.getVaha()+" a ma odrodu "+jab.getOdroda());
        System.out.println("Ovoce "+pom.getNazov()+" ma farbu "+pom.getFarba()+" ma vahu "+pom.getVaha()+" a pochada z "+pom.getPovod());
    }

}

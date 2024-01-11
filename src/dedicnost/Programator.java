package dedicnost;

class Programator extends Zamestnanec {
    int bonus=300;
    public static void main(String args[]){
        Programator p = new Programator();
        System.out.println("Vyplata programator je: "+p.vyplata);
        System.out.println("Nonus pre programatora je: "+p.bonus);
    }
}

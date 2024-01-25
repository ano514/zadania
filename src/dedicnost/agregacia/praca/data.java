package dedicnost.agregacia.praca;

public class data {
    zamestnanci za;
    String mesto;
    String stat;
    String kontinent;
    data(int id, String meno, String mesto, String stat, String kontinent ){
        za= new zamestnanci(id,meno);
        this.mesto=mesto;
        this.stat=stat;
        this.kontinent=kontinent;


    }

    public void zobrazit(){
        System.out.println(za.id+" "+za.meno+" "+mesto+" "+stat+" "+kontinent);
    }
}

package dedicnost.ovocie;

import dedicnost.Zviea;

class Jablo extends Ovocie {
    private int odroda;

    Jablo(String naz,String far,int vah,int odroda){
        super(naz,far,vah);
        this.odroda=odroda;
    }

    public int getOdroda() {
        return odroda;
    }
}

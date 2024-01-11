package dedicnost.ovocie;

class Pomaranc extends Ovocie {
    private String povod;

    Pomaranc(String naz,String far,int vah,String povod){
        super(naz,far,vah);
        this.povod=povod;
    }

    public String getPovod() {
        return povod;
    }
}

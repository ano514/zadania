package dedicnost.ovocie;

class Banan extends Ovocie {
    private String  zrelost;

    Banan (String naz,String far,int vah,String zrelost){
        super(naz,far,vah);
        this.zrelost=zrelost;
    }

    public String getZrelost() {
        return zrelost;
    }
}

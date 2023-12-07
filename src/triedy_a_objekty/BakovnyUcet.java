package triedy_a_objekty;

public class BakovnyUcet {

   private int cislo_uctu;
   private String meno;
   private  double mnozstvo;

   public BakovnyUcet(int cislo,String me, double mnoz){
       cislo_uctu=cislo;
       meno=me;
       mnozstvo=mnoz;
   }

   public void naplnUcet(int cislo_uctu,String meno, double mnozstvo){
       this.cislo_uctu=cislo_uctu;
       this.meno=meno;
       this.mnozstvo=mnozstvo;

   }
   public void kontrolujZostatok(){
       System.out.println(mnozstvo+" €");
   }

   public void vloz(double kolko){
       mnozstvo+=kolko;
       System.out.println("Vlozene "+kolko+" €");
   }

   public void vyber(double kolko){
       if (kolko<=mnozstvo){
           mnozstvo-=kolko;
           System.out.println("vybrate "+kolko+" €");
       }
       else {
           System.out.println("Na ucte nemate dost penazi na vyber tejto sumi");
       }
   }
}

package polia;


public class VipisPolee {
    static void vypisPole(int pole[]){
        for (int p:pole){
            System.out.println(p);
        }
    }
    public static void main(String args[]) {
        vypisPole(new int []{33,2,3});
    }
}

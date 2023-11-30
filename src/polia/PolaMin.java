package polia;

public class PolaMin {
    public static void main(String args[]) {
        int a[]={31,2,6,4};
        min(a);
    }

    static void min(int pole[]){
        int min = pole[0];
        for (int i=1;i< pole.length;i++){
            if(min>pole[i])
                min=pole[i];
            System.out.println(min);
        }
    }
}

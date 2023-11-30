package polia;

public class ViacPole {
    public static void main(String args[]) {
        int pole[][]={{1,2,3},{2,4,5},{4,4,5}};

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(pole[i][j]+" ");
            }
            System.out.println();
        }

    }
}

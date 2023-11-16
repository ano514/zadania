package metody;

public class parne_neparne2 {

        public static void Parne_alebo_nie(int cislo){
            if(cislo%2==0){
                System.out.println("cislo je prane");
            }
            else{
                System.out.println("Cislo je neprane");
            }

        }

        public String hladaj(int cislo) {
            if (cislo % 2 == 0) {
                return  "cislo je prane";
            } else {
                return "Cislo je neprane";
            }
        }
}

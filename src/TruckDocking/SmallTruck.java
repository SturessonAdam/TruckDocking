package TruckDocking;

import java.util.Scanner;

public class SmallTruck {
    private final int weight;
    private SmallTruck(int weight){
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Lätt lastbil [" + weight + "kg]";
    }
    public static void SmallTruckOption(Scanner scanner, Avlastningsstation avlastningsstation){
        System.out.println("Vikt på lätt skåpbil: ");
        int weightOnSmallTruck = scanner.nextInt();
        SmallTruck smallTruckOption = new SmallTruck(weightOnSmallTruck);
        if(avlastningsstation.ParkeringC.isEmpty()){
            avlastningsstation.ParkeringC.add(smallTruckOption.toString());
            System.out.println("Lätt lastbil registrerad för kaj C, återvänd till huvudmeny");
        } else if (avlastningsstation.ParkeringD.isEmpty()) {
            avlastningsstation.ParkeringD.add(smallTruckOption.toString());
            System.out.println("Lätt lastbil registrerad för kaj D, återvänd till huvudmeny");
        } else if (weightOnSmallTruck < 5000 && avlastningsstation.ParkeringA.isEmpty()) {
            avlastningsstation.ParkeringA.add(smallTruckOption.toString());
            System.out.println("Lätt lastbil registrerad för kaj A, återvänd till huvudmeny");
        } else System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest");
    }
}

package TruckDocking;

import java.util.Scanner;

public class HeavyTruck extends Vehicle {
   public HeavyTruck (int weight) {
       super(weight);
   }
    @Override
    public String toString() {
        return "Tung lastbil [" + weight + "kg]";
    }
    public static void HeavyTruckOption(Scanner scanner, Avlastningsstation avlastningsstation){
        System.out.println("Vikt på tung lastbil: ");
        int weightOnHeavyTruck = scanner.nextInt();
        HeavyTruck heavyTruckOption = new HeavyTruck(weightOnHeavyTruck);
        if(avlastningsstation.ParkeringE.isEmpty()){
            avlastningsstation.ParkeringE.add(heavyTruckOption.toString());
            System.out.println("Tung lastbil registrerad för kaj E, återvänd till huvudmeny");
        } else if (weightOnHeavyTruck < 9000 && avlastningsstation.ParkeringD.isEmpty()) {
            avlastningsstation.ParkeringD.add(heavyTruckOption.toString());
            System.out.println("Tung lastbil registrerad för kaj D, återvänd till huvudmeny");
        } else System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest");
    }
}

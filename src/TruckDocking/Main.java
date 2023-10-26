package TruckDocking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Avlastningsstation avlastningsstation = new Avlastningsstation();

        boolean menuStillGoing = true;
        while (menuStillGoing) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n- Avlastningsstationen dumpa mera -\n [1] - Se parkerade lastbilar\n [2] - Registrera ny avlastande lastbil\n [3] - Avsluta");

            String menuchoice = scanner.nextLine();

            if(menuchoice.equals("1")) {
                avlastningsstation.printList();

            } else if (menuchoice.equals("2")) {

                System.out.println("Typ av lastbil:\n - [1]Skåpbil\n - [2]Lätt lastbil\n - [3]Tung lastbil\n");
                String menuchoice2 = scanner.nextLine();
                switch (menuchoice2) {
                    case "1":
                        Van.vanOption(scanner, avlastningsstation);
                        break;
                    case "2":
                        SmallTruck.SmallTruckOption(scanner, avlastningsstation);
                        break;
                    case "3":
                        HeavyTruck.HeavyTruckOption(scanner, avlastningsstation);
                        break;
                }
            } else if (menuchoice.equals("3")) {
                System.out.println("Meny klar, hejdå!");
                menuStillGoing = false;
            }
            else { System.out.println("Ange ett giltligt menyval!");}


        }
    }
}

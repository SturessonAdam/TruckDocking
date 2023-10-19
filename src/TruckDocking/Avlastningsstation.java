package TruckDocking;

import java.util.ArrayList;
public class Avlastningsstation {
    ArrayList<String> ParkeringA = new ArrayList<>();
    ArrayList<String> ParkeringB = new ArrayList<>();
    ArrayList<String> ParkeringC = new ArrayList<>();
    ArrayList<String> ParkeringD = new ArrayList<>();
    ArrayList<String> ParkeringE = new ArrayList<>();

    public void printList() {
        if (!ParkeringA.isEmpty()) {
            System.out.print("A: ");
            printParking(ParkeringA);
        }
        if (!ParkeringB.isEmpty()) {
            System.out.print("B: ");
            printParking(ParkeringB);
        }
        if (!ParkeringC.isEmpty()) {
            System.out.print("C: ");
            printParking(ParkeringC);
        }
        if (!ParkeringD.isEmpty()) {
            System.out.print("D: ");
            printParking(ParkeringD);
        }
        if (!ParkeringE.isEmpty()) {
            System.out.print("E: ");
            printParking(ParkeringE);
        }
    }
    private void printParking(ArrayList<String> parking) {
        for (String vehicle : parking) {
            System.out.println(vehicle);
        }
    }
}


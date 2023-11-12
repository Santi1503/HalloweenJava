import children.ManageChildren;
import houses.ManageHouses;

import java.util.Scanner;

public class Halloween {
    private int minute = 1;
    private int openingTime = 9 * 60;
    private int closingTime = 21 * 60;
    public boolean withinTheSchedule(){
        int minutesNight = closingTime - openingTime;

        if (this.minute <= minutesNight){
            return true;
        }
        return false;
    }
    public void start(){
        ManageHouses houses = new ManageHouses();
        ManageChildren queue = new ManageChildren();

        houses.addHouse("Casa1", 100);

        Scanner scanner = new Scanner(System.in);

        while (withinTheSchedule()){
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("Minuto " + minute + " - ");

            double childArrivalProbability = Math.random() * 100;
            if (childArrivalProbability <= 60) {
                queue.addChild();
                System.out.print("Llega 1 niño - ");
            } else {
                System.out.print("No llega nadie - ");
            }

            /*if(houses.freeHouse() && queue.isEmpty()){
                house.serveChild(queue.firstAmountCandy());

                queue.deleteFirstChildrenInQueue();
            }*/

            System.out.println("Niños en cola: " + queue.size());


            houses.listHouses();

            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("Enter para siguiente minuto, 'q' para salir:");

            String input = scanner.nextLine();
            if ("q".equals(input.toLowerCase())){
                break;
            }
            minute++;
        }




    }
}

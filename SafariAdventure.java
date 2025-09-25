import java.util.Scanner;

public class SafariAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPoints = 0;
        int days = 5;

        System.out.println("Welcome, Explorer!");
        System.out.println("You have 5 days on safari. Survive and gather at least 100 points.\n");

        for (int day = 1; day <= days; day++) {
            System.out.println("Day " + day + ":");
            String area = "";

            // Input validation
            while (true) {
                System.out.print("Choose an area to explore (Jungle, River, Desert, Mountains): ");
                area = sc.nextLine();

                if (area.equalsIgnoreCase("Jungle") ||
                    area.equalsIgnoreCase("River") ||
                    area.equalsIgnoreCase("Desert") ||
                    area.equalsIgnoreCase("Mountains")) {
                    break;
                } else {
                    System.out.println("That area is not on the map. Try again.");
                }
            }

            System.out.println("\nHeading into the " + area + "...\n");

            switch (day) {
                case 1:
                    System.out.println("Event 1: You noticed a flock of parrots.");
                    System.out.println("(Interesting, but no resources gained.)\n");
                    System.out.println("Event 2: You gathered firewood. (+10 points)\n");
                    totalPoints += 10;
                    System.out.println("Event 3: A charging elephant blocks your path!");
                    System.out.print("Type 'run' to escape: ");
                    String choice1 = sc.nextLine();
                    if (choice1.equalsIgnoreCase("run")) {
                        System.out.println("You escaped quickly. The day ends early.\n");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("Event 1: You found some fresh fruit. (+25 points)\n");
                    totalPoints += 25;
                    System.out.println("Event 2: You discovered a bow and arrow. (+30 points)\n");
                    totalPoints += 30;
                    System.out.println("You have gathered enough supplies for today. Returning to camp.\n");
                    break;

                case 3:
                    System.out.println("Event 1: You noticed a flock of parrots.");
                    System.out.println("(Interesting, but no resources gained.)\n");
                    System.out.println("Event 2: You discovered a bow and arrow. (+30 points)\n");
                    totalPoints += 30;
                    System.out.println("Event 3: You gathered firewood. (+10 points)\n");
                    totalPoints += 10;
                    break;

                case 4:
                    System.out.println("Event 1: You found some fresh fruit. (+25 points)\n");
                    totalPoints += 25;
                    System.out.println("Event 2: A charging elephant blocks your path!");
                    System.out.print("Type 'run' to escape: ");
                    String choice2 = sc.nextLine();
                    if (!choice2.equalsIgnoreCase("run")) {
                        System.out.println("You hesitated! Luckily it moved on, but your day is over.\n");
                        break;
                    }
                    break;

                case 5:
                    System.out.println("Event 1: You gathered firewood. (+10 points)\n");
                    totalPoints += 10;
                    System.out.println("Event 2: You discovered a bow and arrow. (+30 points)\n");
                    totalPoints += 30;
                    System.out.println("You have gathered enough supplies for today. Returning to camp.\n");
                    break;
            }

            System.out.println("Day " + day + " Summary: " + totalPoints + " points collected so far.");
            System.out.println("-----------------------------------\n");
        }

        System.out.println("Safari Complete!");
        System.out.println("Total points: " + totalPoints);
        if (totalPoints >= 100) {
            System.out.println("You survived and successfully completed the expedition!");
        } else {
            System.out.println("You didn’t collect enough resources. The expedition failed.");
        }

        sc.close();
    }
}

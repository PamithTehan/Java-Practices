import java.util.Scanner;

public class MadLibs_Game {
    public static void main(String[] args) {
        String adjective1;
        String adjective2;
        String verb1;
        String verb2;
        String verb3;
        String verb4;
        String noun1;
        String noun2;
        String noun3;
        String noun4;
        String noun5;
        String noun6;
        String noun7;
        String noun8;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter adjective 1 (describe about day): ");
        adjective1 = sc.nextLine();
        System.out.println("Enter adjective 2 (describe about food): ");
        adjective2 = sc.nextLine();
        System.out.println("Enter noun 1 (type of bird): ");
        noun1 = sc.nextLine();
        System.out.println("Enter noun 2 (room in a house): ");
        noun2 = sc.nextLine();
        System.out.println("Enter verb 1 (past tense): ");
        verb1 = sc.nextLine();
        System.out.println("Enter verb 2 : ");
        verb2 = sc.nextLine();
        System.out.println("Enter noun 3 (relative's name): ");
        noun3 = sc.nextLine();
        System.out.println("Enter noun 4 (something fresh): ");
        noun4 = sc.nextLine();
        System.out.println("Enter noun 5 (a liquid):");
        noun5 = sc.nextLine();
        System.out.println("Enter verb 3 (verb ending in -ing): ");
        verb3 = sc.nextLine();
        System.out.println("Enter noun 6 (plural & part of body): ");
        noun6 = sc.nextLine();
        System.out.println("Enter noun 7 (plural):");
        noun7 = sc.nextLine();
        System.out.println("Enter verb 4 (verb ending in -ing)");
        verb4 = sc.nextLine();
        System.out.println("Enter noun 8:");
        noun8 = sc.nextLine();

        sc.close();

        System.out.println("\nIt was a " + adjective1 + ", cold November day." +
                "I\nwoke up to the " + adjective2 + " Smell of " +noun1 + " roasting\nin the "+ noun2 +
                " downstairs. I " + verb1 + "\ndown the stairs to see if I could help " + verb2 + "\nthe dinner." +
                "My mom said See if " + noun3 +" needs a fresh " + noun4 + ".\nSo I carried a tray of glasses full of " +
                noun5 + " into\nthe "+ verb3 +" room. When I got there, I couldn't\nbelieve my " + noun6 + "! There were" +
                noun7 + "\n" + verb4 + " on the " + noun8 + "!");
    }
}

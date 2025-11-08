import java.util.Scanner;
import java.util.Random;

public class Number_Guessing {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int min;
        int max;
        int attempts = 0 ;
        int guess;
        int randomNumber;

        System.out.print("Enter the lower bound of guessing range: ");
        min = sc.nextInt();
        System.out.print("Enter the upper bound of guessing range: ");
        max = sc.nextInt();
        System.out.println("\n");

        randomNumber = rand.nextInt(min, max);

        do{
            System.out.print("Enter the guess number: ");
            guess = sc.nextInt();
            attempts ++;

            if(guess < randomNumber){
                System.out.println("Your guess is too low!");
            }
            else if(guess > randomNumber){
                System.out.println("Your guess is too high!");
            }
            else {
                System.out.println("\nYour guess is correct!");
                System.out.println("Your guess count: " + attempts);
            }
        }while (randomNumber != guess);

        sc.close();
    }
}

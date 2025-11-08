import java.util.Scanner;

public class Shopping_Cart {
    public static  void main(String[] args) {
        String item;
        double price;
        int quantity;

        Scanner sc = new Scanner(System.in);

        System.out.println("What item do you want to buy?: ");
        item = sc.nextLine();
        System.out.println("What is price for each ?: ");
        price = sc.nextDouble();
        System.out.println("What is quantity would you want ?: ");
        quantity = sc.nextInt();

        sc.close();

        if (quantity == 1) {
            System.out.println("\nYour shopping cart is: 1 "  +item);
        }
        else{
            System.out.println("\nYour shopping cart is: " + quantity + " " +item + "s"  );
        }
        System.out.println("Your total is : " + (quantity * price) + " $");
    }

}

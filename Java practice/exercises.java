import java.util.Scanner;

public class exercises {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Exercise 1 : calculating purchase of an item
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;
        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();
        System.out.print("What is the price? ");
        price = scanner.nextDouble();
        System.out.print("What is the quantity? ");
        quantity = scanner.nextInt();
        total = price * quantity;
        System.out.println("Total price for " + quantity + " " + item + "/s" + " is " + total + currency);


        scanner.close();
    }
    
}

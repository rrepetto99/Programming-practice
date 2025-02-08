import java.util.Scanner;
public class exercises {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Exercise 1 : calculating purchase of an item
        // String item;
        // double price;
        // int quantity;
        // char currency = '$';
        // double total;
        // System.out.print("What item would you like to buy? ");
        // item = scanner.nextLine();
        // System.out.print("What is the price? ");
        // price = scanner.nextDouble();
        // System.out.print("What is the quantity? ");
        // quantity = scanner.nextInt();
        // total = price * quantity;
        // System.out.println("Total price for " + quantity + " " + item + "/s" + " is " + total + currency);

        // Exercise 2: odd or even number
        // double number;
        // System.out.print("Enter the number: ");
        // number = scanner.nextDouble();
        // if(number%2==0){
        //     System.out.println("Your number is an even number!");
        // }else{
        //     System.out.println("Your number is an odd number!");
        // }

        // Exercise 3: Simple Calculator
        // System.out.print("Enter number 1: ");
        // double number1 = scanner.nextDouble();
        // System.out.print("Enter number 2: ");
        // double number2 = scanner.nextDouble();
        // System.out.print("Enter operator: ");
        // char operator = scanner.next().charAt(0);
        // switch(operator) {
        //     case '+':
        //         System.out.println(number1 + number2);
        //         break;
        //     case '-':
        //         System.out.println(number1 - number2);
        //         break;
        //     case '*':
        //         System.out.println(number1 * number2);
        //         break;
        //     case '/':
        //         System.out.println(number1/number2);
        //         break;
        //     default:
        //         System.out.println("Invalid");
        // }

        // Exercise 4: Sum of Natural Numbers
        // System.out.print("Enter the upper bound n: ");
        // double n = scanner.nextDouble();
        // int sum = 0;
        // for (int i = 1; i <= n; i++){
        //     sum+=i;
        // }
        // System.out.println(sum);
        // double result = (n*(n+1))/2 ; // mathematical method
        // System.out.println(result);

        // Exercise 5: Factorial of a Number
        // System.out.print("Enter the number!");
        // int number = scanner.nextInt();
        // int m = 1;
        // for(int i = 1; i <= number; i++){
        //     m = m*i;
        // }
        // System.err.println(m);
  
        // Exercise 6: Fibonacci Series
        // System.out.print("Enter number of terms of fibonacci sequence: ");
        // int N = scanner.nextInt(); // length of loop
        // int n1 = 0, n2=1;
        // for(int i = 1; i<=N; i++){
        //     System.out.print(n1 + " ");
        //     int n3 = n1 + n2;
        //     n1 = n2;
        //     n2 = n3;
        // }

        // Exercise 7: Reverse a String
        // System.out.print("Write: ");
        // String input = scanner.nextLine();
        // String r = "";
        // char ch;
        // for(int i = 0; i < input.length(); i++){
        //     ch = input.charAt(i);
        //     r = ch + r;
        // }
        // System.out.print(r);

        scanner.close();
    }   
   
}
 

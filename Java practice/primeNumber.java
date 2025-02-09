import java.util.Scanner;
public class primeNumber {
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i = 2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    // public static void main(String[] args) {
    //     if(isPrime(-1)){
    //         System.out.println("It's a prime number");
    //     }else{
    //         System.out.println("It's not a prime number");
    //     }
    // }
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            if(isPrime(n)){
                System.out.println("It's a prime number");
            }else{
                System.out.println("It's not a prime number");
            }
            scanner.close();
        }  
    }
}

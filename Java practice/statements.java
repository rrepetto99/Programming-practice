import java.util.Scanner;
public class statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // if statement exercise on salary
        String name;
        int age;
        int retirement;
        int salary;
        double tax1 = 0.2;
        double tax2 = 0.25;
        double tax3 = 0.3;
        double socialTaxEmployee = 0.105;
        double socialTaxEmployer = 0.235;
        char currency = '£';

        System.err.print("Enter your name: ");
        name = scanner.nextLine();
        System.err.print("What is your age: ");
        age = scanner.nextInt();
        System.err.print("Enter your monthly salary: ");
        salary = scanner.nextInt();
        retirement = 65 - age;
        double totalSocialContribution = salary*(socialTaxEmployee+socialTaxEmployer);
        double roundOff = Math.round(totalSocialContribution*100)/100; // we are rounding with 2 decimals.

        if (name.isEmpty()){
            System.out.println("You didn't enter your name! ");
        } else{
            System.out.println("Hello, " + name + "!");
        }

        if(age >= 65){
            System.out.println("You're retired.");
        }else if(age < 65){
            System.out.println("You're at your working age. Your retirement will come in " + retirement + " years.");
        }

        if(salary<2000){
            System.out.print("Your income tax is " + salary*tax1 + currency + " and social contribution is " + roundOff + currency);
        }else if(salary>=2000 && salary<5000){
            System.out.print("Your income tax is " + salary*tax2 + currency + " and social contribution is " + roundOff + currency);
        }else if(salary>=5000){
            System.out.print("Your income tax is " + salary*tax3 + currency + " and social contribution is " + roundOff + currency);
        }

        scanner.close();
    }
}

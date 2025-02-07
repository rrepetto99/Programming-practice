import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // receives inputs

        // System.out.print("Enter your name: "); // we add input
        // String name = scanner.nextLine();
        // System.out.print("Enter your nationality: "); 
        // String nationality = scanner.nextLine();
        // System.out.print("Enter your age: "); 
        // int age = scanner.nextInt();
        // System.out.print("Enter your height: "); 
        // double height = scanner.nextDouble();
        // System.out.print("Do you live in Lugano? (true/false): ");
        // boolean lugano =  scanner.nextBoolean();
        // System.out.println("Hello, " + name + "! You are " + nationality + "! ");
        // System.out.print("You are " + age + " old! ");
        // System.out.println("You are " + height + "m tall!");
        // if(lugano){
        //     System.out.println("Lugano is beautiful");
        // }else{
        //     System.out.println("No comment.");
        // }

        // Exercise: calculate Area of rectangle
        // double width = 0;
        // double height = 0;
        // double area = 0;
        // System.out.print("Enter your width: ");
        // width = scanner.nextDouble();
        // System.out.print("Enter your height: ");
        // height = scanner.nextDouble();
        // area = width*height;
        // System.out.println("Your rectangle's area is " + area);


        // Exercise: calculate Area of circle
        // double radius = 0;
        // double pi = 3.14;
        // double areaCircle = 0;
        // System.out.print("Enter your radius: ");
        // radius = scanner.nextDouble();
        // areaCircle = pi * Math.pow(radius,2);
        // System.out.println("Are of circle is : " + areaCircle);


        // MAD Libs Game 
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective2= scanner.nextLine();
        System.out.print("Enter a verb ending with -ing: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective3 = scanner.nextLine();
        System.out.print("Today I went to a " + adjective1 + " city. ");
        System.out.print("Its name was " + noun1 + ". ");
        System.out.print(noun1 + " was a very " + adjective2 + " and had many cars " + verb1);
        System.out.println(". I felt " + adjective3 + " when I returned home.");

        scanner.close();
    }
}

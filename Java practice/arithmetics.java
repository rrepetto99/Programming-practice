import java.util.Scanner;
public class arithmetics {

    public static void main(String[] args) {
        
        // Some arithmetics
        // int x = 18;
        // int y = 5;
        // int z;
        // z = x+y;
        // System.out.println(z);

        //Augmented Assignment Operators
        //x += y;
        //x -= y;
        //x *= y;
        // x /= y;
        // x %= y;

        // Incremend and Decrement Operators
        // int x = 1;
        // x++;
        // x++;
        // x--;
        // System.out.println(x);

        // Order of Operation [P-E-N-D-A-S]
        // double result = 2*4 + 7 -(9-2) / 4.3;
        // System.out.println(result);

        //random numbers
        // Random random = new Random();
        // int number1;
        // int number2;
        // int number3;
        // double number4;
        // boolean isSwiss;
        // number1  = random.nextInt(1,87);
        // number2  = random.nextInt(1,87);
        // number3  = random.nextInt(1,87);
        // number4  = random.nextDouble(1,87);
        // isSwiss  = random.nextBoolean();
        // System.out.println(number1);
        // System.out.println(number2);
        // System.out.println(number3);
        // System.out.println(number4);
        // if(isSwiss){
        //     System.out.println("You come from CH.");
        // }else{
        //     System.out.println("You are foreigner.");
        // }
        
        // Mathematical operations 
        // System.out.println(Math.PI);
        // System.out.println(Math.E);
        // double result;
        // result = Math.pow(2, 7);
        // result = Math.abs(-8);
        // result = Math.sqrt(9);
        // result = Math.round(3.14);
        // result = Math.ceil(3.14);
        // result = Math.floor(3.14);
        // result = Math.max(33, 34);
        // System.out.println();

        
        Scanner scanner = new Scanner(System.in);
        // Pythagora theorem
        // double a;
        // double b;
        // double c;
        // System.out.print("Enter a: ");
        // a = scanner.nextDouble();
        // System.out.print("Enter b: ");
        // b = scanner.nextDouble();
        // c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        // System.out.println(c + "cm");

        // Circle
        double radius;
        double area;
        double circumference;
        double volume;
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2*Math.PI*radius;
        area = Math.PI*Math.pow(radius, 2);
        volume = (4/3)*Math.PI*Math.pow(radius,3);

        System.out.printf("The circumference is %.2fcm\n",circumference);
        System.out.printf("The area is %.2fcm^2\n",area);
        System.out.printf("The volume is %.2fcm^3\n",volume);

        scanner.close();

    }
    
}

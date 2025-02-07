import java.util.Random;

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
        Random random = new Random();
        int number1;
        int number2;
        int number3;
        double number4;
        boolean isSwiss;
        number1  = random.nextInt(1,87);
        number2  = random.nextInt(1,87);
        number3  = random.nextInt(1,87);
        number4  = random.nextDouble(1,87);
        isSwiss  = random.nextBoolean();
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        if(isSwiss){
            System.out.println("You come from CH.");
        }else{
            System.out.println("You are foreigner.");
        }
        
    }
    
}

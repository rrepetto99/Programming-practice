
public class Main{
    public static void main(String[] args) {
        
        // First Java code for me
        
        // System.out.println("Hello World!");
        // System.out.println("I like meringhatta in Ponte Tresa!");
        // System.out.println("I enjoy Lugano!");
        

        // Variables
        int age = 25;
        double rate = 1.05;
        char grade = 'A';
        double growth = age * rate;
        
        System.out.println(growth + " " + grade + " rated Security");

        boolean isSwiss = true;
        boolean isItalian = false;

       
        // if(isSwiss){
        //     System.out.println("Hop Schwiiz!");
        // }else{
        //     System.out.println("Viva Italia!");
        // }

        // Strings

        String name = "Rolands";
        String school = "USI";
        String city = "Lugano";

        System.out.println("Hello " + name + "!" + " You are a student at " + school + " .");
        System.out.println("You, " + name + ", are living in " + city);
        System.out.println("Your age is " + age + " and your grade is " + grade + ".");

        System.out.println("Your total return could be: " + Math.pow(rate, age)); //power property


        if(isSwiss){
            System.out.println("Your total return could be: " + Math.pow(rate, age)); 
        }else{
            System.out.println("Your total return could be: " + Math.pow(1.02, age)); 
        }

    }

}



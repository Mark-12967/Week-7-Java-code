import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter your code here.  Note that this code is currently unrunnable.
        
        System.out.print("Input: ");
        double a = input.nextDouble();
        System.out.print("Input: ");
        double b = input.nextDouble();
        System.out.print("Input: ");
        double c= input.nextDouble();
        

        double discriminant = b * b - 4 * a * c;
        
        double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = ( - b - Math.sqrt(discriminant)) / (2 * a);
       
        System.out.println("x1 = " + x1 +" and x2 = " + x2);

        input.close();
    }
}

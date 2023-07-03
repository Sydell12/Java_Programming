package Chapter2; //For exercise 2.5
import java.util.Scanner;
public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of the side: ");
        double length = input.nextDouble();

        input.close();
        
        double area = 2.598 * length * length;

        System.out.println("The area of the Hexagon is " + area);
    } 
}

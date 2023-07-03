package Chapter2; //For exercise2.1
import java.util.Scanner;
public class ComputeVolume {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner input = new Scanner(System.in);
        //promt user to enter the input
        System.out.print("Enter the radius and length of a cylinder: ");
        //input radius
        double radius = input.nextDouble();      
        //input length
        double length = input.nextDouble();
        input.close();
        //compute area and volume
        double area = radius * radius * 3.14;
        double volume = area * length;
        //display area and volume
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}

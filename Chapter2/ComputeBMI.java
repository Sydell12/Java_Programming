package Chapter2; //For exercise 2.3
import java.util.Scanner;
public class ComputeBMI {
    public static void main(String[] args) {
        //Create a scanner object 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        input.close();

        double BMI = weight / (height * height) * 703.0695796;

        System.out.println("BMI is " + BMI);
    }
    
}

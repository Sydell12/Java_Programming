package Chapter2;   //For exercise 2.4
import java.util.Scanner;
public class CostOfDriving {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double MperG = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double PperG = input.nextDouble();

        input.close();

        double cost = (distance / MperG) * PperG;

        System.out.println("The cost of driving is $" + cost);
    }
    
}
